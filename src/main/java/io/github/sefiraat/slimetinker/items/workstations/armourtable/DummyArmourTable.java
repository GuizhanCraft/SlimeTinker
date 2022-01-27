package io.github.sefiraat.slimetinker.items.workstations.armourtable;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummyArmourTable {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_ARMOUR_TABLE",
        Material.CHISELED_NETHER_BRICKS,
        ThemeItemType.MACHINE,
        "匠魂防具组装台",
        "在匠魂防具组装台",
        "放入相应部件组装获得"
    );
    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummyArmourTable(), STACK);

    private DummyArmourTable() {
        throw new IllegalStateException("Utility class");
    }

}
