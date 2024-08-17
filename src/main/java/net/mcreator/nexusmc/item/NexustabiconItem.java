
package net.mcreator.nexusmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NexustabiconItem extends Item {
	public NexustabiconItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
