package com.gmail.berndivader.mythicmobsext.conditions;

import java.text.SimpleDateFormat;

import com.gmail.berndivader.mythicmobsext.externals.*;
import com.gmail.berndivader.mythicmobsext.utils.RangedDouble;

import io.lumine.xikage.mythicmobs.adapters.AbstractLocation;
import io.lumine.xikage.mythicmobs.io.MythicLineConfig;
import io.lumine.xikage.mythicmobs.skills.conditions.ILocationCondition;

@ExternalAnnotation(name="datetime",author="BerndiVader")
public class DateCondition 
extends 
AbstractCustomCondition 
implements
ILocationCondition {
	SimpleDateFormat dateTime;
	RangedDouble range;
	
	public DateCondition(String line, MythicLineConfig mlc) {
		super(line, mlc);
		dateTime=new SimpleDateFormat(mlc.getString("format","yyyyMMdd"));
		range=new RangedDouble(mlc.getString("value",">0"));
	}

	@Override
	public boolean check(AbstractLocation var1) {
		return range.equals(Integer.parseInt(dateTime.format(System.currentTimeMillis())));
	}
	
}
