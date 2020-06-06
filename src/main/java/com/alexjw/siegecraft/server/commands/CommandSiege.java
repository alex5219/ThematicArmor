package com.alexjw.siegecraft.server.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.Collections;
import java.util.List;

public class CommandSiege extends CommandBase {

    /**
     * Gets the name of the command
     */
    public String getName() {
        return "siege";
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
        return "commands.siege.usage";
    }

    /**
     * Get a list of aliases for this command. <b>Never return null!</b>
     */
    public List<String> getAliases() {
        return Collections.singletonList("siege");
    }

    /**
     * Callback for when the command is executed
     */
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) {
        switch (args[0]) {
            case "start":
                sender.sendMessage(new TextComponentString(TextFormatting.GRAY + "[" + TextFormatting.WHITE + TextFormatting.BOLD + "6" + TextFormatting.RESET + TextFormatting.GRAY + "] " + TextFormatting.WHITE +
                        "Forcefully starting a match."));
                //GameHelper.createGame(server.getPlayerList().getPlayers());
                break;
            case "stop":
                sender.sendMessage(new TextComponentString(TextFormatting.GRAY + "[" + TextFormatting.WHITE + TextFormatting.BOLD + "6" + TextFormatting.RESET + TextFormatting.GRAY + "] " + TextFormatting.WHITE +
                        "Forcefully stopping a match."));
                break;
            default:
                sender.sendMessage(new TextComponentString(TextFormatting.GRAY + "[" + TextFormatting.WHITE + TextFormatting.BOLD + "6" + TextFormatting.RESET + TextFormatting.GRAY + "] " + TextFormatting.WHITE +
                        "Type /siege start or /siege stop"));
                break;
        }
    }
}