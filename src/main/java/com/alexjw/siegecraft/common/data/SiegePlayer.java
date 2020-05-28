package com.alexjw.siegecraft.common.data;

import com.alexjw.siegecraft.common.entity.EntityDrone;
import com.alexjw.siegecraft.common.entity.EntityRope;
import com.alexjw.siegecraft.common.entity.operator.EntityDummy;
import com.alexjw.siegecraft.common.operators.Operator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;

public class SiegePlayer {
    private EntityPlayer entityPlayer;
    private Operator operator;
    private boolean isAlive;
    private int kills;
    private Operator.Team team;
    private boolean disableDismount = false;
    private boolean isRepelling = false;
    private EntityRope entityRope = null;
    private EnumFacing enumFacing = null;

    public SiegePlayer(EntityPlayer entityPlayer) {
        this.entityPlayer = entityPlayer;
        this.isAlive = true;
        this.kills = 0;
    }

    public Operator.Team getTeam() {
        return team;
    }

    public void setTeam(Operator.Team team) {
        this.team = team;
    }

    public void createDrone(EntityDrone entityDrone, EntityPlayer entityPlayer) {
        SiegeData.drones.put(entityPlayer, entityDrone);
    }

    public void createDummy(EntityDummy entityDummy, EntityPlayer entityPlayer) {
        SiegeData.dummies.put(entityPlayer, entityDummy);
    }

    public EntityDrone getPlayerDrone() {
        return SiegeData.drones.get(entityPlayer);
    }

    public EntityDummy getPlayerDummy() {
        return SiegeData.dummies.get(entityPlayer);
    }

    public void clearDummy() {
        if (SiegeData.dummies.get(entityPlayer) != null) SiegeData.dummies.remove(entityPlayer);
    }

    public void clearDrone() {
        if (SiegeData.drones.get(entityPlayer) != null) SiegeData.drones.remove(entityPlayer);
    }

    public EntityPlayer getEntityPlayer() {
        return this.entityPlayer;
    }

    public void setEntityPlayer(EntityPlayer entityPlayer) {
        this.entityPlayer = entityPlayer;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public int getKills() {
        return this.kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setDead() {
        this.isAlive = false;
    }

    public void addKill() {
        this.kills = (this.kills + 1);
    }

    public boolean isDisableDismount() {
        return disableDismount;
    }

    public void setDisableDismount(boolean disableDismount) {
        this.disableDismount = disableDismount;
    }

    public boolean isRapelling() {
        return isRepelling;
    }

    public void setRepelling(boolean repelling) {
        isRepelling = repelling;
    }

    public EntityRope getEntityRope() {
        return entityRope;
    }

    public void setEntityRope(EntityRope entityRope) {
        this.entityRope = entityRope;
    }

    public void setEnumFacing(EnumFacing enumFacing) {
        this.enumFacing = enumFacing;
    }

    public EnumFacing getEnumFacing() {
        return enumFacing;
    }
}
