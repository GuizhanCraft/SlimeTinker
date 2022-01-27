package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.DummyModificationStation;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Mods {

    public static final SlimefunItemStack MOD_REDSTONE_DUMMY =
        ThemeUtils.themedItemStack(
            "MOD_REDSTONE_DUMMY",
            Material.REDSTONE,
            ThemeItemType.MOD,
            "模组: 红石",
            ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
            ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
            ThemeUtils.PASSIVE + "可以获得与模组等级对应的急迫效果"
        );

    public static final SlimefunItemStack MOD_LAPIS_DUMMY =
        ThemeUtils.themedItemStack(
            "MOD_LAPIS_DUMMY",
            Material.LAPIS_LAZULI,
            ThemeItemType.MOD,
            "模组: 青金石",
            ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
            ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
            ThemeUtils.PASSIVE + "会获得等同于时运或抢夺附魔的效果",
            ThemeUtils.PASSIVE + "每安装1个该模组可提升10%的效果"
        );

    public static final SlimefunItemStack MOD_QUARTZ_DUMMY =
        ThemeUtils.themedItemStack(
            "MOD_QUARTZ_DUMMY",
            Material.QUARTZ,
            ThemeItemType.MOD,
            "模组: 石英",
            ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
            ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
            ThemeUtils.PASSIVE + "会增加该工具/武器的伤害",
            ThemeUtils.PASSIVE + "每安装1个该模组可提升20%的效果"
        );

    public static final SlimefunItemStack MOD_DIAMOND_DUMMY =
        ThemeUtils.themedItemStack(
            "MOD_DIAMOND_DUMMY",
            Material.DIAMOND,
            ThemeItemType.MOD,
            "模组: 钻石",
            ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
            ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
            ThemeUtils.PASSIVE + "受到攻击时有几率反弹伤害",
            ThemeUtils.PASSIVE + "每安装1个该模组可提升10%的效果"
        );

    public static final SlimefunItemStack MOD_EMERALD_DUMMY =
        ThemeUtils.themedItemStack(
            "MOD_EMERALD_DUMMY",
            Material.EMERALD,
            ThemeItemType.MOD,
            "模组: 绿宝石",
            ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
            ThemeUtils.PASSIVE + "每次使用工具/武器都可以获得额外经验",
            ThemeUtils.PASSIVE + "每安装1个该模组可提升1点额外工具经验或10%额外武器经验"
        );


    public static final SlimefunItemStack MOD_PLATE_DUMMY =
        ThemeUtils.themedItemStack(
            "MOD_PLATE_DUMMY",
            Material.OBSIDIAN,
            ThemeItemType.MOD,
            "模组: 强化合金板",
            ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
            ThemeUtils.PASSIVE + "每安装1个该模组可增加10%不消耗耐久的几率",
            ThemeUtils.PASSIVE + "安装10个模组的工具会不可破坏"
        );


    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_REDSTONE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_LAPIS_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_QUARTZ_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_DIAMOND_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_EMERALD_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_PLATE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);

    }
}
