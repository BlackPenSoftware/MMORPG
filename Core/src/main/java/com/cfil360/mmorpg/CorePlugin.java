package main.java.com.cfil360.mmorpg;

import java.io.File;
import java.util.logging.Level;

import main.java.com.cfil360.mmorpg.Events.Listeners.NewPlayerEventListener;
import main.java.com.cfil360.mmorpg.Managers.HealthManager;
import main.java.com.cfil360.mmorpg.Managers.MagickaManager;
import main.java.com.cfil360.mmorpg.Managers.PlayerManager;
import main.java.com.cfil360.mmorpg.Managers.RaceManager;
import main.java.com.cfil360.mmorpg.Managers.StaminaManager;
import main.java.com.cfil360.mmorpg.races.Listeners.AccuracyListener;
import main.java.com.cfil360.mmorpg.races.Listeners.AgilityListener;
import main.java.com.cfil360.mmorpg.races.Listeners.EnduranceListener;
import main.java.com.cfil360.mmorpg.races.Listeners.IntelligenceListener;
import main.java.com.cfil360.mmorpg.races.Listeners.SprintListener;
import main.java.com.cfil360.mmorpg.races.Listeners.StrengthListener;
import main.java.com.cfil360.mmorpg.races.Listeners.SwimListener;
import main.java.com.cfil360.mmorpg.races.Listeners.WillpowerListener;
import main.java.com.cfil360.mmorpg.races.Listeners.WisdomListener;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ***************************************************** Copyright Cfil360 (c)
 * 3014. All Rights Reserved. Any code contained within this document, and any
 * associated APIs with similar branding are the sole property of Cfil360.
 * Distribution, reproduction,m taking snippets or claiming any contents as your
 * own will break the terms of the liscense, and void any agreements with you,
 * the third party. thanks *****************************************************
 */
public class CorePlugin extends JavaPlugin {

	private static RaceManager raceManager;
	private static HealthManager healthManager;
	private static MagickaManager magickaManager;
	private static StaminaManager staminaManager;
	private static PlayerManager playerManager;

	private static CorePlugin main;

	File configurationConfig;
	public FileConfiguration config;
	File playerConfig;
	public FileConfiguration pconfig;

	/*
	 * TODO: Skills manager work on listeners for all the skills and attributes
	 */

	public static CorePlugin getMain() {
		return main;
	}

	public void onEnable() {
		main = this;
		configurationConfig = new File(getDataFolder(), "config.yml");
		config = YamlConfiguration.loadConfiguration(configurationConfig);
		playerConfig = new File(getDataFolder(), "playerData.yml");
		pconfig = YamlConfiguration.loadConfiguration(playerConfig);
		loadConfig();
		Bukkit.getLogger().log(Level.SEVERE, "test");
		// register and setup all required managers
		Bukkit.getPluginManager().registerEvents(new NewPlayerEventListener(), this);
		// Bukkit.getPluginManager().registerEvents(new
		// RaceSelectEventListener(), this);
		Bukkit.getPluginManager().registerEvents(new AccuracyListener(), this);
		Bukkit.getPluginManager().registerEvents(new AgilityListener(), this);
		Bukkit.getPluginManager().registerEvents(new EnduranceListener(), this);
		Bukkit.getPluginManager().registerEvents(new IntelligenceListener(), this);
		Bukkit.getPluginManager().registerEvents(new SprintListener(), this);
		Bukkit.getPluginManager().registerEvents(new StrengthListener(), this);
		Bukkit.getPluginManager().registerEvents(new SwimListener(), this);
		Bukkit.getPluginManager().registerEvents(new WillpowerListener(), this);
		Bukkit.getPluginManager().registerEvents(new WisdomListener(), this);
		raceManager = new RaceManager();
		healthManager = new HealthManager();
		magickaManager = new MagickaManager();
		staminaManager = new StaminaManager();
		playerManager = new PlayerManager();
	}

	public void onDisable() {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		return super.onCommand(sender, command, label, args);
	}

	private void loadConfig() {
		pconfig.options().copyDefaults(true);
		config.options().copyDefaults(true);
		save();
	}

	public void save() {
		try {
			config.save(configurationConfig);
			pconfig.save(playerConfig);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Plugin getPlugin() {
		return Bukkit.getServer().getPluginManager().getPlugin("CorePlugin");
	}

	public static RaceManager getRaceManager() {
		return raceManager;
	}

	public static PlayerManager getPlayerManager() {
		return playerManager;
	}

	public static MagickaManager getMagickaManager() {
		return magickaManager;
	}

	public static HealthManager getHealthManager() {
		return healthManager;
	}

	public static StaminaManager getStaminaManager() {
		return staminaManager;
	}
}
