package net.mcreator.breadcraft.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SootsandwichcraftConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> RYE_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> THYME_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> GARLIC_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> BASIL_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> ROSEMARY_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> ONION_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> MUSTARD_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> TOMATO_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> HOTPEPPER_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> CAPER_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> WILDGREENS_SEED_DROP_RATE;
	public static final ForgeConfigSpec.ConfigValue<Double> PEANUT_SEED_DROP_RATE;
	static {
		BUILDER.push("seedDropRate");
		RYE_SEED_DROP_RATE = BUILDER.comment("Seed drop rate settings: 0 turns seed drops off, 1 is the lowest, 3 is the highest, and 2 is default. Anything higher than 3 will default to what 3 is.").define("ryeSeedDropRate", (double) 2);
		THYME_SEED_DROP_RATE = BUILDER.define("thymeSeedDropRate", (double) 2);
		GARLIC_SEED_DROP_RATE = BUILDER.define("garlicSeedDropRate", (double) 2);
		BASIL_SEED_DROP_RATE = BUILDER.define("basilSeedDropRate", (double) 2);
		ROSEMARY_SEED_DROP_RATE = BUILDER.define("rosemarySeedDropRate", (double) 2);
		ONION_SEED_DROP_RATE = BUILDER.define("onionSeedDropRate", (double) 2);
		MUSTARD_SEED_DROP_RATE = BUILDER.define("mustardSeedDropRate", (double) 2);
		TOMATO_SEED_DROP_RATE = BUILDER.define("tomatoSeedDropRate", (double) 2);
		HOTPEPPER_SEED_DROP_RATE = BUILDER.define("hotpepperSeedDropRate", (double) 2);
		CAPER_SEED_DROP_RATE = BUILDER.define("caperSeedDropRate", (double) 2);
		WILDGREENS_SEED_DROP_RATE = BUILDER.define("wildgreensSeedDropRate", (double) 2);
		PEANUT_SEED_DROP_RATE = BUILDER.define("peanutSeedDropRate", (double) 2);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
