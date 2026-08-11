package fun.starry.block;

import fun.starry.LucklyBlockMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {

    public static final Block LUCKLY_bLOCK = register("luckly_block",new Block(AbstractBlock.Settings.create().strength(0.2f,0.2f)));//这里注册luckly_block

    public static Block register(String id, Block block) {
        registerBlockItem(id ,block);//这里调用registerBlockItem注册物品状态
        return Registry.register(Registries.BLOCK, new Identifier(LucklyBlockMod.MOD_ID ,id), block);
    }//这里注册方块

    public static void registerBlockItem(String id , Block block){
        Registry.register(Registries.ITEM ,new Identifier(LucklyBlockMod.MOD_ID ,id),new BlockItem(block, new Item.Settings()));
    }//这里注册方块的物品状态

    public static void registerBlock(){

    }
}
