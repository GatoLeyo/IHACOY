package net.gatoleyo.ihacoy.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab IHACOY_TAB = new CreativeModeTab("ihacoytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_NUGGET.get());
        }
    };
}
