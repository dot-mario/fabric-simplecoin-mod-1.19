package com.dotmario.simplecoin.item;

import com.dotmario.simplecoin.SimpleCoinMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemCoinSilver {
    public static final Item COINSILVER = registerItem("coinSilver.json",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SimpleCoinMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SimpleCoinMod.LOGGER.debug("Registering Mod Items for "+SimpleCoinMod.MOD_ID);
    }
}
