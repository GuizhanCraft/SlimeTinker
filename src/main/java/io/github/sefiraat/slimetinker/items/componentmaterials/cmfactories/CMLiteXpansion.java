package io.github.sefiraat.slimetinker.items.componentmaterials.cmfactories;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
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
public final class CMLiteXpansion {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.RUBBER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.RUBBER, Objects.requireNonNull(SlimefunItem.getById("RUBBER")).getItem(), SkullTextures.ALLOY_BROWN, "#38414d"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        Objects.requireNonNull(SlimefunItem.getById("RUBBER")).getId(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.RUBBER,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "绝缘",
                            "免疫闪电伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "出汗",
                            "橡胶护身软甲真的太热了!"
                        ),
                        null)
                ));

        map.put(IDStrings.REFINED_IRON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.REFINED_IRON, Objects.requireNonNull(SlimefunItem.getById("REFINED_IRON")).getItem(), SkullTextures.ALLOY_SILVER, "#ababab"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_REFINED_IRON.getItemId(),
                        Objects.requireNonNull(SlimefunItem.getById("REFINED_IRON")).getId(),
                        Materials.BLOCK_CAST_REFINED_IRON.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.REFINED_IRON,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "真的稳定",
                            "真的没有特性",
                            "不过也许升级后会有呢?",
                            "(工具10级达到后",
                            "+(工具等级 * 10)% 输出伤害)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "不知礼，无以立也",
                            "获得速度效果",
                            "+50% 输出伤害",
                            "你的战斗过程将变得炫酷",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "王牌特工",
                            "需要满足以下全部条件才能生效:",
                            "- 装备全套有王牌特工特性的盔甲",
                            "- 熟知礼仪 (不知礼，无以立也)",
                            "",
                            "右键点击时召唤毁灭阵",
                            "对阵中的所有生物造成伤害",
                            "(20分钟冷却时间)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "看不到我",
                            "攻击者获得失明效果"
                        ))
                ));

        map.put(IDStrings.MIXED_METAL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MIXED_METAL, Objects.requireNonNull(SlimefunItem.getById("MIXED_METAL_INGOT")).getItem(), SkullTextures.ALLOY_SILVER, "#6e7a66"),
                    Arrays.asList(
                        map.get(IDStrings.REFINED_IRON).getLiquidItemStack(3),
                        CMCore.getMap().get(IDStrings.BRONZE).getLiquidItemStack(3),
                        CMCore.getMap().get(IDStrings.TIN).getLiquidItemStack(3)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_MIXED_METAL.getItemId(),
                        Objects.requireNonNull(SlimefunItem.getById("MIXED_METAL_INGOT")).getId(),
                        Materials.BLOCK_CAST_MIXED_METAL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.MIXED_METAL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "合金",
                            "随机获得其冶炼材料的特性",
                            "但效果减半",
                            "(随机获得速度,防火,幸运效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "倒霉鬼",
                            "+50% 输出伤害",
                            "获得厄运III效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "有经验的",
                            "+10% 工具经验获取",
                            "+10% 玩家经验获取"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "混乱",
                            "受到攻击时",
                            "有几率与攻击者互换位置"
                        ))
                ));

        map.put(IDStrings.ADVANCED_ALLOY,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ADVANCED_ALLOY, Objects.requireNonNull(SlimefunItem.getById("ADVANCED_ALLOY")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#78aba2"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_ADVANCED_ALLOY.getItemId(),
                        Objects.requireNonNull(SlimefunItem.getById("ADVANCED_ALLOY")).getId(),
                        Materials.BLOCK_CAST_ADVANCED_ALLOY.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.ADVANCED_ALLOY,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "散射",
                            "攻击时对周围所有生物同时造成伤害",
                            "散射的伤害不会受到其他特性或模组的影响",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "高负荷",
                            "每损失50点耐久,会",
                            "消耗一块铁锭来恢复50点耐久",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "更加高级",
                            "Advanced modifiers +1 for each piece.",
                            "(开发中的特性,暂不翻译)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "高温",
                            "有几率使周围实体着火"
                        ))
                ));

        map.put(IDStrings.THORIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.THORIUM, Objects.requireNonNull(SlimefunItem.getById("THORIUM")).getItem(), SkullTextures.ALLOY_GREEN, "#33de4d"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        Objects.requireNonNull(SlimefunItem.getById("THORIUM")).getId(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.THORIUM,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null)
                ));

        map.put(IDStrings.MAG_THOR,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MAG_THOR, Objects.requireNonNull(SlimefunItem.getById("MAG_THOR")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#33de4d"),
                    Arrays.asList(
                        CMCore.getMap().get(IDStrings.REINFORCED).getLiquidItemStack(1),
                        map.get(IDStrings.THORIUM).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.MAGNESIUM).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.ZINC).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_MAG_THOR.getItemId(),
                        Objects.requireNonNull(SlimefunItem.getById("MAG_THOR")).getId(),
                        Materials.BLOCK_CAST_MAG_THOR.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.MAG_THOR,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "耐热",
                            "你可以在岩浆里游泳",
                            "(免疫火焰与岩浆伤害)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "吸血鬼",
                            "造成伤害时有33%的几率恢复1点血量",
                            "-50% 伤害(日间)",
                            "+50% 伤害(夜间)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "放射性盔甲板",
                            "受到伤害时",
                            "对攻击者施加中毒效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "建筑狂怒",
                            "有20%的几率在受到伤害时",
                            "获得速度效果",
                            "获得急迫效果"
                        ))
                ));

        map.put(IDStrings.CARBON_MESH,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.CARBON_MESH, Objects.requireNonNull(SlimefunItem.getById("RAW_CARBON_MESH")).getItem(), SkullTextures.ALLOY_BROWN, "#192927"),
                    null,
                    new CMToolMakeup(false, true, false, true, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        Objects.requireNonNull(SlimefunItem.getById("RAW_CARBON_MESH")).getId(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.CARBON_MESH,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "敏捷",
                            "获得速度效果",
                            "-33% 承受伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "碳纤维",
                            "获得速度效果"
                        ),
                        null)
                ));

        map.put(IDStrings.SCRAP,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SCRAP, Objects.requireNonNull(SlimefunItem.getById("SCRAP")).getItem(), SkullTextures.ALLOY_BROWN, "#5c451d"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_SCRAP.getItemId(),
                        Objects.requireNonNull(SlimefunItem.getById("SCRAP")).getId(),
                        Materials.BLOCK_CAST_SCRAP.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SCRAP,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "可怕",
                            "+300% 耐久消耗",
                            "-100% 工具经验获取",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "这是个脑力活",
                            "+100% 工具经验获取",
                            "-50% 输出伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "可悲",
                            "警告: 不要穿上这件盔甲",
                            "会有坏事发生",
                            "+400% 玩家经验获取"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "分崩离析",
                            "+200% 玩家经验获取",
                            "受到伤害时护甲有几率直接掉落"
                        ))
                ));

        map.put(IDStrings.IRIDIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.IRIDIUM, Objects.requireNonNull(SlimefunItem.getById("IRIDIUM")).getItem(), SkullTextures.ALLOY_PINK, "#c999c9"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_IRIDIUM.getItemId(),
                        Objects.requireNonNull(SlimefunItem.getById("IRIDIUM")).getId(),
                        Materials.BLOCK_CAST_IRIDIUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.IRIDIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "保护",
                            "使你免于死亡",
                            "(20分钟冷却时间)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "别看我",
                            "使目标看向你的朝向",
                            "(20秒冷却时间)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "不屈",
                            "承受伤害的10%会被反弹至攻击者"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.LITEXPANSION_NOTE,
                            "非常规力量",
                            "承受的伤害会被转化为能源",
                            "并存储在盔甲中(伤害不会被取消)",
                            "右键点击释放存储的能源",
                            "用于给物品栏中所有的物品充电"
                        ))
                ));

        setupToolConsumers();
        setupArmourConsumers();

    }

    public static void setupToolConsumers() {

        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headCopper);                            // Brains not brawn - Damage             |
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::headCopper);                                 // Brains not brawn - Block Break        | - CO Copper Head
        map.get(IDStrings.ADVANCED_ALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headAdvancedAlloy);           // Cleave
        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headMagThor);                      // Heat Resistance
        map.get(IDStrings.ADVANCED_ALLOY).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::rodAdvancedAlloy);                   // Heavy Duty
        map.get(IDStrings.RUBBER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindRubber);                       // Insulated
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodRefinedIron);                 // Manners Maketh Man - Damage
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.ROD, RightClickEvents::rodRefinedIron);                      // Manners Maketh Man - Right Click (Register Manners)
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodRefinedIron);                                   // Manners Maketh Man - Tick
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headMixedMetal);                                   // Mixed Metals
        map.get(IDStrings.CARBON_MESH).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindCarbonMesh);              // Nimble - Player Damage
        map.get(IDStrings.CARBON_MESH).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindCarbonMesh);                                 // Nimble - Tick
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headIridium);                       // Protective
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headRefinedIron);               // Really Stable
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headBrass);                       // Stiff - Damage                        |
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::headBrass);                                         // Stiff - Tick                          | - CO Brass Head
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headScrap);                                  // Terrible - Durability
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headScrap);                            // Terrible - Damage
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headScrap);                                 // Terrible - Block Break
        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headDamsteel);                       // Vampirism                             | - CO DamSteel Head
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodIridium);                          // Warp

    }

    public static void setupArmourConsumers() {

        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksMagThor);                    // Building Rage
        map.get(IDStrings.CARBON_MESH).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonCarbonMesh);                           // Carbon Fibre
        // Event More Advanced (mod affector)
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::linksAdamantite);               // Experienced (CO) - Kill
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.PLATE, BlockBreakEvents::linksAdamantite);                    // Experienced (CO) - Block Break
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.LINKS, EntityDamageEvents::linksScrap);                          // Falling Apart - Exp
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksScrap);                         // Falling Apart - Drop
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateIridium);                     // Indomitable
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.PLATE, RightClickEvents::plateRefinedIron);                  // Kingsman
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksMixedMetal);              // Mix it Up
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksRefinedIron);            // Narrowing
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateScrap);                         // Pathetic - Death
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateScrap);                          // Pathetic - Exp
        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateMagThor);                    // Radioactive Plates
        map.get(IDStrings.ADVANCED_ALLOY).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::plateCorBronze);                               // SuperHot (CO)
        map.get(IDStrings.RUBBER).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonRubber);                                    // Sweaty
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksIridium);                     // Unconventional Power - Store
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.LINKS, RightClickEvents::linksIridium);                           // Unconventional Power - Charge

    }

}
