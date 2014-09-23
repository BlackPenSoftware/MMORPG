package main.java.com.cfil360.mmorpg.Managers;

import java.util.UUID;
import java.util.logging.Level;

import main.java.com.cfil360.mmorpg.CorePlugin;
import main.java.com.cfil360.mmorpg.races.Race;

import org.bukkit.Bukkit;

/**
 * ***************************************************** Copyright Cfil360 (c)
 * 3014. All Rights Reserved. Any code contained within this document, and any
 * associated APIs with similar branding are the sole property of Cfil360.
 * Distribution, reproduction,m taking snippets or claiming any contents as your
 * own will break the terms of the liscense, and void any agreements with you,
 * the third party. thanks *****************************************************
 */
public class PlayerManager {

	CorePlugin cp = CorePlugin.getMain();

	/**
	 * Set the player's race level in the players.yml
	 * 
	 * @param uuid
	 * @param race
	 */
	public void setRace(UUID uuid, Race race) {
		try {
			// set the player's skill level
			cp.pconfig.set(uuid.toString() + ".Race.", race);
		} catch (Exception ex) {
			Bukkit.getLogger().log(Level.SEVERE, "Error in players.yml!!!  Fix immediatly!");
		}
	}

	/**
	 * Retrieve the player's race from the players.yml
	 * 
	 * @param uuid
	 * @return
	 */
	public Race getRace(UUID uuid) {
		return (Race) cp.pconfig.get(uuid.toString() + ".Race");

	}

	/**
	 * Set the player's skill level in the players.yml to the old one plus the
	 * defined param
	 * 
	 * @param uuid
	 * @param skill
	 * @param changeBy
	 */
	public void setSkill(UUID uuid, String skill, double changeBy) {
		try {
			// set the player's skill level
			cp.pconfig.set(uuid.toString() + ".Skills." + skill, getSkill(uuid, skill) + changeBy);
		} catch (Exception ex) {
			Bukkit.getLogger().log(Level.SEVERE, "Error in players.yml!!!  Fix immediatly!");
		}
	}

	/**
	 * Retrieve the player's skill level in the players.yml
	 * 
	 * @param uuid
	 * @param skill
	 * @return
	 */
	public double getSkill(UUID uuid, String skill) {
		try {
			// get the player's skill level from their
			return cp.pconfig.getInt(uuid.toString() + ".Skills." + skill);
		} catch (Exception ex) {
			Bukkit.getLogger().log(Level.SEVERE, "Error in players.yml!!!  Fix immediatly!");
			return 0;
		}
	}
}
