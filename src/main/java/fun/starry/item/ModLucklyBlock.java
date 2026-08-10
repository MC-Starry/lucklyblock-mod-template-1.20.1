package fun.starry.item;

import fun.starry.LucklyBlockMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModLucklyBlock {

    public static final Item LUCKLY_BLOCK_CHIP = register("luckly_block_chip", new Item(new Item.Settings()));//注册一个幸运方块碎片

    public static Item register(String id, Item item) {
        return register(new Identifier(LucklyBlockMod.MOD_ID ,id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }//注册item

    public static void AddingItemsToGroup(FabricItemGroupEntries entries){
        entries.add(LUCKLY_BLOCK_CHIP);
    }

    public static void registerItem(){

    }

}
