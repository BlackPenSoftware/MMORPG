package main.java.com.cfil360.mmorpg.methods;

import main.java.com.cfil360.mmorpg.CorePlugin;

import org.bukkit.entity.Player;

public class Levels {

	CorePlugin cp = CorePlugin.getMain();

	private static Levels instance = new Levels();

	public static Levels getInstance() {
		return instance;
	}

	public void addExp(Player p, Integer a) {
		int xp = cp.pconfig.getInt(p.getUniqueId().toString() + ".exp");
		int level = cp.pconfig.getInt(p.getUniqueId().toString() + ".level");
		if (level < 100) {
			int nl = level + 1;
			int nx = xp + 100 + level * 25;
			xp = xp + a;
			cp.pconfig.set(p.getUniqueId().toString() + ".exp", xp);
			cp.save();
			if (xp > nx) {
				levelUp(p);
			}
		}
	}

	public void levelUp(Player p) {
		int level = cp.pconfig.getInt(p.getUniqueId().toString() + ".level");
		level++;
		cp.pconfig.set(p.getUniqueId().toString() + ".level", level);
		cp.save();
		if (level == 10 || level == 20 || level == 30 || level == 50 || level == 60 || level == 70 || level == 80 || level == 90 || level == 100) {
			addSP(p, 6);
		} else {
			addSP(p, 3);
		}
		if (level == 10 || level == 20 || level == 30 || level == 50 || level == 60 || level == 70 || level == 80 || level == 90 || level == 100 || level == 5 || level == 15 || level == 25
				|| level == 35 || level == 45 || level == 55 || level == 65 || level == 75 || level == 85 || level == 95) {
			addAP(p, 1);
		}
	}

	public void addAP(Player p, Integer a) {
		int ap = cp.pconfig.getInt(p.getUniqueId().toString() + ".ap");
		ap = ap + a;
		cp.pconfig.set(p.getUniqueId().toString() + ".ap", ap);
		cp.save();
	}

	public void addSP(Player p, Integer a) {
		int sp = cp.pconfig.getInt(p.getUniqueId().toString() + ".sp");
		sp = sp + a;
		cp.pconfig.set(p.getUniqueId().toString() + ".sp", sp);
		cp.save();
	}
}
