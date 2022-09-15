package net.gatoleyo.ihacoy.item;

import net.gatoleyo.ihacoy.ihacoy;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.stringtemplate.v4.misc.Misc;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ihacoy.MOD_ID);

    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant()));


    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
