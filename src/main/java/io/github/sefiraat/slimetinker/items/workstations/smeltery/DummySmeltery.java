package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummySmeltery {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "匠魂冶炼炉",
        "这个物品是在匠魂冶炼炉中",
        "使用特定的模具",
        "浇铸相应的熔融金属/液体获得"
    );
    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummySmeltery(), STACK);

    private DummySmeltery() {
        throw new IllegalStateException("Utility class");
    }

}
