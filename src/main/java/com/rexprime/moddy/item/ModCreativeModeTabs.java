package com.rexprime.moddy.item;

import com.rexprime.moddy.Moddy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Moddy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MODDY_TAB = CREATIVE_MODE_TABS.register("moddy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NewItems.SPRITER.get()))
                    .title(Component.translatable("creativetab.moddy_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(NewItems.SPRITER.get());
                        pOutput.accept(NewItems.RAW_SPRITER.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
