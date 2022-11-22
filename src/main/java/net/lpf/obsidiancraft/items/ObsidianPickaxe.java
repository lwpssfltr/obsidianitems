package net.lpf.obsidiancraft.items;

import static net.lpf.obsidiancraft.init.ObsidianItems.obsidianIngot;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ObsidianPickaxe extends ItemPickaxe {

    public ObsidianPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("pickaxeObsidian");
        setRegistryName("obsidian_pickaxe");
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == obsidianIngot;
    }
}
