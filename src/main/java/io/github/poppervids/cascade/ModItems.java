package io.github.poppervids.cascade;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	// Declare the item
	public static final Item CASCADE = new Item(new QuiltItemSettings());
	public static final Item RAW_CASCADE = new Item(new QuiltItemSettings());
	public static final Item CASCADE_HAMMER = new CascadeHammer(ToolMaterials.DIAMOND, 100, 2.0F, new QuiltItemSettings().rarity(Rarity.RARE));

	// Register the item
	public static void register(ModContainer mod) {
		// Use mod's metadata to get the mod id and register the item
		Registry.register(Registry.ITEM, new Identifier(mod.metadata().id(), "cascade"), CASCADE);
		Registry.register(Registry.ITEM, new Identifier(mod.metadata().id(), "raw_cascade"), RAW_CASCADE);
		Registry.register(Registry.ITEM, new Identifier(mod.metadata().id(), "cascade_hammer"), CASCADE_HAMMER);
	}
}
