package main.java.com.cfil360.mmorpg.races;

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
public class Dwarf implements Race{

    private String name;
    private String description;
    private int strength;
    private int endurance;
    private int agility;
    private int willpower;
    private int wisdom;
    private int intelligence;
    private int accuracy;
    private double speed;
    private double sprint;
    private double swim;

    public Dwarf(String name, int strength, int endurance, int agility, int willpower, int wisdom, int intelligence, int accuracy, double speed, double sprint, double swim) {
        this.name = name;
        this.strength = strength;
        this.endurance = endurance;
        this.agility = agility;
        this.willpower = willpower;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.accuracy = accuracy;
        this.speed = speed;
        this.sprint = sprint;
        this.swim = swim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) { this.description = description; }

    public String getDescription() { return this.description; }

    public void setStrength(int strength) {
         this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getEndurance() {
        return this.endurance;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }

    public int getWillpower() {
        return this.willpower;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSprint(double sprint) {
        this.sprint = sprint;
    }

    public double getSprint() {
        return this.sprint;
    }

    public void setSwim(double swim) {
        this.swim = swim;
    }

    public double getSwim() {
        return this.swim;
    }
}



