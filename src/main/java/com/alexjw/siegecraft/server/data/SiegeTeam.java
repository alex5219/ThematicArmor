package com.alexjw.siegecraft.server.data;

import com.alexjw.siegecraft.server.operators.Operator;
import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;

public class SiegeTeam {
    private Operator.Team team;
    private ArrayList<SiegePlayer> players = new ArrayList<>();
    private int score;

    public SiegeTeam() {
        this.score = 0;
    }

    public void addScore() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addPlayer(SiegePlayer siegePlayer) {
        this.players.add(siegePlayer);
    }

    public Operator.Team getTeam() {
        return this.team;
    }

    public void setTeam(Operator.Team team) {
        this.team = team;
    }

    public ArrayList<SiegePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<SiegePlayer> players) {
        this.players = players;
    }

    public ArrayList<EntityPlayer> getEntityPlayers() {
        ArrayList<EntityPlayer> entityPlayers = new ArrayList<>();
        for (SiegePlayer siegePlayer : players) {
            entityPlayers.add(siegePlayer.getEntityPlayer());
        }
        return entityPlayers;
    }

    public boolean isTaken(Operator operator) {
        boolean isTaken = false;
        for (SiegePlayer siegePlayer : players) {
            if (siegePlayer.getOperator().equals(operator)) {
                isTaken = true;
                break;
            }
        }
        return isTaken;
    }
}
