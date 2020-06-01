package com.alexjw.siegecraft.server.data;

import com.alexjw.siegecraft.server.entity.EntityCamera;
import com.alexjw.siegecraft.server.entity.EntityDrone;
import com.alexjw.siegecraft.server.entity.operator.EntityDummy;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.operators.Operator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SiegeData {
    public static HashMap<EntityPlayer, Integer> viewingCamera = new HashMap<>();
    public static HashMap<EntityPlayer, Integer> timeDroning = new HashMap<EntityPlayer, Integer>();
    public static HashMap<EntityPlayer, Integer> lastJump = new HashMap<EntityPlayer, Integer>();
    public static HashMap<EntityPlayer, EntityDrone> drones = new HashMap<>();
    public static HashMap<EntityPlayer, EntityDummy> dummies = new HashMap<>();
    public static SiegeTeam teamA = null;
    public static SiegeTeam teamB = null;
    public static int roundNumber = 0;
    public static ArrayList<BlockPos> cameraBlocks = new ArrayList<BlockPos>();
    private static Random random = new Random();
    private static ArrayList<EntityCamera> cameras = new ArrayList<EntityCamera>();
    private static boolean gameSetup = false;


    public static void roundInitPlayer(EntityPlayer entityPlayer, Operator operator) {

    }

    public static void gameStart(World world) {
        teamA = new SiegeTeam();
        teamB = new SiegeTeam();
        for (EntityPlayer entityPlayer : world.playerEntities) {
            if (entityPlayer != null) {
                if (teamA.getPlayers().size() > teamB.getPlayers().size()) {
                    teamB.addPlayer(new SiegePlayer(entityPlayer));
                } else if (teamA.getPlayers().size() < teamB.getPlayers().size()) {
                    teamA.addPlayer(new SiegePlayer(entityPlayer));
                } else if (teamB.getPlayers().size() == teamA.getPlayers().size()) {
                    int coinFlip = random.nextInt(2);
                    if (coinFlip == 0) {
                        teamB.addPlayer(new SiegePlayer(entityPlayer));
                    } else {
                        teamA.addPlayer(new SiegePlayer(entityPlayer));
                    }
                }
            }
        }
        teamA.setTeam(Operator.Team.ATTACKER);
        teamB.setTeam(Operator.Team.DEFENDER);
        roundStart(world);
    }

    public static void roundStart(World world) {
        ArrayList<Operator> takenOperators = new ArrayList<>();

        cameras = (ArrayList<EntityCamera>) world.getEntities(EntityCamera.class, EntitySelectors.IS_ALIVE);
        for (SiegePlayer siegePlayer : teamA.getPlayers()) {
            if (teamA.getTeam().equals(Operator.Team.ATTACKER)) {
                Operator operator;
                do {
                    operator = SiegeHelper.getRandomAttacker();
                } while (takenOperators.contains(operator));
                takenOperators.add(operator);
                siegePlayer.setOperator(operator);
            } else {
                Operator operator;
                do {
                    operator = SiegeHelper.getRandomDefender();
                } while (takenOperators.contains(operator));
                takenOperators.add(operator);
                siegePlayer.setOperator(operator);
            }
        }
        for (SiegePlayer siegePlayer : teamB.getPlayers()) {
            if (teamB.getTeam().equals(Operator.Team.ATTACKER)) {
                Operator operator;
                do {
                    operator = SiegeHelper.getRandomAttacker();
                } while (takenOperators.contains(operator));
                takenOperators.add(operator);
                siegePlayer.setOperator(operator);
            } else {
                Operator operator;
                do {
                    operator = SiegeHelper.getRandomDefender();
                } while (takenOperators.contains(operator));
                takenOperators.add(operator);
                siegePlayer.setOperator(operator);
            }
        }
    }

    public static void roundCleanup() {
        clearTeam(teamA);
        clearTeam(teamB);
    }

    private static void clearTeam(SiegeTeam teamB) {
        for (SiegePlayer siegePlayer : teamB.getPlayers()) {
            if (siegePlayer.getPlayerDummy() != null) siegePlayer.getPlayerDummy().setDead();
            if (siegePlayer.getPlayerDrone() != null) siegePlayer.getPlayerDrone().setDead();
            siegePlayer.clearDummy();
            siegePlayer.clearDrone();
            if (siegePlayer.getOperator() != null) siegePlayer.setOperator(null);
            siegePlayer.getEntityPlayer().inventory.clear();
            siegePlayer.getEntityPlayer().getActivePotionEffects().clear();
            siegePlayer.getEntityPlayer().setHealth(20f);
        }
    }

    public static SiegeTeam getTeam(EntityPlayer entityPlayer) {
        if (teamA.getEntityPlayers().contains(entityPlayer)) {
            return teamA;
        } else if (teamB.getEntityPlayers().contains(entityPlayer)) {
            return teamB;
        } else {
            return null;
        }
    }

    public static boolean isGameSetup() {
        return gameSetup;
    }

    public static void setGameSetup(boolean gameSetup) {
        SiegeData.gameSetup = gameSetup;
    }

    public static void addCamera(EntityCamera entityCamera) {
        cameras.add(entityCamera);
    }

    public static ArrayList<EntityCamera> getCameras() {
        return cameras;
    }
}
