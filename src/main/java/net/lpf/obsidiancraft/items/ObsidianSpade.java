package net.lpf.obsidiancraft.items;

import static net.lpf.obsidiancraft.init.ObsidianItems.obsidianIngot;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ObsidianSpade extends ItemSpade {

    public ObsidianSpade(ToolMaterial material) {
        super(material);
        setUnlocalizedName("spadeObsidian");
        setRegistryName("obsidian_spade");
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == obsidianIngot;
    }
}
