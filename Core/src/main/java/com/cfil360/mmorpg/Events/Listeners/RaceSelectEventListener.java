package main.java.com.cfil360.mmorpg.Events.Listeners;

import main.java.com.cfil360.mmorpg.CorePlugin;
import main.java.com.cfil360.mmorpg.Events.RaceSelectEvent;
import main.java.com.cfil360.mmorpg.races.Race;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * ***************************************************** Copyright Cfil360 (c)
 * 3014. All Rights Reserved. Any code contained within this document, and any
 * associated APIs with similar branding are the sole property of Cfil360.
 * Distribution, reproduction,m taking snippets or claiming any contents as your
 * own will break the terms of the liscense, and void any agreements with you,
 * the third party. thanks *****************************************************
 */
public class RaceSelectEventListener implements Listener {

	@EventHandler
	public void onRaceSelect(RaceSelectEvent event) {
		// define a player
		Player player = event.getPlayer();

		/*
		 * retrieve all races and put them in an inventory then open this
		 * inventory
		 */
		player.openInventory(getRaceSelection());

		// get the player's race choice and set the player's race
		// TODO: get player's race choice

		// CorePlugin.getPlayerManager().setRace(player.getUniqueId(), new
		// Dwarf());

	}

	public Inventory getRaceSelection() {
		// create an inventory to store all the race selections
		Inventory inventory = Bukkit.createInventory(null, 9, "Test inv");

		// get a list of all the races
		ArrayList<Race> races = CorePlugin.getRaceManager().getRaces();

		for (Race race : races) {
			// create new object
			ItemStack item = new ItemStack(Material.WOOL);
			// get the object's meta and info
			ItemMeta itemMeta = item.getItemMeta();
			// get the object's lore
			List<String> itemLore = new ArrayList<String>();

			// set the object's name to the name of the race
			itemMeta.setDisplayName(race.getName());

			// set the race's description
			itemLore.add(race.getDescription());

			// set the itemMeta's lore
			itemMeta.setLore(itemLore);

			// set the item's item meta.
			item.setItemMeta(itemMeta);

			// add the item to the inventory
			inventory.addItem(item);
		}

		// return the now filled inventory
		return inventory;

	}
}
