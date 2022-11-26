package com.dotmario.simplecoin.item;

import com.dotmario.simplecoin.SimpleCoinMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemCoin {
    public static final Item COINBRONZE = registerItem("coinBronze",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item COINSILVER = registerItem("coinSilver",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item COINGOLD = registerItem("coinGold",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SimpleCoinMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SimpleCoinMod.LOGGER.debug("Registering Mod Items for "+SimpleCoinMod.MOD_ID);
    }
}
