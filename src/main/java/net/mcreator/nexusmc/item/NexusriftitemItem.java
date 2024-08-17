
package net.mcreator.nexusmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NexusriftitemItem extends Item {
	public NexusriftitemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
