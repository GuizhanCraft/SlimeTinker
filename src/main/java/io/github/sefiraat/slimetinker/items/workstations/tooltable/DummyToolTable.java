package io.github.sefiraat.slimetinker.items.workstations.tooltable;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummyToolTable {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_TABLE",
        Material.SMITHING_TABLE,
        ThemeItemType.MACHINE,
        "匠魂工具组装台",
        "在匠魂工具组装台",
        "放入相应部件组装获得"
    );
    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummyToolTable(), STACK);

    private DummyToolTable() {
        throw new IllegalStateException("Utility class");
    }

}
