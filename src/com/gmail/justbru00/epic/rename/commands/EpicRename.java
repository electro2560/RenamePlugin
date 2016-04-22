/**
 *******************************************
 * @author Justin Brubaker Plugin name: EpicRename
 *
 *         Copyright (C) 2016 Justin Brubaker
 *
 *         This program is free software; you can redistribute it and/or modify
 *         it under the terms of the GNU General Public License as published by
 *         the Free Software Foundation; either version 2 of the License, or (at
 *         your option) any later version.
 *
 *         This program is distributed in the hope that it will be useful, but
 *         WITHOUT ANY WARRANTY; without even the implied warranty of
 *         MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *         General Public License for more details.
 *
 *         You should have received a copy of the GNU General Public License
 *         along with this program; if not, write to the Free Software
 *         Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *         02110-1301 USA.
 * 
 *         You can contact the author @ justbru00@gmail.com
 */
package com.gmail.justbru00.epic.rename.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.gmail.justbru00.epic.rename.main.RenameRewrite;
import com.gmail.justbru00.epic.rename.utils.Messager;

public class EpicRename implements CommandExecutor {

	public RenameRewrite main;

	public EpicRename(RenameRewrite main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,	String label, String[] args) {	
		
		if (command.getName().equalsIgnoreCase("epicrename")) {			
			if (args.length == 0) {
				Messager.msgSender(RenameRewrite.Prefix + "Please type /epicrename help", sender);
				Messager.msgSender(RenameRewrite.Prefix + "Or type /epicrename license", sender);
				return true;
			}
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("license")) {
					Messager.msgSender(RenameRewrite.Prefix + "See License Information at: http://tinyurl.com/epicrename1", sender);
					return true;
				}
				if (args[0].equalsIgnoreCase("help")){ 
					Messager.msgSender(RenameRewrite.Prefix + ChatColor.GRAY + "---------------------------------------", sender);
					Messager.msgSender(RenameRewrite.Prefix + "/rename - Usage: /rename &b&lTest", sender);
					Messager.msgSender(RenameRewrite.Prefix + "/renameany - Usage: /renamyany &b&lTest", sender);
					Messager.msgSender(RenameRewrite.Prefix + "/lore - Usage: /lore &bHello", sender);
					Messager.msgSender(RenameRewrite.Prefix + "/renameentity - Usage: /renameentity &bTest", sender);
					Messager.msgSender(RenameRewrite.Prefix + ChatColor.GRAY + "---------------------------------------", sender);					
					return true;
				} else {
					Messager.msgSender(RenameRewrite.Prefix + "Please type /epicrename help", sender);
				    return true;
				}				
			}
		} // End of command EpicRename
		return false;
	}

}