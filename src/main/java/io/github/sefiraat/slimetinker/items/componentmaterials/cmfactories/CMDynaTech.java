package io.github.sefiraat.slimetinker.items.componentmaterials.cmfactories;

import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.RightClickEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.events.friend.TraitEventType;
import io.github.sefiraat.slimetinker.events.friend.TraitPartType;
import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.componentmaterials.ComponentMaterial;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMForms;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMIdentity;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMToolMakeup;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMTrait;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMTraits;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Getter;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SuppressWarnings("SpellCheckingInspection")
@UtilityClass
public final class CMDynaTech {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.STAINLESS_STEEL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.STAINLESS_STEEL, Objects.requireNonNull(SlimefunItem.getById("STAINLESS_STEEL")).getItem(), SkullTextures.ALLOY_SILVER, "#d1d1d1"),
                    Arrays.asList(
                        CMCore.getMap().get(IDStrings.IRON).getLiquidItemStack(2),
                        CMCore.getMap().get(IDStrings.ZINC).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_STAINLESSSTEEL.getItemId(),
                        SlimefunItem.getById("STAINLESS_STEEL").getId(),
                        Materials.BLOCK_CAST_STAINLESSSTEEL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.STAINLESS_STEEL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "超级不锈钢",
                            "真的，绝对是不锈钢",
                            "可以抵挡更多鲜血",
                            "(更多花里胡哨的炫酷效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "餐具",
                            "攻击动物可直接喂食自己",
                            "真不错...",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "标准",
                            "-5% 承受伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "水里是安全的",
                            "获得水下呼吸效果"
                        ))
                ));

        map.put(IDStrings.VEX_GEM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.VEX_GEM, Objects.requireNonNull(SlimefunItem.getById("VEX_GEM")).getItem(), SkullTextures.ALLOY_BLUE, "#38c0c2"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        SlimefunItem.getById("VEX_GEM").getId(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.VEX_GEM,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "土遁",
                            "右键点击随机传送到附近",
                            "(5分钟冷却时间)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "真让人烦恼",
                            "恼鬼宝石不应该这样用!"
                        ),
                        null)
                ));

        map.put(IDStrings.STARDUST,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.STARDUST, Objects.requireNonNull(SlimefunItem.getById("STAR_DUST")).getItem(), SkullTextures.ALLOY_SILVER, "#fdff96"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        null,
                        Objects.requireNonNull(SlimefunItem.getById("STARDUST_METEOR")).getId(),
                        Objects.requireNonNull(SlimefunItem.getById("STAR_DUST")).getId(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.STARDUST,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "光煞",
                            "+50% 输出伤害",
                            "攻击可使目标眩晕",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "Yvaine",
                            "\"不要向流星许愿，否则它就会变成女人\"",
                            "获得发光效果",
                            "周围的村民会不断向你聚集",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "星光",
                            "有5%的几率",
                            "在夜间恢复1点血量(半颗心)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "魔童",
                            "获得1层魔童效果",
                            "当拥有4层及以上的魔童效果时",
                            "击退周围5格内的所有的敌对生物",
                            "(凋零与末影龙除外)"
                        ))
                ));

        map.put(IDStrings.GHOSTLY_ESSENCE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.GHOSTLY_ESSENCE, Objects.requireNonNull(SlimefunItem.getById("GHOSTLY_ESSENCE")).getItem(), SkullTextures.ALLOY_BROWN, "#d4ffef"),
                    null,
                    new CMToolMakeup(false, true, true, false, true, true),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        Objects.requireNonNull(SlimefunItem.getById("GHOSTLY_ESSENCE")).getId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.GHOSTLY_ESSENCE,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "幽灵形态",
                            "免疫来自弹射物的伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "超立方体 [B]",
                            "只有 [A] 与 [B] 同时存在时才会生效",
                            "",
                            ThemeUtils.CLICK_INFO + "Shift + 右键点击" + ThemeUtils.PASSIVE + "存储位置",
                            ThemeUtils.CLICK_INFO + "右键点击" + ThemeUtils.PASSIVE + "传送到存储的位置",
                            "(10分钟冷却时间)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "攻壳机动队",
                            "消耗耐久来缓慢攻击周围所有生物",
                            "该特性不会致死",
                            "(消耗耐久不受其他特性,模组,附魔的影响)"
                        ),
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "幽灵之影",
                            "像幽灵一样盘旋",
                            "(获得飘浮效果)"
                        ))
                ));

        map.put(IDStrings.TESSERACT,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.TESSERACT, Objects.requireNonNull(SlimefunItem.getById("TESSERACTING_OBJ")).getItem(), SkullTextures.ALLOY_TAN, "#c7ba9f"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        Objects.requireNonNull(SlimefunItem.getById("TESSERACTING_OBJ")).getId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.TESSERACT,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "超立方体 [A]",
                            "只有 [A] 与 [B] 同时存在时才会生效",
                            "",
                            ThemeUtils.CLICK_INFO + "Shift + 右键点击" + ThemeUtils.PASSIVE + "存储位置",
                            ThemeUtils.CLICK_INFO + "右键点击" + ThemeUtils.PASSIVE + "将自己召回到存储的位置",
                            "(10分钟冷却时间)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "光学能量",
                            "需要全套包含双光学能量特性的盔甲",
                            "(每件盔甲需要有2个光学能量特性)才能生效",
                            "当你处于异次元之家中时，会不断积累光学能量",
                            "当受到伤害时，光学能量会被释放用于抵消伤害",
                            "(伤害为经过增伤/减伤计算后)",
                            "1点光学能量可以抵消1点伤害",
                            "若光学能量不足以抵消全部伤害,则不会抵消任何伤害",
                            "每件盔甲最多可以存储50点光学能量",
                            "全套盔甲最多可以存储200点光学能量"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.DYNATECH_NOTE,
                            "光学能量",
                            "需要8个光学能量特性才能生效",
                            "(每件盔甲需要有2个光学能量特性)",
                            "当你处于异次元之家中时，会不断积累光学能量",
                            "当受到伤害时，光学能量会被释放用于抵消伤害",
                            "(伤害为经过增伤/减伤计算后)",
                            "1点光学能量可以抵消1点伤害",
                            "若光学能量不足以抵消全部伤害,则不会抵消任何伤害",
                            "每件盔甲最多可以存储50点光学能量",
                            "全套盔甲最多可以存储200点光学能量"
                        ))
                ));

        setupToolConsumers();
        setupArmourConsumers();

    }

    public static void setupToolConsumers() {

        map.get(IDStrings.STARDUST).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headStarDust);                    // Bright Fury
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodStainlessSteel);         // Cutlery
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.HEAD, RightClickEvents::headTessMat);                         // HyperCube [A]
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.ROD, RightClickEvents::rodGhostly);                     // HyperCube [B]
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindGhostly);           // Incorporeal
        map.get(IDStrings.VEX_GEM).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.BINDER, RightClickEvents::bindVex);                             // NoClip
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headStainlessSteel);       // Super Dooper Stainless
        map.get(IDStrings.STARDUST).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodStarDust);                                        // Yvaine

    }

    public static void setupArmourConsumers() {

        map.get(IDStrings.VEX_GEM).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonVex);                                     // Annoying
        map.get(IDStrings.STARDUST).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::brightBurn);                                        // Brightburn (CO)
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonGhostly);                         // Ghost in the Shell
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksGhostly);                               // Ghostly
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::hyperbolic);                                       // Hyperbolic Tesseration - Links - Store
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::hyperbolic);                    // Hyperbolic Tesseration - Links - Absorb
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::hyperbolic);                                       // Hyperbolic Tesseration - Plate - Store
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::hyperbolic);                    // Hyperbolic Tesseration - Plate - Absorb
        map.get(IDStrings.STARDUST).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateStardust);                                     // Starshine
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateStainlessSteel);     // The Standard
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksStainlessSteel);                        // Water Safe

    }

}
