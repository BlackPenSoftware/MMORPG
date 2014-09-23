package main.java.com.cfil360.mmorpg.Managers;


import java.util.ArrayList;

import main.java.com.cfil360.mmorpg.races.*;

/**
 * *****************************************************
 * Copyright Cfil360 (c) 3014.  All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of Cfil360.  Distribution, reproduction,m taking snippets or
 * claiming any contents as your own will break the terms of the liscense, and void any
 * agreements with you, the third party.
 * thanks
 * *****************************************************
 */
public class RaceManager {
    private ArrayList<Race> races = new ArrayList<Race>();

    public RaceManager() {
        //setup all races here
        setupRaces();
    }

    private void setupRaces() {
        //create new race of every type with defined traits
        DarkElf darkElf = new DarkElf("DarkElf", 5, 4, 5, 5, 5, 6, 3, 1.5, 2.5, 1);
        races.add(darkElf);
        Dwarf dwarf = new Dwarf("Dwarf", 7, 8, 5, 4, 3, 3, 3, 1, 2, 1);
        races.add(dwarf);
        Halfling halfling = new Halfling("Halfling", 4, 3, 4, 4, 4, 4, 4, 1, 2, 1);
        races.add(halfling);
        HighElf highElf = new HighElf("HighElf", 4, 4, 4, 6, 6, 6, 3, 1.5, 2.5, 1);
        races.add(highElf);
        Human human = new Human("Human", 5, 5, 5, 5, 5, 5, 5, 1.5, 2.5, 1);
        races.add(human);
        Orc orc = new Orc("Orc", 8, 7, 5, 5, 2, 2, 4, 1, 2, 1);
        races.add(orc);
        Reptilian reptilian = new Reptilian("Reptilian", 6, 6, 6, 6, 4, 4, 6, 2, 3, 1.5);
        races.add(reptilian);
        WoodElf woodElf = new WoodElf("WoodElf", 5, 4, 5, 5, 4, 3, 7, 2, 3, 1);
        races.add(woodElf);
    }

    public ArrayList<Race> getRaces() {
        return races;
    }
}
