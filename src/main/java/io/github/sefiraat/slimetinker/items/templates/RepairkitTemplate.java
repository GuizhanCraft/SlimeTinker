package io.github.sefiraat.slimetinker.items.templates;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.dough.data.persistent.PersistentDataAPI;
import lombok.Getter;
import net.guizhanss.minecraft.slimetinker.utils.LangUtils;
import net.md_5.bungee.api.ChatColor;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class RepairkitTemplate extends UnplaceableBlock {

    private final String name;
    @Getter
    private String materialType;

    public RepairkitTemplate(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, String name) {
        super(itemGroup, item, recipeType, recipe);
        this.name = name;
    }

    public static boolean isRepairKit(ItemStack itemStack) {
        NamespacedKey key = SlimeTinker.inst().getKeys().getPartClass();
        ItemMeta im = itemStack.getItemMeta();
        Validate.notNull(im, "Meta is null, wrong wrong wrong.");
        String value = PersistentDataAPI.getString(im, key);
        return value != null && value.equals(IDStrings.REPAIR);
    }

    public String getName(String material) {
        return LangUtils.getMaterialName(material) + ThemeUtils.ITEM_PART + " " + name;
    }

    public List<String> getLore(String material, ChatColor color) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add(ThemeUtils.PASSIVE + "一套修复工具");
        list.add(ThemeUtils.PASSIVE + "可以在匠魂修复台中");
        list.add(ThemeUtils.PASSIVE + "修复损坏的工具");
        list.add(ThemeUtils.PASSIVE + "材质与该工具的头部对应");
        list.add("");
        list.add(ThemeUtils.CLICK_INFO + "材质: " + color + ThemeUtils.toTitleCase(material));
        return list;
    }

    public ItemStack getStack(String material, String partClass, ChatColor color) {
        ItemStack itemStack = this.getItem().clone();
        itemStack.setType(Material.CHEST_MINECART);
        ItemMeta im = itemStack.getItemMeta();
        Validate.notNull(im, "Meta be null y'all!");
        im.setLore(getLore(material, color));
        im.setDisplayName(color + getName(material));
        PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartMaterial(), material);
        PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartClass(), partClass);

        itemStack.setItemMeta(im);
        return itemStack;
    }

}

