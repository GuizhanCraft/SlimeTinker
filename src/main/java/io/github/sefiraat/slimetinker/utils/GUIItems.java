package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.items.componentmaterials.CMManager;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import net.guizhanss.minecraft.slimetinker.utils.LangUtils;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public final class GUIItems {

    private GUIItems() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItemStack menuBackgroundInput() {
        return new CustomItemStack(
            Material.LIGHT_BLUE_STAINED_GLASS_PANE,
            ChatColor.BLUE + "输入",
            " "
        );
    }

    public static CustomItemStack menuBackgroundOutput() {
        return new CustomItemStack(
            Material.ORANGE_STAINED_GLASS_PANE,
            ChatColor.RED + "输出",
            " "
        );
    }

    public static CustomItemStack menuBackgroundCast() {
        return new CustomItemStack(
            Material.LIME_STAINED_GLASS_PANE,
            ChatColor.GREEN + "模具/模具原型",
            " "
        );
    }

    public static CustomItemStack menuPreview() {
        return new CustomItemStack(
            Material.LIME_STAINED_GLASS_PANE,
            ChatColor.GREEN + "预览",
            " "
        );
    }

    public static CustomItemStack menuBackgroundPreview() {
        return new CustomItemStack(
            Material.LIME_STAINED_GLASS_PANE,
            ChatColor.GREEN + "预览",
            " "
        );
    }

    public static CustomItemStack menuMarkerRod() {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.RED + "放入手柄",
            ThemeUtils.PASSIVE + "在下面的栏位放入手柄部件"
        );
    }

    public static CustomItemStack menuMarkerBinder() {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.RED + "放入绑定结",
            ThemeUtils.PASSIVE + "在下面的栏位放入绑定结部件"
        );
    }

    public static CustomItemStack menuMarkerHead() {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.RED + "放入工具/武器头",
            ThemeUtils.PASSIVE + "在下面的栏位放入工具/武器头部件"
        );
    }

    public static CustomItemStack menuMarkerLinks() {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.RED + "放入盔甲接合物",
            ThemeUtils.PASSIVE + "在下面的栏位放入盔甲接合物部件"
        );
    }

    public static CustomItemStack menuMarkerGambeson() {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.RED + "放入护身软甲",
            ThemeUtils.PASSIVE + "在下面的栏位放入护身软甲"
        );
    }

    public static CustomItemStack menuMarkerPlates() {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.RED + "放入盔甲板",
            ThemeUtils.PASSIVE + "在下面的栏位放入盔甲板"
        );
    }

    public static CustomItemStack menuLavaInfo(int fillPercent, int fillAmt, int fillMax) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_5));
        } else if (fillPercent >= 75) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_4));
        } else if (fillPercent >= 50) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_3));
        } else if (fillPercent >= 25) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_2));
        } else if (fillPercent > 0) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_1));
        } else {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_EMPTY));
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "岩浆罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "岩浆: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        return new CustomItemStack(
            skull,
            meta
        );
    }

    public static CustomItemStack menuMetalInfo(int fillPercent, int fillAmt, int fillMax, @Nullable Map<String, Integer> map) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_5));
        } else if (fillPercent >= 75) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_4));
        } else if (fillPercent >= 50) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_3));
        } else if (fillPercent >= 25) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_2));
        } else if (fillPercent > 0) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_1));
        } else {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_EMPTY));
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "金属罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "金属容量: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        meta.add("");
        if (map != null) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String name =
                    CMManager.getById(e.getKey()).getColor() +
                        LangUtils.getMaterialName(e.getKey());
                String amount = e.getValue().toString();
                meta.add(ThemeUtils.CLICK_INFO + name + ": " + ChatColor.WHITE + amount + " 单位");
            }
        }
        meta.add("");
        meta.add(ThemeUtils.PASSIVE + "浇铸将从" + ChatColor.BOLD + "最上层" + ThemeUtils.PASSIVE + "的金属开始");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "点击" + ChatColor.WHITE + "将最上层的金属移至最下层");
        return new CustomItemStack(
            skull,
            meta
        );
    }

    public static CustomItemStack menuPurge() {
        return new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUTTON_PURGE)),
            ThemeUtils.GUI_HEAD + "清除金属",
            "",
            ThemeUtils.PASSIVE + "可以从金属罐中直接清楚不需要的金属",
            "",
            ThemeUtils.CLICK_INFO + "左键点击" + ChatColor.WHITE + "移除最上层金属",
            ThemeUtils.CLICK_INFO + "右键点击" + ChatColor.WHITE + "移除所有金属"
        );
    }

    public static CustomItemStack menuAlloy() {
        return new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUTTON_ALLOY)),
            ThemeUtils.GUI_HEAD + "冶炼合金",
            "",
            ThemeUtils.PASSIVE + "混合金属罐中的液体",
            ThemeUtils.PASSIVE + "来尝试冶炼合金"
        );
    }

    public static CustomItemStack menuPour() {
        return new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUCKET_ORANGE)),
            ThemeUtils.GUI_HEAD + "浇铸",
            "",
            ThemeUtils.PASSIVE + "将最上层的金属进行浇铸",
            ThemeUtils.PASSIVE + "模具将决定熔融金属的样式",
            ThemeUtils.PASSIVE + "成品将在输出栏中"
        );
    }

    public static CustomItemStack menuCraftWorkbench() {
        return new CustomItemStack(
            Material.FLETCHING_TABLE,
            ThemeUtils.GUI_HEAD + "合成",
            "",
            ThemeUtils.CLICK_INFO + "点击此处" + ChatColor.WHITE + "合成物品"
        );
    }

    public static CustomItemStack menuCraftToolTable() {
        return new CustomItemStack(
            Material.SMITHING_TABLE,
            ThemeUtils.GUI_HEAD + "组装工具/武器",
            "",
            ThemeUtils.PASSIVE + "将三个部件组装成工具/武器:",
            ThemeUtils.PASSIVE + "手柄,绑定结,工具/武器头",
            ThemeUtils.CLICK_INFO + "点击此处" + ChatColor.WHITE + "组装"
        );
    }

    public static CustomItemStack menuCraftArmourTable() {
        return new CustomItemStack(
                Material.SMITHING_TABLE,
                ThemeUtils.GUI_HEAD + "组装防具",
                "",
                ThemeUtils.PASSIVE + "将三个部件组装成防具:",
                ThemeUtils.PASSIVE + "盔甲板,护身软甲,盔甲接合物",
                ThemeUtils.CLICK_INFO + "点击此处" + ChatColor.WHITE + "组装"
        );
    }

    public static CustomItemStack menuCraftRepair() {
        return new CustomItemStack(
            Material.CARTOGRAPHY_TABLE,
            ThemeUtils.GUI_HEAD + "修复",
            "",
            ThemeUtils.PASSIVE + "在第一格中放入需要修复的工具/防具",
            ThemeUtils.PASSIVE + "在第二格中放入工具头/盔甲板对应材质的修复工具",
            ThemeUtils.CLICK_INFO + "点击此处" + ChatColor.WHITE + "修复"
        );
    }

    public static CustomItemStack menuCraftMod() {
        return new CustomItemStack(
            Material.GRINDSTONE,
            ThemeUtils.GUI_HEAD + "安装模组",
            ThemeUtils.PASSIVE + "在第一格中放入工具/武器/防具",
            ThemeUtils.PASSIVE + "在第二格中放入要安装的模组",
            ThemeUtils.CLICK_INFO + "点击此处" + ChatColor.WHITE + "安装模组"
        );
    }

    public static CustomItemStack menuCraftSwap() {
        return new CustomItemStack(
            Material.LOOM,
            ThemeUtils.GUI_HEAD + "更换部件",
            "",
            ThemeUtils.PASSIVE + "在第一格中放入工具/武器/防具",
            ThemeUtils.PASSIVE + "在第二格中放入要更换的部件",
            ThemeUtils.CLICK_INFO + "点击此处" + ChatColor.WHITE + "更换部件"
        );
    }

}
