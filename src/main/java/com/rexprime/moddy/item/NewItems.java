package com.rexprime.moddy.item;

import com.rexprime.moddy.Moddy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NewItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Moddy.MOD_ID);


    public static final RegistryObject<Item> SPRITER = ITEMS.register("spriter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SPRITER = ITEMS.register("raw_spriter", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
