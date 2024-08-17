
package net.mcreator.nexusmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NexuscoreItem extends Item {
	public NexuscoreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
