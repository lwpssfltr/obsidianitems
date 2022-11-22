package net.lpf.obsidiancraft.items;

import static net.lpf.obsidiancraft.init.ObsidianItems.obsidianIngot;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ObsidianHoe extends ItemHoe {

    public ObsidianHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("hoeObsidian");
        setRegistryName("obsidian_hoe");
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == obsidianIngot;
    }
}
