package fun.starry.item;

import fun.starry.LucklyBlockMod;
import fun.starry.block.ModBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(LucklyBlockMod.MOD_ID ,id));
    }//注册

    public static final ItemGroup LUCKLYBLOCKMOD_GROUP = Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(LucklyBlockMod.MOD_ID ,"lucky_block_mod_group"),
                ItemGroup.create(ItemGroup.Row.TOP,7 )
                        .displayName(Text.translatable("ItemGroup.luclyblockmodgroup"))
                        .icon(() -> new ItemStack(ModLucklyBlock.LUCKLY_BLOCK_CHIP))
                        .entries((displayContext, entries) -> {
                            entries.add(ModLucklyBlock.LUCKLY_BLOCK_CHIP);//碎片
                            entries.add(ModBlock.LUCKLY_bLOCK);//方块
                        })
                        .build()
                        );//注册"ItemGroup.luclyblockmodgroup"的栏

    public static void registerGroup(){
        //类入口 暂留空
    }
}
