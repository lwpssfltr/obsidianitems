package net.lpf.obsidiancraft.items;

import static net.lpf.obsidiancraft.init.ObsidianItems.obsidianIngot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword {

    public ObsidianSword(ToolMaterial material) {
        super(material);
        setUnlocalizedName("swordObsidian");
        setRegistryName("obsidian_sword");
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == obsidianIngot;
    }
}
