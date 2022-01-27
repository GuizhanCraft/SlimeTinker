package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMManager;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Casts {

    public static final String CAST_DESC = "将液体浇铸成模具的样式";
    public static final String INPUT_DESC = "消耗 : ";
    public static final String OUTPUT_DESC = "获取 : ";
    public static final String UNIT_DESC = " 单位";
    public static final SlimefunItemStack CAST_NUGGET =
        ThemeUtils.themedItemStack(
            "CAST_NUGGET",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "模具: 金属粒",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_NUGGET + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 粒"
        );
    public static final SlimefunItemStack CAST_BLOCK =
        ThemeUtils.themedItemStack(
            "CAST_BLOCK",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "模具: 块",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_BLOCK + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 块"
        );
    public static final SlimefunItemStack CAST_INGOT =
        ThemeUtils.themedItemStack(
            "CAST_INGOT",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "模具: 金属锭",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_INGOT + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 锭"
        );
    public static final SlimefunItemStack CAST_GEM =
        ThemeUtils.themedItemStack(
            "CAST_GEM",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "模具: 宝石",
            ThemeUtils.PASSIVE + "适用于非金属液体",
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_GEM + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 宝石"
        );
    public static final SlimefunItemStack CAST_SHOVELHEAD =
        ThemeUtils.themedItemStack(
            "CAST_SHOVELHEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 铲头",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_SHOVELHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 铲头"
        );
    public static final SlimefunItemStack CAST_PICKAXEHEAD =
        ThemeUtils.themedItemStack(
            "CAST_PICKAXEHEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 镐头",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_PICKAXEHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 镐头"
        );
    public static final SlimefunItemStack CAST_AXEHEAD =
        ThemeUtils.themedItemStack(
            "CAST_AXE_HEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 斧刃",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_AXEHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 斧刃"
        );
    public static final SlimefunItemStack CAST_HOEHEAD =
        ThemeUtils.themedItemStack(
            "CAST_HOEHEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 锄头",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_HOEHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 锄头"
        );
    public static final SlimefunItemStack CAST_SWORDBLADE =
        ThemeUtils.themedItemStack(
            "CAST_SWORDBLADE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 剑刃",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_SWORDBLADE + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 剑刃"
        );
    public static final SlimefunItemStack CAST_TOOLROD =
        ThemeUtils.themedItemStack(
            "CAST_TOOLROD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 手柄",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_TOOLROD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 手柄"
        );
    public static final SlimefunItemStack CAST_HELM_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_HELM_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 头盔板",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_ARM_HELM + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 头盔板"
        );
    public static final SlimefunItemStack CAST_CHEST_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_CHEST_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 胸甲板",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_ARM_CHEST + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 胸甲板"
        );
    public static final SlimefunItemStack CAST_LEG_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_LEG_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 护腿板",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_ARM_LEG + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 护腿板"
        );
    public static final SlimefunItemStack CAST_BOOT_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_BOOT_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 靴子板",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_ARM_BOOT + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 靴子板"
        );
    public static final SlimefunItemStack CAST_MAIL_LINK =
        ThemeUtils.themedItemStack(
            "CAST_MAIL_LINK",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "模具: 盔甲接合物",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_ARM_LINKS + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 盔甲接合物"
        );
    public static final SlimefunItemStack CAST_REPAIRKIT =
        ThemeUtils.themedItemStack(
            "CAST_REPAIRKIT",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "模具: 修复工具",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + CMManager.AMOUNT_KIT + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 修复工具"
        );
    protected static final ItemStack[] RECIPE_CAST_NUGGET = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.IRON_NUGGET), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_INGOT = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.BRICK), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_BLOCK = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.STONE), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_GEM = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.DIAMOND), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_SHOVEL_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_SHOVEL_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_PICKAXE_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_PICKAXE_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_AXE_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_AXE_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_HOE_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_HOE_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_SWORD_BLADE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_SWORD_BLADE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_TOOL_ROD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_TOOL_ROD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_HELM_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_HELM_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_CHEST_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_CHEST_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_LEG_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_LEG_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_BOOT_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_BOOT_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_MAIL_LINK = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_MAIL_LINK, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_REPAIR_KIT = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), Dies.DIE_REPAIR_KIT, null,
        null, null, null,
        null, null, null
    };

    public static void set(SlimeTinker p) {

        new UnplaceableBlock(ItemGroups.CASTS, CAST_NUGGET, DummySmeltery.TYPE, RECIPE_CAST_NUGGET).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_INGOT, DummySmeltery.TYPE, RECIPE_CAST_INGOT).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_BLOCK, DummySmeltery.TYPE, RECIPE_CAST_BLOCK).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_GEM, DummySmeltery.TYPE, RECIPE_CAST_GEM).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_SHOVELHEAD, DummySmeltery.TYPE, RECIPE_CAST_SHOVEL_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_PICKAXEHEAD, DummySmeltery.TYPE, RECIPE_CAST_PICKAXE_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_AXEHEAD, DummySmeltery.TYPE, RECIPE_CAST_AXE_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_HOEHEAD, DummySmeltery.TYPE, RECIPE_CAST_HOE_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_SWORDBLADE, DummySmeltery.TYPE, RECIPE_CAST_SWORD_BLADE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_TOOLROD, DummySmeltery.TYPE, RECIPE_CAST_TOOL_ROD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_HELM_PLATE, DummySmeltery.TYPE, RECIPE_CAST_HELM_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_CHEST_PLATE, DummySmeltery.TYPE, RECIPE_CAST_CHEST_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_LEG_PLATE, DummySmeltery.TYPE, RECIPE_CAST_LEG_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_BOOT_PLATE, DummySmeltery.TYPE, RECIPE_CAST_BOOT_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_MAIL_LINK, DummySmeltery.TYPE, RECIPE_CAST_MAIL_LINK).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_REPAIRKIT, DummySmeltery.TYPE, RECIPE_CAST_REPAIR_KIT).register(p);

    }
}
