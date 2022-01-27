package io.github.sefiraat.slimetinker.items.componentmaterials.cmelements;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.items.componentmaterials.ComponentMaterial;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.managers.TraitManager;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;

@Getter
public class CMTraits {

    public static final SlimefunItemStack PROP_HEAD =
        ThemeUtils.themedItemStack(
            "PROP_HEAD",
            SkullTextures.PART_SWORD_BLADE,
            ThemeItemType.PART,
            "部件: 头部",
            ThemeUtils.PASSIVE + "任何头部部件",
            ThemeUtils.PASSIVE + "(例如: 镐头,铲头,斧刃等)"
        );
    public static final SlimefunItemStack PROP_BINDING =
        ThemeUtils.themedItemStack(
            "PROP_BINDING",
            SkullTextures.PART_BINDING,
            ThemeItemType.PART,
            "部件: 绑定结",
            ThemeUtils.PASSIVE + "任何绑定结部件"
        );
    public static final SlimefunItemStack PROP_ROD =
        ThemeUtils.themedItemStack(
            "PROP_ROD",
            SkullTextures.PART_TOOL_ROD,
            ThemeItemType.PART,
            "部件: 手柄",
            ThemeUtils.PASSIVE + "任何手柄部件"
        );
    public static final SlimefunItemStack PROP_PLATES =
        ThemeUtils.themedItemStack(
            "PROP_PLATES",
            SkullTextures.PART_CHEST_PLATES,
            ThemeItemType.PART,
            "部件: 盔甲板",
            ThemeUtils.PASSIVE + "任何盔甲板部件",
            ThemeUtils.PASSIVE + "(例如: 头盔板,胸甲板等)"
        );
    public static final SlimefunItemStack PROP_GAMBESON =
        ThemeUtils.themedItemStack(
            "PROP_GAMBESON",
            SkullTextures.PART_GAMBESON,
            ThemeItemType.PART,
            "部件: 护身软甲",
            ThemeUtils.PASSIVE + "任何护身软甲部件"
        );
    public static final SlimefunItemStack PROP_LINKS =
        ThemeUtils.themedItemStack(
            "PROP_LINKS",
            SkullTextures.PART_LINKS,
            ThemeItemType.PART,
            "部件: 盔甲接合物",
            ThemeUtils.PASSIVE + "任何盔甲接合物部件"
        );
    private final String materialID;
    @Nullable
    private final CMTrait traitHead;
    @Nullable
    private final CMTrait traitBind;
    @Nullable
    private final CMTrait traitRod;
    @Nullable
    private final CMTrait traitPlates;
    @Nullable
    private final CMTrait traitGambeson;
    @Nullable
    private final CMTrait traitLinks;
    private ComponentMaterial parent;

    public CMTraits(String materialID, @Nullable CMTrait traitHead, @Nullable CMTrait traitBind, @Nullable CMTrait traitRod, @Nullable CMTrait traitPlates, @Nullable CMTrait traitGambeson, @Nullable CMTrait traitLinks) {
        this.materialID = materialID;

        this.traitHead = traitHead;
        this.traitBind = traitBind;
        this.traitRod = traitRod;
        this.traitPlates = traitPlates;
        this.traitGambeson = traitGambeson;
        this.traitLinks = traitLinks;
    }

    protected static ItemStack[] propRecipe(SlimefunItemStack part, ItemStack stack) {
        return new ItemStack[]{
            null, null, null,
            part, null, stack,
            null, null, null
        };
    }

    protected static String getTraitTexture(String addedBy) {
        if (addedBy.equals(SupportedPluginsManager.CORE_NOTE)) {
            return SkullTextures.TRAITS_CORE;
        } else if (addedBy.equals(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)) {
            return SkullTextures.TRAITS_INFINITY;
        } else if (addedBy.equals(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)) {
            return SkullTextures.TRAITS_WARFARE;
        } else if (addedBy.equals(SupportedPluginsManager.DYNATECH_NOTE)) {
            return SkullTextures.TRAITS_DYNATECH;
        } else if (addedBy.equals(SupportedPluginsManager.LITEXPANSION_NOTE)) {
            return SkullTextures.TRAITS_LITEXPANSION;
        }
        return "error";
    }

    public void setupTraits(ComponentMaterial parent) {
        this.parent = parent;
        TraitManager manager = SlimeTinker.inst().getTraitManager();

        if (traitHead != null && manager.getEnabled(this.materialID, IDStrings.HEAD)) {
            traitHead.setupTrait(this, parent);
        }
        if (traitBind != null && manager.getEnabled(this.materialID, IDStrings.BINDING)) {
            traitBind.setupTrait(this, parent);
        }
        if (traitRod != null && manager.getEnabled(this.materialID, IDStrings.ROD)) {
            traitRod.setupTrait(this, parent);
        }

        if (traitPlates != null && manager.getEnabled(this.materialID, IDStrings.PLATE)) {
            traitPlates.setupTrait(this, parent);
        }
        if (traitGambeson != null && manager.getEnabled(this.materialID, IDStrings.GAMBESON)) {
            traitGambeson.setupTrait(this, parent);
        }
        if (traitLinks != null && manager.getEnabled(this.materialID, IDStrings.LINKS)) {
            traitLinks.setupTrait(this, parent);
        }

        manager.save();
    }

}
