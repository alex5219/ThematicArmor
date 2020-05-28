package com.alexjw.siegecraft.common.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

import java.util.Arrays;
import java.util.List;

public class CommandEquip extends CommandBase {

    /**
     * Gets the name of the command
     */
    public String getName() {
        return "equip";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel() {
        return 3;
    }

    /**
     * Gets the usage string for the command.
     */
    public String getUsage(ICommandSender sender) {
        return "commands.siege.equip";
    }

    /**
     * Get a list of aliases for this command. <b>Never return null!</b>
     */
    public List<String> getAliases() {
        return Arrays.asList("e", "suit");
    }

    /**
     * Callback for when the command is executed
     */
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) {

    }
}
