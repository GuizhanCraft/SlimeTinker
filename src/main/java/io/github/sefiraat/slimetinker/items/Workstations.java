package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.armourtable.ArmourTable;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.ModificationStation;
import io.github.sefiraat.slimetinker.items.workstations.repairbench.RepairBench;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryMulti;
import io.github.sefiraat.slimetinker.items.workstations.swappingstation.SwappingStation;
import io.github.sefiraat.slimetinker.items.workstations.tooltable.ToolTable;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Workstations {

    // Tinkers Smeltery
    public static final SlimefunItemStack TINKERS_SMELTERY_CORE =
        ThemeUtils.themedItemStack(
            "TINKERS_SMELTERY_CORE",
            Material.CHISELED_POLISHED_BLACKSTONE,
            ThemeItemType.MACHINE,
            "匠魂冶炼炉",
            "把金属熔化为液体",
            "然后可以冶炼合金",
            "或根据模具浇铸出各种物品",
            "需要岩浆作为燃料"
        );

    // Workbench
    public static final SlimefunItemStack TINKERS_WORKBENCH =
        ThemeUtils.themedItemStack(
            "TINKERS_WORKBENCH",
            Material.FLETCHING_TABLE,
            ThemeItemType.MACHINE,
            "匠魂合成站",
            "用来合成各种物品",
            "包括匠魂工具的部件与建筑材料",
            "也可以当成增强型工作台使用"
        );

    // Tool Table
    public static final SlimefunItemStack TINKERS_TABLE =
        ThemeUtils.themedItemStack(
            "TINKERS_TABLE",
            Material.SMITHING_TABLE,
            ThemeItemType.MACHINE,
            "匠魂工具组装台",
            "将部件组装为工具"
        );

    // Armour Table
    public static final SlimefunItemStack TINKERS_ARMOUR_TABLE =
        ThemeUtils.themedItemStack(
            "TINKERS_ARMOUR_TABLE",
            Material.SMITHING_TABLE,
            ThemeItemType.MACHINE,
            "匠魂防具组装台",
            "将部件组装为防具"
        );

    // Repair
    public static final SlimefunItemStack TINKERS_REPAIR_BENCH =
        ThemeUtils.themedItemStack(
            "TINKERS_REPAIR_BENCH",
            Material.CARTOGRAPHY_TABLE,
            ThemeItemType.MACHINE,
            "匠魂修复台",
            "修复工具与武器"
        );

    // Swapping
    public static final SlimefunItemStack TINKERS_SWAPPING_STATION =
        ThemeUtils.themedItemStack(
            "TINKERS_SWAPPING_STATION",
            Material.LOOM,
            ThemeItemType.MACHINE,
            "匠魂部件更换台",
            "使用新的部件替换已有部件"
        );

    // Modification
    public static final SlimefunItemStack TINKERS_MOD_STATION =
        ThemeUtils.themedItemStack(
            "TINKERS_MOD_STATION",
            Material.GRINDSTONE,
            ThemeItemType.MACHINE,
            "匠魂模组工作站",
            "将模组安装到工具与武器上"
        );

    protected static final ItemStack[] RECIPE_TINKERS_SMELTERY_MULTI = new ItemStack[]{
        Materials.SEARED_BRICK_BLOCK, Materials.SEARED_BRICK_BLOCK, Materials.SEARED_BRICK_BLOCK,
        Materials.SEARED_TANK, Materials.SMELTERY_CONTROLLER, Materials.SPOUT,
        Materials.SEARED_BRICK_BLOCK, Materials.SEARED_BRICK_BLOCK, Materials.SEARED_BRICK_BLOCK
    };
    protected static final ItemStack[] RECIPE_TINKERS_WORKBENCH = new ItemStack[]{
        new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK),
        new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.CRAFTING_TABLE), new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.DISPENSER), new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_TABLE = new ItemStack[]{
        Materials.BLOCK_CAST_STEEL, Materials.BLOCK_CAST_STEEL, Materials.BLOCK_CAST_STEEL,
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH, new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL, new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_ARMOUR_TABLE = new ItemStack[]{
        Materials.BLOCK_CAST_DAMASCUS_STEEL, Materials.BLOCK_CAST_DAMASCUS_STEEL, Materials.BLOCK_CAST_DAMASCUS_STEEL,
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH, new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL, new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_REPAIR_BENCH = new ItemStack[]{
        Materials.BLOCK_CAST_ALUMINUM, Materials.BLOCK_CAST_ALUMINUM, Materials.BLOCK_CAST_ALUMINUM,
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH, new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL, new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_SWAPPING_STATION = new ItemStack[]{
        Materials.BLOCK_CAST_COR_BRONZE, Materials.BLOCK_CAST_COR_BRONZE, Materials.BLOCK_CAST_COR_BRONZE,
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH, new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL, new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_MOD_STATION = new ItemStack[]{
        Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_TABLE, new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL, new ItemStack(Material.OAK_PLANKS)
    };


    public static void set(SlimeTinker p) {

        // Setting the workbench to the plugin so during the first tick we can load additional recipes from other plugins
        p.setWorkbench(new Workbench(ItemGroups.WORKSTATIONS, TINKERS_WORKBENCH, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_TINKERS_WORKBENCH));
        p.getWorkbench().register(p);

        new UnplaceableBlock(ItemGroups.WORKSTATIONS, TINKERS_SMELTERY_CORE, RecipeType.MULTIBLOCK, RECIPE_TINKERS_SMELTERY_MULTI).register(p);
        new ToolTable(ItemGroups.WORKSTATIONS, TINKERS_TABLE, Workbench.TYPE, RECIPE_TINKERS_TABLE).register(p);
        new ArmourTable(ItemGroups.WORKSTATIONS, TINKERS_ARMOUR_TABLE, Workbench.TYPE, RECIPE_TINKERS_ARMOUR_TABLE).register(p);
        new RepairBench(ItemGroups.WORKSTATIONS, TINKERS_REPAIR_BENCH, Workbench.TYPE, RECIPE_TINKERS_REPAIR_BENCH).register(p);
        new SwappingStation(ItemGroups.WORKSTATIONS, TINKERS_SWAPPING_STATION, Workbench.TYPE, RECIPE_TINKERS_SWAPPING_STATION).register(p);
        new ModificationStation(ItemGroups.WORKSTATIONS, TINKERS_MOD_STATION, Workbench.TYPE, RECIPE_TINKERS_MOD_STATION).register(p);

    }


}
