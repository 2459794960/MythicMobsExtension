package com.gmail.berndivader.mythicmobsext.mechanics;

import org.bukkit.entity.LivingEntity;

import com.gmail.berndivader.mythicmobsext.externals.*;
import com.gmail.berndivader.mythicmobsext.volatilecode.Volatile;

import io.lumine.xikage.mythicmobs.adapters.AbstractEntity;
import io.lumine.xikage.mythicmobs.io.MythicLineConfig;
import io.lumine.xikage.mythicmobs.skills.ITargetedEntitySkill;
import io.lumine.xikage.mythicmobs.skills.SkillMechanic;
import io.lumine.xikage.mythicmobs.skills.SkillMetadata;

@ExternalAnnotation(name="forcebow",author="BerndiVader")
public class ForceBowMechanic 
extends
SkillMechanic
implements
ITargetedEntitySkill {

	public ForceBowMechanic(String line, MythicLineConfig mlc) {
		super(line, mlc);
	}

	@Override
	public boolean castAtEntity(SkillMetadata data, AbstractEntity entity) {
		Volatile.handler.forceBowDraw((LivingEntity)data.getCaster().getEntity().getBukkitEntity(),(LivingEntity)entity.getBukkitEntity());
		return false;
	}
}
