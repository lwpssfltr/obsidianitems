package net.lpf.obsidiancraft.init;

import net.lpf.obsidiancraft.items.ObsidianArmor;
import net.lpf.obsidiancraft.items.ObsidianAxe;
import net.lpf.obsidiancraft.items.ObsidianHoe;
import net.lpf.obsidiancraft.items.ObsidianIngot;
import net.lpf.obsidiancraft.items.ObsidianPickaxe;
import net.lpf.obsidiancraft.items.ObsidianSpade;
import net.lpf.obsidiancraft.items.ObsidianSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ObsidianItems {

    public static ObsidianIngot obsidianIngot;
    public static ObsidianSword obsidianSword;
    public static ObsidianPickaxe obsidianPickaxe;
    public static ObsidianAxe obsidianAxe;
    public static ObsidianHoe obsidianHoe;
    public static ObsidianSpade obsidianSpade;
    public static ObsidianArmor obsidianHelmet;
    public static ObsidianArmor obsidianChestplate;
    public static ObsidianArmor obsidianLeggings;
    public static ObsidianArmor obsidianBoots;
    public static ToolMaterial OBSIDIANTOOL = EnumHelper.addToolMaterial(
            "OBSIDIANTOOL",
            3,
            3072,
            11.0f,
            5.0f,
            19
    );

    public static ArmorMaterial OBSIDIANARMOR = EnumHelper.addArmorMaterial(
            "OBSIDIANARMOR",
            "obsidiancraft:obsidianarmor",
            300,
            new int[]{3, 8, 6, 3},
            21,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            4.0f
    );

    public static void init() {
        obsidianIngot = new ObsidianIngot();
        obsidianSword = new ObsidianSword(OBSIDIANTOOL);
        obsidianAxe = new ObsidianAxe(OBSIDIANTOOL);
        obsidianPickaxe = new ObsidianPickaxe(OBSIDIANTOOL);
        obsidianHoe = new ObsidianHoe(OBSIDIANTOOL);
        obsidianSpade = new ObsidianSpade(OBSIDIANTOOL);
        obsidianHelmet = new ObsidianArmor(
                "obsidian_helmet",
                "helmetObsidian",
                OBSIDIANARMOR,
                1,
                EntityEquipmentSlot.HEAD
        );
        obsidianChestplate = new ObsidianArmor(
                "obsidian_chestplate",
                "chestplateObsidian",
                OBSIDIANARMOR,
                1,
                EntityEquipmentSlot.CHEST
        );
        obsidianLeggings = new ObsidianArmor(
                "obsidian_leggings",
                "leggingsObsidian",
                OBSIDIANARMOR,
                2,
                EntityEquipmentSlot.LEGS
        );
        obsidianBoots = new ObsidianArmor(
                "obsidian_boots",
                "bootsObsidian",
                OBSIDIANARMOR,
                1,
                EntityEquipmentSlot.FEET
        );
    }

    public static void register() {
        GameRegistry.register(obsidianIngot);
        GameRegistry.register(obsidianSword);
        GameRegistry.register(obsidianAxe);
        GameRegistry.register(obsidianPickaxe);
        GameRegistry.register(obsidianHoe);
        GameRegistry.register(obsidianSpade);
        GameRegistry.register(obsidianHelmet);
        GameRegistry.register(obsidianChestplate);
        GameRegistry.register(obsidianLeggings);
        GameRegistry.register(obsidianBoots);

        OreDictionary.registerOre("ingotObsidian", obsidianIngot);
    }

    private static void registerRender(Item item) {
        Minecraft.getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(
                        item,
                        0,
                        new ModelResourceLocation(
                                item.getRegistryName(),
                                "inventory"
                        )
                );
    }

    public static void registerRenders() {
        ObsidianItems.registerRender(obsidianIngot);
        ObsidianItems.registerRender(obsidianSword);
        ObsidianItems.registerRender(obsidianPickaxe);
        ObsidianItems.registerRender(obsidianAxe);
        ObsidianItems.registerRender(obsidianHoe);
        ObsidianItems.registerRender(obsidianSpade);
        ObsidianItems.registerRender(obsidianHelmet);
        ObsidianItems.registerRender(obsidianChestplate);
        ObsidianItems.registerRender(obsidianLeggings);
        ObsidianItems.registerRender(obsidianBoots);
    }

    public static void registerSmelting() {
        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(obsidianIngot), 1.0f);
    }

    public static void registerRecipies() {
        GameRegistry.addRecipe(new ItemStack(obsidianSword),
                "#",
                "#",
                "I",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianPickaxe),
                "###",
                " I ",
                " I ",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianAxe),
                "##",
                "#I",
                " I",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianAxe),
                "##",
                "I#",
                "I ",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianHoe),
                "##",
                " I",
                " I",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianHoe),
                "##",
                "I ",
                "I ",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianAxe),
                "##",
                "#I",
                " I",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianSpade),
                "#",
                "I",
                "I",
                '#', obsidianIngot,
                'I', Items.STICK
        );
        GameRegistry.addRecipe(new ItemStack(obsidianHelmet),
                "###",
                "# #",
                '#', obsidianIngot
        );
        GameRegistry.addRecipe(new ItemStack(obsidianChestplate),
                "# #",
                "###",
                "###",
                '#', obsidianIngot
        );
        GameRegistry.addRecipe(new ItemStack(obsidianLeggings),
                "###",
                "# #",
                "# #",
                '#', obsidianIngot
        );
        GameRegistry.addRecipe(new ItemStack(obsidianBoots),
                "# #",
                "# #",
                '#', obsidianIngot
        );
    }
}
