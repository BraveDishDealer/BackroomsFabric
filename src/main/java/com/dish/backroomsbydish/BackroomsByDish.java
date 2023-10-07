package com.dish.backroomsbydish;

import com.dish.backroomsbydish.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackroomsByDish implements ModInitializer {
	public static final String MOD_ID = "backroomsbydish";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}