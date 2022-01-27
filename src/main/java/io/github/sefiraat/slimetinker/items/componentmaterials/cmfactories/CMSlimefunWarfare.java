package io.github.sefiraat.slimetinker.items.componentmaterials.cmfactories;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
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
public final class CMSlimefunWarfare {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.SEGGANESSON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SEGGANESSON, Objects.requireNonNull(SlimefunItem.getById("SEGGANESSON")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#4bacbf"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        "SEGGANESSON",
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SEGGANESSON,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "超载",
                            "每次攻击的初始伤害会被存储",
                            "每10次攻击会释放所有已存储的伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "失明速度",
                            "获得速度V效果",
                            "获得失明效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "引力",
                            "所有附近的实体",
                            "会被缓慢地拖向你"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "灵魂虹吸",
                            "每击杀一个敌对生物可收集1个灵魂",
                            "每100个灵魂 +1% 输出伤害"
                        ))
                ));

        map.put(IDStrings.SLIMESTEEL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SLIMESTEEL, Objects.requireNonNull(SlimefunItem.getById("SLIMESTEEL_INGOT")).getItem(), SkullTextures.ALLOY_GREEN, "#aed197"),
                    Arrays.asList(
                        CMCore.getMap().get(IDStrings.STEEL).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.SLIME).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        Materials.NUGGET_CAST_SLIMESTEEL.getItemId(),
                        "SLIMESTEEL_INGOT",
                        Materials.BLOCK_CAST_SLIMESTEEL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SLIMESTEEL,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "弹性 II",
                            "-50% 摔落伤害",
                            "获得跳跃提升II效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        // TODO: 粘液块效果似乎暂未实装
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "月面弹跳",
                            "当用于靴子时",
                            "免疫摔落伤害",
                            "踩在粘液块上可以弹得更高"
                        ),
                        null)
                ));

        map.put(IDStrings.REINFORCED_SLIMESTEEL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.REINFORCED_SLIMESTEEL, Objects.requireNonNull(SlimefunItem.getById("REINFORCED_SLIMESTEEL_INGOT")).getItem(), SkullTextures.ALLOY_GREEN, "#aed197"),
                    Arrays.asList(
                        map.get(IDStrings.SLIMESTEEL).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.SLIME).getLiquidItemStack(9),
                        CMCore.getMap().get(IDStrings.DAMSTEEL).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.HARD).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.CORBRONZE).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.ALUBRONZE).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_REINFORCED_SLIMESTEEL.getItemId(),
                        "REINFORCED_SLIMESTEEL_INGOT",
                        Materials.BLOCK_CAST_REINFORCED_SLIMESTEEL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.REINFORCED_SLIMESTEEL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "强力粘液",
                            "当物品栏有空间时",
                            "掉落的方块将直接进入物品栏中",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "灵活",
                            "仅在工具未损坏时有效",
                            "-50% 承受伤害",
                            "消耗与初始伤害数值相同的耐久",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "刚性与柔性",
                            "获得速度效果",
                            "获得跳跃提升效果",
                            "+10% 承受伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "射偏了",
                            "有10%的几率免疫来自弹射物的伤害"
                        ))
                ));

        map.put(IDStrings.OSMIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.OSMIUM, Objects.requireNonNull(SlimefunItem.getById("OSMIUM_INGOT")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#8dd6c0"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_OSMIUM.getItemId(),
                        "OSMIUM_INGOT",
                        Materials.BLOCK_CAST_OSMIUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.OSMIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "锤子",
                            "可挖掘 3x3x3 区域",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "重型鞍座",
                            "命中的目标会被减速",
                            "并且无法传送",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "增重",
                            "获得减速效果",
                            "受到伤害时,攻击者会被击退"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "画笔",
                            "有5%的几率被承受伤害治疗"
                        ))
                ));

        map.put(IDStrings.OSMIUM_SUPERALLOY,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.OSMIUM_SUPERALLOY, Objects.requireNonNull(SlimefunItem.getById("OSMIUM_SUPERALLOY")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#8dd6c0"),
                    Arrays.asList(
                        map.get(IDStrings.OSMIUM).getLiquidItemStack(2),
                        map.get(IDStrings.SEGGANESSON).getLiquidItemStack(1),
                        map.get(IDStrings.REINFORCED_SLIMESTEEL).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.REINFORCED).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_OSMIUM_SUPER_ALLOY.getItemId(),
                        "OSMIUM_SUPERALLOY",
                        Materials.BLOCK_CAST_OSMIUM_SUPER_ALLOY.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.OSMIUM_SUPERALLOY,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "野蛮人",
                            "获得挖掘疲劳效果",
                            "命中的目标会被禁锢",
                            "+100% 输出伤害",
                            "有33的几率额外 +100% 输出伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "击退",
                            "击退任何命中的生物",
                            "有几率禁锢目标",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "闪电风暴",
                            "当装备全套有闪电风暴特性的盔甲时",
                            "有几率在周围召唤闪电风暴"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "部分衰变",
                            "有几率随机对周围生物造成伤害",
                            "不会致死"
                        ))
                ));

        map.put(IDStrings.UNPATENTABLIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.UNPATENTABLIUM, Objects.requireNonNull(SlimefunItem.getById("UNPATENTABLIUM")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#8dd6c0"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_UNPATENTABILUM.getItemId(),
                        "UNPATENTABLIUM",
                        Materials.BLOCK_CAST_UNPATENTABILUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.UNPATENTABLIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "创新",
                            "在白天: ",
                            "+100% 工具经验获取",
                            "+100% 玩家经验获取",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "无形权利",
                            "工具无法被丢弃",
                            "不会在死亡时掉落",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "强力凝视",
                            "你看向的实体会传送到你身边",
                            "不会对玩家、凋零、末影龙生效"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                            "圆桌骑士",
                            "受到伤害时有几率",
                            "在周围生成圆桌骑士",
                            "(好吧,是铁傀儡)"
                        )
                    )
                ));

        setupToolConsumers();
        setupArmourConsumers();

    }

    public static void setupToolConsumers() {

        map.get(IDStrings.SEGGANESSON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSegganesson);                                           // Blinding Speed
        map.get(IDStrings.SLIMESTEEL).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindSlimesteel);                                         // Bouncy II - Tick
        map.get(IDStrings.SLIMESTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindSlimesteel);                      // Bouncy II - Damage
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headOsmiumSuperalloy);            // Brute - Damage
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headOsmiumSuperalloy);                              // Brute - Tick
        map.get(IDStrings.REINFORCED_SLIMESTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.ROD, PlayerDamagedEvents::headReinforcedSlimesteel);    // Flexibility
        map.get(IDStrings.OSMIUM).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::explosive);                                        // Heavy (CO)
        map.get(IDStrings.OSMIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodOsmium);                                   // Heavy Pommel
        // Incorporeal Right (Special case in ItemDrop and PlayerDesth)
        map.get(IDStrings.UNPATENTABLIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headUnpatentabilum);                 // Innovation - Damage
        map.get(IDStrings.UNPATENTABLIUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headUnpatentabilum);                      // Innovation - Block Break
        map.get(IDStrings.SEGGANESSON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSegganesson);                       // Overcharge
        map.get(IDStrings.REINFORCED_SLIMESTEEL).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headReinforcedSlimesteel);         // Strong and Sticky
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headHard);                         // Tuff Stuff (CO)

    }

    public static void setupArmourConsumers() {

        map.get(IDStrings.REINFORCED_SLIMESTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksReinforcedSlimesteel);  // Deflection
        map.get(IDStrings.OSMIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksOsmium);                               // Draw
        map.get(IDStrings.SEGGANESSON).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateSegganesson);                                        // Gravity
        map.get(IDStrings.OSMIUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateOsmium);                                                  // Increased Mass - Slow
        map.get(IDStrings.OSMIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateOsmium);                               // Increased Mass - Knockback
        map.get(IDStrings.UNPATENTABLIUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateUnpatentabilum);                                  // Intense Gase
        map.get(IDStrings.UNPATENTABLIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::plateMetal);                        // KOTR (CO)
        map.get(IDStrings.SLIMESTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.GAMBESON, PlayerDamagedEvents::gambesonSlimeSteel);                 // Moon Bounce
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksOsmiumSuperalloy);                             // Partial Decay
        map.get(IDStrings.REINFORCED_SLIMESTEEL).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateReinforcedSlimesteel);                     // Rigid Flexibility - Effects
        map.get(IDStrings.REINFORCED_SLIMESTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateReinforcedSlimesteel);  // Rigid Flexibility - Damage
        map.get(IDStrings.SEGGANESSON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.LINKS, EntityDamageEvents::linksSegganesson);                      // Soul Siphon
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateOsmiumSuperalloy);                             // Tempest

    }

}
