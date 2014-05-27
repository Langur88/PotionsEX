package me.Langur.PotionsEX;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PotionsEX extends JavaPlugin {
	
	private String prefix = ChatColor.GOLD + "[" + ChatColor.AQUA + "PotionsEX" + ChatColor.GOLD + "] ";
	private String time = " 6 minutes!";
	
	public void onEnable() {
		
	}
	
	public static PotionEffect addPotion(Player p, PotionEffectType type, int ticks, int multiplier) {
		PotionEffect effect = new PotionEffect(type, ticks, multiplier);
		p.addPotionEffect(effect);
		return effect;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(prefix + ChatColor.RED + "You cannot do this.");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("potions")) {
			if(args.length == 0) {
				p.sendMessage(prefix + ChatColor.RED + "Not enough arguments.");
				return true;
			}
			
			if(args[0].equalsIgnoreCase("help")) {
				if(args.length == 1) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 1/6]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions help [1 : 2 : 3 : 4 : 5 : 6] " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Help screen.");
					p.sendMessage(ChatColor.GOLD + "/potions add absorption " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds absorption.");
					p.sendMessage(ChatColor.GOLD + "/potions add blindness " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds blindness.");
					p.sendMessage(ChatColor.GOLD + "/potions add haste " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds haste.");
					return true;
				}
				
				if(args[1].equalsIgnoreCase("1")) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 1/7]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions add nausea " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds nausea.");
					p.sendMessage(ChatColor.GOLD + "/potions add absorption " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds absorption.");
					p.sendMessage(ChatColor.GOLD + "/potions add blindness " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds blindness.");
					p.sendMessage(ChatColor.GOLD + "/potions add haste " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds haste.");
				} else if(args[1].equalsIgnoreCase("2")) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 2/7]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions add harming " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds harming.");
					p.sendMessage(ChatColor.GOLD + "/potions add health " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds instant health III.");
					p.sendMessage(ChatColor.GOLD + "/potions add strength " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds strength.");
					p.sendMessage(ChatColor.GOLD + "/potions add hunger " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds hunger.");
				} else if(args[1].equalsIgnoreCase("3")) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 3/7]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions add hearts " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds more hearts.");
					p.sendMessage(ChatColor.GOLD + "/potions add resistance " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds resistance.");
					p.sendMessage(ChatColor.GOLD + "/potions add invisible " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds invisibility.");
					p.sendMessage(ChatColor.GOLD + "/potions add jump " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds jump boost.");
				} else if(args[1].equalsIgnoreCase("4")) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 4/7]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions add nvision " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds night vision.");
					p.sendMessage(ChatColor.GOLD + "/potions add poison " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds poison.");
					p.sendMessage(ChatColor.GOLD + "/potions add regen " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds regeneration.");
					p.sendMessage(ChatColor.GOLD + "/potions add saturation " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds saturation.");
				} else if(args[1].equalsIgnoreCase("5")) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 5/7]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions add slow " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds slowness.");
					p.sendMessage(ChatColor.GOLD + "/potions add minefatigue " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds mining fatigue.");
					p.sendMessage(ChatColor.GOLD + "/potions add swift " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds swiftness.");
					p.sendMessage(ChatColor.GOLD + "/potions add waterbreathe " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds water breathing.");
				} else if(args[1].equalsIgnoreCase("6")) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 6/7]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions add weakness " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds weakness.");
					p.sendMessage(ChatColor.GOLD + "/potions add wither " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds wither.");
					p.sendMessage(ChatColor.GOLD + "/potions add nausea " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds nausea.");
					p.sendMessage(ChatColor.GOLD + "/potions remove " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Removes all potion effects.");
				} else if(args[1].equalsIgnoreCase("7")) {
					p.sendMessage(ChatColor.GOLD + "---<" + ChatColor.AQUA + "PotionsEX Help [Page 7/7]" + ChatColor.GOLD + ">---");
					p.sendMessage(ChatColor.GOLD + "/potions add all " + ChatColor.WHITE + "-" + ChatColor.GOLD + " Adds all potion effects.");
				}
			} else if(args[0].equalsIgnoreCase("add")) {
				if(args.length <= 1) {
					p.sendMessage(prefix + ChatColor.RED + "Not enough arguments.");
					return true;
				}
				
				if(args[1].equalsIgnoreCase("nausea")) {
					if(!p.hasPermission("PotionsEX.add.nausea")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.CONFUSION, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got nausea for" + time);
				} else if(args[1].equalsIgnoreCase("absorption")) {
					if(!p.hasPermission("PotionsEX.add.absorption")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.ABSORPTION, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got absorption for" + time);
				} else if(args[1].equalsIgnoreCase("blind")) {
					if(!p.hasPermission("PotionsEX.add.blindness")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.BLINDNESS, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got blindness for" + time);
				} else if(args[1].equalsIgnoreCase("haste")) {
					if(!p.hasPermission("PotionsEX.add.haste")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.FAST_DIGGING, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got haste for" + time);
				} else if(args[1].equalsIgnoreCase("harming")) {
					if(!p.hasPermission("PotionsEX.add.harming")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.HARM, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got harming for" + time);
				} else if(args[1].equalsIgnoreCase("health")) {
					if(!p.hasPermission("PotionsEX.add.instahealth")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.HEAL, 7200, 2);
					p.sendMessage(prefix + ChatColor.GREEN + "You got instant health III!");
				} else if(args[1].equalsIgnoreCase("strength")) {
					if(!p.hasPermission("PotionsEX.add.strength")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.INCREASE_DAMAGE, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got strength for" + time);
				} else if(args[1].equalsIgnoreCase("hunger")) {
					if(!p.hasPermission("PotionsEX.add.hunger")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.HUNGER, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got hunger for" + time);
				} else if(args[1].equalsIgnoreCase("hearts")) {
					if(!p.hasPermission("PotionsEX.add.morehearts")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.HEALTH_BOOST, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got extra hearts for" + time);
				} else if(args[1].equalsIgnoreCase("resistance")) {
					if(!p.hasPermission("PotionsEX.add.resistance")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.DAMAGE_RESISTANCE, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got resistance for" + time);
				} else if(args[1].equalsIgnoreCase("invisible")) {
					if(!p.hasPermission("PotionsEX.add.invisible")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.INVISIBILITY, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got invisibility for" + time);
				} else if(args[1].equalsIgnoreCase("jump")) {
					if(!p.hasPermission("PotionsEX.add.jumpboost")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.JUMP, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got jump boost for" + time);
				} else if(args[1].equalsIgnoreCase("nvision")) {
					if(!p.hasPermission("PotionsEX.add.nightvision")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.NIGHT_VISION, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got night vision for" + time);
				} else if(args[1].equalsIgnoreCase("poison")) {
					if(!p.hasPermission("PotionsEX.add.poison")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.POISON, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got poison for" + time);
				} else if(args[1].equalsIgnoreCase("regen")) {
					if(!p.hasPermission("PotionsEX.add.regen")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.REGENERATION, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got regeneration for" + time);
				} else if(args[1].equalsIgnoreCase("saturation")) {
					if(!p.hasPermission("PotionsEX.add.saturation")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.SATURATION, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got saturation for" + time);
				} else if(args[1].equalsIgnoreCase("slow")) {
					if(!p.hasPermission("PotionsEX.add.slowness")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.SLOW, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got slowness for" + time);
				} else if(args[1].equalsIgnoreCase("minefatigue")) {
					if(!p.hasPermission("PotionsEX.add.minefatigue")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.SLOW_DIGGING, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got mining fatigue for" + time);
				} else if(args[1].equalsIgnoreCase("swift")) {
					if(!p.hasPermission("PotionsEX.add.swiftness")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.SPEED, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got swiftness for" + time);
				} else if(args[1].equalsIgnoreCase("waterbreathe")) {
					if(!p.hasPermission("PotionsEX.add.waterbreathe")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.WATER_BREATHING, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got water breathing for" + time);
				} else if(args[1].equalsIgnoreCase("weakness")) {
					if(!p.hasPermission("PotionsEX.add.weakness")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.WEAKNESS, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got weakness for" + time);
				} else if(args[1].equalsIgnoreCase("wither")) {
					if(!p.hasPermission("PotionsEX.add.wither")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.WITHER, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got wither for" + time);
				} else if(args[1].equalsIgnoreCase("all")) {
					if(!p.hasPermission("PotionsEX.add.all")) {
						p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
						return true;
					}
					
					addPotion(p, PotionEffectType.ABSORPTION, 7200, 0);
					addPotion(p, PotionEffectType.BLINDNESS, 7200, 0);
					addPotion(p, PotionEffectType.CONFUSION, 7200, 0);
					addPotion(p, PotionEffectType.DAMAGE_RESISTANCE, 7200, 0);
					addPotion(p, PotionEffectType.FAST_DIGGING, 7200, 0);
					addPotion(p, PotionEffectType.FIRE_RESISTANCE, 7200, 0);
					addPotion(p, PotionEffectType.HARM, 7200, 0);
					addPotion(p, PotionEffectType.HEAL, 7200, 0);
					addPotion(p, PotionEffectType.HEALTH_BOOST, 7200, 0);
					addPotion(p, PotionEffectType.HUNGER, 7200, 0);
					addPotion(p, PotionEffectType.INCREASE_DAMAGE, 7200, 0);
					addPotion(p, PotionEffectType.INVISIBILITY, 7200, 0);
					addPotion(p, PotionEffectType.JUMP, 7200, 0);
					addPotion(p, PotionEffectType.NIGHT_VISION, 7200, 0);
					addPotion(p, PotionEffectType.POISON, 7200, 0);
					addPotion(p, PotionEffectType.REGENERATION, 7200, 0);
					addPotion(p, PotionEffectType.SATURATION, 7200, 0);
					addPotion(p, PotionEffectType.SLOW, 7200, 0);
					addPotion(p, PotionEffectType.SLOW_DIGGING, 7200, 0);
					addPotion(p, PotionEffectType.SPEED, 7200, 0);
					addPotion(p, PotionEffectType.WATER_BREATHING, 7200, 0);
					addPotion(p, PotionEffectType.WITHER, 7200, 0);
					p.sendMessage(prefix + ChatColor.GREEN + "You got all potion effects for" + time);
				}
			} else if(args[0].equalsIgnoreCase("remove")) {
				if(!p.hasPermission("PotionsEX.remove")) {
					p.sendMessage(prefix + ChatColor.RED + "You cannot do that.");
					return true;
				}
				
				p.removePotionEffect(PotionEffectType.ABSORPTION);
				p.removePotionEffect(PotionEffectType.BLINDNESS);
				p.removePotionEffect(PotionEffectType.CONFUSION);
				p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
				p.removePotionEffect(PotionEffectType.HARM);
				p.removePotionEffect(PotionEffectType.HEAL);
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.removePotionEffect(PotionEffectType.HUNGER);
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.removePotionEffect(PotionEffectType.INVISIBILITY);
				p.removePotionEffect(PotionEffectType.JUMP);
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				p.removePotionEffect(PotionEffectType.POISON);
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.removePotionEffect(PotionEffectType.SATURATION);
				p.removePotionEffect(PotionEffectType.SLOW);
				p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
				p.removePotionEffect(PotionEffectType.SPEED);
				p.removePotionEffect(PotionEffectType.WATER_BREATHING);
				p.removePotionEffect(PotionEffectType.WEAKNESS);
				p.removePotionEffect(PotionEffectType.WITHER);
				p.sendMessage(prefix + ChatColor.GREEN + "Removed all potion effects!");
			}
		}
		
		return true;
	}
}
