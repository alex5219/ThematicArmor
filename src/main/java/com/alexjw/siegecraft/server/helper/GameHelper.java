package com.alexjw.siegecraft.server.helper;

import com.alexjw.siegecraft.server.data.SiegePlayer;
import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;

public class GameHelper {
    /**
     * TODO:
     * Change String to Operator once it's available.
     */
    public static ArrayList<SiegePlayer> TeamA = new ArrayList<>(); // Team A - Starts as attackers
    public static ArrayList<SiegePlayer> TeamB = new ArrayList<>(); // Team B - Starts as defenders
    /**
     * Score is first to 3
     */
    public static final int scoreA = 0;
    public static final int scoreB = 0;
    public static final int roundNumber = 1;

    public static void init(EntityPlayer entityPlayer) {
        TeamA = getTestPlayers(entityPlayer);
        TeamB = getTestPlayers(entityPlayer);
    }

    public static ArrayList<SiegePlayer> getTestPlayers(EntityPlayer entityPlayer) {
        ArrayList<SiegePlayer> siegePlayers = new ArrayList<>();

        SiegePlayer testPlayer1 = new SiegePlayer(entityPlayer);
        SiegePlayer testPlayer2 = new SiegePlayer(entityPlayer);
        SiegePlayer testPlayer3 = new SiegePlayer(entityPlayer);
        SiegePlayer testPlayer4 = new SiegePlayer(entityPlayer);
        SiegePlayer testPlayer5 = new SiegePlayer(entityPlayer);
        siegePlayers.add(testPlayer1);
        siegePlayers.add(testPlayer2);
        siegePlayers.add(testPlayer3);
        siegePlayers.add(testPlayer4);
        siegePlayers.add(testPlayer5);
        return siegePlayers;
    }

    public static void playerDeath(EntityPlayer entityPlayer) {
        SiegePlayer playerDead = new SiegePlayer(entityPlayer);
        if (TeamA.contains(playerDead)) {
            for (SiegePlayer siegePlayer : TeamA) {
                if (siegePlayer.equals(playerDead)) {
                    TeamA.remove(siegePlayer);
                    siegePlayer.setDead();
                    TeamA.add(siegePlayer);
                }
            }
        } else if (TeamB.contains(playerDead)) {
            for (SiegePlayer siegePlayer : TeamB) {
                if (siegePlayer.equals(playerDead)) {
                    TeamB.remove(siegePlayer);
                    siegePlayer.setDead();
                    TeamB.add(siegePlayer);
                }
            }
        }
    }
}
