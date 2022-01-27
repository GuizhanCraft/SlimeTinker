package io.github.sefiraat.slimetinker.managers;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import lombok.experimental.UtilityClass;
import org.bukkit.plugin.PluginManager;

@SuppressWarnings("SpellCheckingInspection")
@UtilityClass
public final class SupportedPluginsManager {

    public static final boolean INFINITY_EXPANSION;
    public static final boolean SLIMEFUN_WARFARE;
    public static final boolean DYNATECH;
    public static final boolean LITEXPANSION;

    public static final String CORE_NOTE = ThemeUtils.MAIN + "粘液匠魂(SlimeTinker)";
    public static final String INFINITY_EXPANSION_NOTE = ThemeUtils.ADD_INFINITY + "无尽科技(InfinityExpansion)";
    public static final String SLIMEFUN_WARFARE_NOTE = ThemeUtils.ADD_SLIMEFUN_WARFARE + "粘液军事(Slimefun Warfare)";
    public static final String DYNATECH_NOTE = ThemeUtils.ADD_DYNATECH + "动力科技(DynaTech)";
    public static final String LITEXPANSION_NOTE = ThemeUtils.ADD_LITEXPANSION + "工业(LiteXpansion)";

    static {
        PluginManager pluginManager = SlimeTinker.inst().getServer().getPluginManager();
        INFINITY_EXPANSION = pluginManager.isPluginEnabled("InfinityExpansion");
        SLIMEFUN_WARFARE = pluginManager.isPluginEnabled("SlimefunWarfare");
        DYNATECH = pluginManager.isPluginEnabled("DynaTech");
        LITEXPANSION = pluginManager.isPluginEnabled("LiteXpansion");
    }

}
