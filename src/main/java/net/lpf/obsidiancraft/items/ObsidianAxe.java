package net.lpf.obsidiancraft.items;

import static net.lpf.obsidiancraft.init.ObsidianItems.obsidianIngot;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ObsidianAxe extends ItemAxe {

    public ObsidianAxe(ToolMaterial material) {
        this(material, 10.0F, -2.8F);
    }

    private ObsidianAxe(ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName("axeObsidian");
        setRegistryName("obsidian_axe");
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == obsidianIngot;
    }
}
