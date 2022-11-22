package net.lpf.obsidiancraft.items;

import static net.lpf.obsidiancraft.init.ObsidianItems.obsidianIngot;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ObsidianArmor extends ItemArmor {

    public ObsidianArmor(String registryName, String unlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == obsidianIngot;
    }
}
