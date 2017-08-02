package com.gmail.berndivader.mmcustomskills26.conditions.Own;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.gmail.berndivader.mmcustomskills26.Main;

import io.lumine.xikage.mythicmobs.api.bukkit.events.MythicConditionLoadEvent;
import io.lumine.xikage.mythicmobs.skills.SkillCondition;

public class mmOwnConditions implements Listener {

	public mmOwnConditions() {
		Bukkit.getServer().getPluginManager().registerEvents(this, Main.getPlugin());
		Bukkit.getLogger().info("Register CustomConditions");
	}

	@EventHandler
	public void onMythicMobsConditionsLoadEvent(MythicConditionLoadEvent e) {
		String conditionName = e.getConditionName().toLowerCase();
		switch (conditionName) {
		case "vdistance": {
			SkillCondition c = new mmVerticalDistanceCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "hastarget": {
			SkillCondition c = new mmHasTargetCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "mobsinradius": {
			SkillCondition c = new mmMobsInRadiusCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "lastdamagecause": {
			SkillCondition c = new mmLastDamageCauseCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "stunned":
		case "isstunned": {
			SkillCondition c = new mmIsStunnedCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "biomefix": {
			SkillCondition c = new mmBiomeFixCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "hasmeta": {
			SkillCondition c = new mmHasMetaTagCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "behind": {
			SkillCondition c = new mmIsBehindCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "infront": {
			SkillCondition c = new mmInFrontCondition(e.getConfig().getLine(), e.getConfig());
			e.register(c);
			break;
		}
		case "damageable":
		case "attackable": {
			SkillCondition c = new mmIsAttackableCondition(e.getConfig().getLine(),e.getConfig());
			e.register(c);
			break;
		}
		}
	}
}