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
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("SpellCheckingInspection")
@UtilityClass
public final class CMCore {

    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.IRON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.IRON, SlimefunItems.IRON_DUST, SkullTextures.ALLOY_SILVER, "#8c8c8c"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Material.IRON_NUGGET.toString(),
                        Material.IRON_INGOT.toString(),
                        Material.IRON_BLOCK.toString(),
                        Material.IRON_ORE.toString(),
                        null,
                        SlimefunItems.IRON_DUST.getItemId(),
                        Material.IRON_BOOTS.toString(),
                        Material.IRON_LEGGINGS.toString(),
                        Material.IRON_CHESTPLATE.toString(),
                        Material.IRON_HELMET.toString()
                    ),
                    new CMTraits(
                        IDStrings.IRON,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "稳定",
                            "没有特性!"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "锋利 1",
                            "获得力量效果 (可叠加)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "坚固",
                            "有33%的几率免疫爆炸伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "腐蚀",
                            "-10% 输出伤害",
                            "+10% 玩家经验获取"
                        ))
                ));
        map.put(IDStrings.GOLD,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.GOLD, SlimefunItems.GOLD_DUST, SkullTextures.ALLOY_RED, "#ffe138"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Material.GOLD_NUGGET.toString(),
                        Material.GOLD_INGOT.toString(),
                        Material.GOLD_BLOCK.toString(),
                        Material.GOLD_ORE.toString(),
                        null,
                        SlimefunItems.GOLD_DUST.getItemId(),
                        Material.GOLDEN_BOOTS.toString(),
                        Material.GOLDEN_LEGGINGS.toString(),
                        Material.GOLDEN_CHESTPLATE.toString(),
                        Material.GOLDEN_HELMET.toString()
                    ),
                    new CMTraits(
                        IDStrings.GOLD,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "金色面纱",
                            "获得隐身效果",
                            "-100% 输出伤害,用于武器时",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "闪闪发光",
                            "获得发光效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "繁荣",
                            "在受到伤害时",
                            "有1%几率掉落1个金粒"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "来个交易",
                            "猪灵会被你吸引",
                            "(周围5格内的猪灵不会攻击你)"
                        ))
                ));
        map.put(IDStrings.COPPER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.COPPER, SlimefunItems.COPPER_DUST, SkullTextures.ALLOY_BROWN, "#c99732"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_COPPER.getItemId(),
                        SlimefunItems.COPPER_INGOT.getItemId(),
                        Materials.BLOCK_CAST_COPPER.getItemId(),
                        null,
                        null,
                        SlimefunItems.COPPER_DUST.getItemId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.COPPER,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "这是个脑力活",
                            "+100% 工具经验获取",
                            "-50% 输出伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "经验传导",
                            "所有工具经验转化为玩家经验",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "新手",
                            "+20% 防具经验获取",
                            "+25% 承受伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "暗淡",
                            "-20% 输出伤害",
                            "+20% 防具经验获取"
                        ))
                ));
        map.put(IDStrings.LEAD,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.LEAD, SlimefunItems.LEAD_DUST, SkullTextures.ALLOY_PURPLE, "#9043ba"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_LEAD.getItemId(),
                        SlimefunItems.LEAD_INGOT.getItemId(),
                        Materials.BLOCK_CAST_LEAD.getItemId(),
                        null,
                        null,
                        SlimefunItems.LEAD_DUST.getItemId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.LEAD,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "剧毒",
                            "命中时有25%的几率附加中毒效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "蚂蟥",
                            "获得额外血量,但会消耗能量",
                            "(获得饥饿,生命提升III效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "生病了",
                            "铅制防具并不是个好主意",
                            "(获得中毒效果)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "生病了",
                            "铅制防具并不是个好主意",
                            "(获得中毒效果)"
                        ))
                ));
        map.put(IDStrings.SILVER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SILVER, SlimefunItems.SILVER_DUST, SkullTextures.ALLOY_SILVER, "#d4d4d4"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_SILVER.getItemId(),
                        SlimefunItems.SILVER_INGOT.getItemId(),
                        Materials.BLOCK_CAST_SILVER.getItemId(),
                        null,
                        null,
                        SlimefunItems.SILVER_DUST.getItemId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SILVER,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "附魔",
                            "-50% 工具经验获取",
                            "工具升级时获得随机附魔",
                            "附魔可能并不适用于该工具",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "轻触",
                            "你感觉轻松多了",
                            "(获得缓降III效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "导电",
                            "免疫闪电伤害",
                            "被闪电击中时在周围召唤闪电"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "附魔",
                            "防具升级时获得随机附魔",
                            "附魔可能并不适用于该防具"
                        ))
                ));
        map.put(IDStrings.ALUMINUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ALUMINUM, SlimefunItems.ALUMINUM_DUST, SkullTextures.ALLOY_SILVER, "#b0b0b0"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_ALUMINUM.getItemId(),
                        SlimefunItems.ALUMINUM_INGOT.getItemId(),
                        Materials.BLOCK_CAST_ALUMINUM.getItemId(),
                        null,
                        null,
                        SlimefunItems.ALUMINUM_DUST.getItemId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.ALUMINUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "再生资源",
                            "使用时有25%的几率恢复耐久",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "柔韧",
                            "+100% 耐久消耗",
                            "+50% 工具经验获取",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "快跑",
                            "+50% 承受伤害",
                            "获得速度效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "快速修复",
                            "只需要1个修复工具即可完全修复"
                        ))
                ));
        map.put(IDStrings.TIN,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.TIN, SlimefunItems.TIN_DUST, SkullTextures.ALLOY_BLUE_PALE, "#a89b9b"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_TIN.getItemId(),
                        SlimefunItems.TIN_INGOT.getItemId(),
                        Materials.BLOCK_CAST_TIN.getItemId(),
                        null,
                        null,
                        SlimefunItems.TIN_DUST.getItemId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.TIN,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "幸运",
                            "-50% 输出伤害",
                            "获得幸运效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "罐头",
                            "你不再饥饿",
                            "(获得饱和效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "抗毒",
                            "免疫中毒效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "承伤",
                            "当受到伤害时,获得伤害吸收效果"
                        ))
                ));
        map.put(IDStrings.ZINC,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ZINC, SlimefunItems.ZINC_DUST, SkullTextures.ALLOY_SILVER, "#9ba8a6"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_ZINC.getItemId(),
                        SlimefunItems.ZINC_INGOT.getItemId(),
                        Materials.BLOCK_CAST_ZINC.getItemId(),
                        null,
                        null,
                        SlimefunItems.ZINC_DUST.getItemId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.ZINC,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "海豚的恩惠",
                            "激活海豚的力量!",
                            "(获得海豚的恩惠效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "飘浮",
                            "未蹲下时让你变得比空气还轻",
                            "(获得飘浮II效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "偷袭",
                            "当目标看向别处时,",
                            "+100% 对其造成的伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "针灸",
                            "免疫来自仙人掌的伤害"
                        ))
                ));
        map.put(IDStrings.MAGNESIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MAGNESIUM, SlimefunItems.MAGNESIUM_DUST, SkullTextures.ALLOY_PINK, "#e8cef5"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_MAGNESIUM.getItemId(),
                        SlimefunItems.MAGNESIUM_INGOT.getItemId(),
                        Materials.BLOCK_CAST_MAGNESIUM.getItemId(),
                        null,
                        null,
                        SlimefunItems.MAGNESIUM_DUST.getItemId(),
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.MAGNESIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "燃烧",
                            "有(工具等级 x 5)%的几率",
                            "让敌人着火",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "磁铁",
                            "随机捡起附近5格范围内的物品",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "快溜",
                            "-25% 输出伤害",
                            "获得速度效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "镁地™夜视",
                            "获得夜视效果"
                        ))
                ));
        map.put(IDStrings.COAL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.COAL, new ItemStack(Material.COAL), SkullTextures.ALLOY_BROWN, "#2d2e2d"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
                    new CMForms(
                        Materials.NUGGET_CAST_COAL.getItemId(),
                        Material.COAL.toString(),
                        Material.COAL_BLOCK.toString(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    null
                ));
        map.put(IDStrings.STEEL,
            new ComponentMaterial
                (
                    new CMIdentity(
                        IDStrings.STEEL,
                        SlimefunItems.STEEL_INGOT,
                        SkullTextures.ALLOY_SILVER,
                        "#d1d1d1"
                    ),
                    Arrays.asList(
                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                        map.get(IDStrings.COAL).getLiquidItemStack(4)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_STEEL.getItemId(),
                        SlimefunItems.STEEL_INGOT.getItemId(),
                        Materials.BLOCK_CAST_STEEL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.STEEL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "不锈钢",
                            "可以抵挡鲜血",
                            "(仅视觉效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "轻量",
                            "+50% 工具经验获取",
                            "获得速度效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "坚硬",
                            "-25% 受到的爆炸伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "强壮",
                            "获得生命提升效果"
                        ))
                ));
        map.put(IDStrings.DAMSTEEL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.DAMSTEEL, SlimefunItems.DAMASCUS_STEEL_INGOT, SkullTextures.ALLOY_RED, "#a38c8c"),
                    Arrays.asList(
                        map.get(IDStrings.STEEL).getLiquidItemStack(1),
                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                        map.get(IDStrings.COAL).getLiquidItemStack(8)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_DAMASCUS_STEEL.getItemId(),
                        SlimefunItems.DAMASCUS_STEEL_INGOT.getItemId(),
                        Materials.BLOCK_CAST_DAMASCUS_STEEL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.DAMSTEEL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "吸血鬼",
                            "造成伤害时有33%的几率恢复1点血量",
                            "-50% 伤害(日间)",
                            "+50% 伤害(夜间)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "夜行者",
                            "获得夜视效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "复用",
                            "获得生命提升效果",
                            "其等级取决于含有复用特性的防具数量",
                            "1件 \u21e8 1级",
                            "2件 \u21e8 3级",
                            "3件 \u21e8 6级",
                            "4件 \u21e8 10级"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "荆棘",
                            "免疫荆棘伤害",
                            "反弹荆棘伤害"
                        ))
                ));
        map.put(IDStrings.DURALIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.DURALIUM, SlimefunItems.DURALUMIN_INGOT, SkullTextures.ALLOY_SILVER, "#a3a089"),
                    Arrays.asList(
                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_DURALIUM.getItemId(),
                        SlimefunItems.DURALUMIN_INGOT.getItemId(),
                        Materials.BLOCK_CAST_DURALIUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.DURALIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "耐用",
                            "工具损坏时依然可用,但:",
                            "-50% 输出伤害",
                            "获得挖掘疲劳效果",
                            "无法获得工具经验",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "完全修复",
                            "只需要1格修复工具即可完全修复",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "耐用",
                            "防具损坏时依然可用,但:",
                            "+20% 承受伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "减震剂",
                            "有10%的几率免疫伤害",
                            "叠加不会提高几率"
                        ))
                ));
        map.put(IDStrings.BRONZE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BRONZE, SlimefunItems.BRONZE_INGOT, SkullTextures.ALLOY_BROWN, "#877435"),
                    Arrays.asList(
                        map.get(IDStrings.COPPER).getLiquidItemStack(2),
                        map.get(IDStrings.TIN).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_BRONZE.getItemId(),
                        SlimefunItems.BRONZE_INGOT.getItemId(),
                        Materials.BLOCK_CAST_BRONZE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.BRONZE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "防火",
                            "获得防火效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "不对劲",
                            "一定是这个工具有问题,一定是...",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "农民",
                            "收获农作物时增加1个掉落物",
                            "该效果不会受到时运的影响",
                            "该效果不会叠加,但可被其他特性影响"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "脆弱",
                            "+100% 耐久消耗"
                        ))
                ));
        map.put(IDStrings.ALUBRONZE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ALUBRONZE, SlimefunItems.ALUMINUM_BRONZE_INGOT, SkullTextures.ALLOY_TAN, "#bdaa6d"),
                    Arrays.asList(
                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2),
                        map.get(IDStrings.BRONZE).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_ALU_BRONZE.getItemId(),
                        SlimefunItems.ALUMINUM_BRONZE_INGOT.getItemId(),
                        Materials.BLOCK_CAST_ALU_BRONZE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.ALUBRONZE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "锋利 2",
                            "获得力量效果 (可叠加)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "脆弱",
                            "+100% 耐久消耗",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "鲜花",
                            "在行走时有几率让周围的草地上开花"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "弹射!",
                            "当血量低于一半时受到伤害",
                            "弹射起飞!",
                            "(获得飘浮III效果)"
                        ))
                ));
        map.put(IDStrings.HARD,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.HARD, SlimefunItems.HARDENED_METAL_INGOT, SkullTextures.ALLOY_SILVER, "#29251a"),
                    Arrays.asList(
                        map.get(IDStrings.ALUBRONZE).getLiquidItemStack(1),
                        map.get(IDStrings.DURALIUM).getLiquidItemStack(1),
                        map.get(IDStrings.DAMSTEEL).getLiquidItemStack(1),
                        map.get(IDStrings.COAL).getLiquidItemStack(32)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_HARD_METAL.getItemId(),
                        SlimefunItems.HARDENED_METAL_INGOT.getItemId(),
                        Materials.BLOCK_CAST_HARD_METAL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.HARD,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "击退",
                            "击退任何命中的生物",
                            "有几率禁锢目标",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "锤子",
                            "可挖掘 3x3x3 区域",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "坚韧",
                            "不消耗耐久"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "地精",
                            "在挖矿时有几率找到额外的物品",
                            "装备更多有该特性的防具可以增加几率"
                        ))
                ));
        map.put(IDStrings.CORBRONZE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.CORBRONZE, SlimefunItems.CORINTHIAN_BRONZE_INGOT, SkullTextures.ALLOY_BROWN, "#8a6500"),
                    Arrays.asList(
                        map.get(IDStrings.BRONZE).getLiquidItemStack(1),
                        map.get(IDStrings.GOLD).getLiquidItemStack(1),
                        map.get(IDStrings.SILVER).getLiquidItemStack(1),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_COR_BRONZE.getItemId(),
                        SlimefunItems.CORINTHIAN_BRONZE_INGOT.getItemId(),
                        Materials.BLOCK_CAST_COR_BRONZE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.CORBRONZE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "炽热",
                            "可熔炼掉落物",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "太烫了...",
                            "?",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "高温",
                            "有几率使周围实体着火"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "温血",
                            "在地狱获得速度II效果",
                            "在末地获得缓慢效果"
                        ))
                ));
        map.put(IDStrings.SOLDER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SOLDER, SlimefunItems.SOLDER_INGOT, SkullTextures.ALLOY_SILVER, "#b7afbd"),
                    Arrays.asList(
                        map.get(IDStrings.LEAD).getLiquidItemStack(2),
                        map.get(IDStrings.TIN).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_SOLDER.getItemId(),
                        SlimefunItems.SOLDER_INGOT.getItemId(),
                        Materials.BLOCK_CAST_SOLDER.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SOLDER,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "隐身",
                            "获得隐身效果",
                            "但在使用时会立即损坏",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "绑定",
                            "工具无法被丢弃",
                            "也不会在死亡时掉落",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "软着陆",
                            "免疫鞘翅的撞击伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "绑定",
                            "防具无法被丢弃",
                            "也不会在死亡时掉落"
                        ))
                ));
        map.put(IDStrings.BILLON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BILLON, SlimefunItems.BILLON_INGOT, SkullTextures.ALLOY_SILVER, "#b0c2be"),
                    Arrays.asList(
                        map.get(IDStrings.SILVER).getLiquidItemStack(2),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_BILLON.getItemId(),
                        SlimefunItems.BILLON_INGOT.getItemId(),
                        Materials.BLOCK_CAST_BILLON.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.BILLON,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "速掘",
                            "获得急迫效果",
                            "(可叠加)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "弹簧",
                            "让你跳的更高",
                            "(获得跳跃提升IV效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "天使降临",
                            "你的攻击将治疗目标",
                            "而不是伤害目标"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "热导体",
                            "免疫岩浆块的伤害"
                        ))
                ));
        map.put(IDStrings.BRASS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BRASS, SlimefunItems.BRASS_INGOT, SkullTextures.ALLOY_TAN, "#dbcd4b"),
                    Arrays.asList(
                        map.get(IDStrings.COPPER).getLiquidItemStack(2),
                        map.get(IDStrings.ZINC).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_BRASS.getItemId(),
                        SlimefunItems.BRASS_INGOT.getItemId(),
                        Materials.BLOCK_CAST_BRASS.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.BRASS,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "倒霉鬼",
                            "+50% 输出伤害",
                            "获得厄运III效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "氧气",
                            "获得水下呼吸效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "绑定环",
                            "+200% 耐久消耗",
                            "承受伤害将根据耐久度计算:",
                            "耐久高于一半时减少承受伤害,满耐久度时最多为25%",
                            "耐久低于一半时增加承受伤害,1耐久度时最多为25%"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "崩!撤!卖!溜!",
                            "+100% 耐久消耗",
                            "当血量低于一半时受到伤害",
                            "获得速度III效果"
                        ))
                ));
        map.put(IDStrings.ALUBRASS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ALUBRASS, SlimefunItems.ALUMINUM_BRASS_INGOT, SkullTextures.ALLOY_BROWN, "#dbd279"),
                    Arrays.asList(
                        map.get(IDStrings.BRASS).getLiquidItemStack(1),
                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_ALU_BRASS.getItemId(),
                        SlimefunItems.ALUMINUM_BRASS_INGOT.getItemId(),
                        Materials.BLOCK_CAST_ALU_BRASS.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.ALUBRASS,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "阿布拉",
                            "命中生物时有33%的几率",
                            "使目标随机传送",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "好学",
                            "+50% 工具经验获取",
                            "+50% 玩家经验获取",
                            "-50% 输出伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "巫师",
                            "-50% 承受的魔法伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "逃脱",
                            "受到伤害时随机传送到附近(10秒冷却时间)"
                        ))
                ));
        map.put(IDStrings.NICKEL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.NICKEL, SlimefunItems.NICKEL_INGOT, SkullTextures.ALLOY_SILVER, "#ebebeb"),
                    Arrays.asList(
                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_NICKEL.getItemId(),
                        SlimefunItems.NICKEL_INGOT.getItemId(),
                        Materials.BLOCK_CAST_NICKEL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.NICKEL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "带电(负极-)",
                            "有20%的几率",
                            "+200% 输出伤害",
                            "并禁锢目标",
                            "(需要与正极同时存在才能生效)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "带电(负极-)",
                            "有20%的几率",
                            "+200% 输出伤害",
                            "并禁锢目标",
                            "(需要与正极同时存在才能生效)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "磁铁(负极-)",
                            "磁铁的负极",
                            "磁铁可以自动吸收周围的掉落物",
                            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
                            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "磁铁(负极-)",
                            "磁铁的负极",
                            "磁铁可以自动吸收周围的掉落物",
                            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
                            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
                        ))
                ));
        map.put(IDStrings.COBALT,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.COBALT, SlimefunItems.COBALT_INGOT, SkullTextures.ALLOY_BLUE, "#9e9e9e"),
                    Arrays.asList(
                        map.get(IDStrings.IRON).getLiquidItemStack(1),
                        map.get(IDStrings.NICKEL).getLiquidItemStack(1),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_COBALT.getItemId(),
                        SlimefunItems.COBALT_INGOT.getItemId(),
                        Materials.BLOCK_CAST_COBALT.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.COBALT,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "带电(正极+)",
                            "有20%的几率",
                            "+200% 输出伤害",
                            "并禁锢目标",
                            "(需要与负极同时存在才能生效)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "带电(正极+)",
                            "有20%的几率",
                            "+200% 输出伤害",
                            "并禁锢目标",
                            "(需要与负极同时存在才能生效)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "磁铁(正极+)",
                            "磁铁的正极",
                            "磁铁可以自动吸收周围的掉落物",
                            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
                            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "磁铁(正极+)",
                            "磁铁的正极",
                            "磁铁可以自动吸收周围的掉落物",
                            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
                            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
                        ))
                ));
        map.put(IDStrings.REINFORCED,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.REINFORCED, SlimefunItems.REINFORCED_ALLOY_INGOT, SkullTextures.ALLOY_PURPLE, "#465899"),
                    Arrays.asList(
                        map.get(IDStrings.DAMSTEEL).getLiquidItemStack(1),
                        map.get(IDStrings.HARD).getLiquidItemStack(1),
                        map.get(IDStrings.CORBRONZE).getLiquidItemStack(1),
                        map.get(IDStrings.SOLDER).getLiquidItemStack(1),
                        map.get(IDStrings.BILLON).getLiquidItemStack(1),
                        map.get(IDStrings.GOLD).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_REINFORCED.getItemId(),
                        SlimefunItems.REINFORCED_ALLOY_INGOT.getItemId(),
                        Materials.BLOCK_CAST_REINFORCED.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.REINFORCED,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "锤子",
                            "可挖掘 3x3x3 区域",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "双倍强化",
                            "强化合金板模组拥有双倍效果",
                            "(只需5个即可不消耗耐久)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "双倍强化",
                            "强化合金板模组拥有双倍效果",
                            "(只需5个即可不消耗耐久)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "防凋零",
                            "免疫凋零效果"
                        ))
                ));
        map.put(IDStrings.STRING,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.STRING, new ItemStack(Material.STRING), null, "#f5f5f5"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.STRING,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "又不是不能用",
                            "没有特殊效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "又不是不能用",
                            "没有特殊效果"
                        ),
                        null)
                ));
        map.put(IDStrings.VINE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.VINE, new ItemStack(Material.VINE), null, "#4ca86b"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.VINE,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "生长",
                            "在白天缓慢修复工具",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "生长",
                            "在白天缓慢修复防具"
                        ),
                        null)
                ));
        map.put(IDStrings.CRIMSON_ROOTS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.CRIMSON_ROOTS, new ItemStack(Material.CRIMSON_ROOTS), null, "#b5365e"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.CRIMSON_ROOTS,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "腐烂",
                            "在夜间缓慢修复工具",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "腐烂",
                            "在夜间缓慢修复防具"
                        ),
                        null)
                ));
        map.put(IDStrings.WARPED_ROOTS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.WARPED_ROOTS, new ItemStack(Material.WARPED_ROOTS), null, "#36b549"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.WARPED_ROOTS,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "恢复",
                            "缓慢治疗玩家",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "恢复",
                            "缓慢治疗玩家"
                        ),
                        null)
                ));
        map.put(IDStrings.WEEPING_VINES,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.WEEPING_VINES, new ItemStack(Material.WEEPING_VINES), null, "#9c091d"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.WEEPING_VINES,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "不祥之兆",
                            "我感觉很不好...",
                            "(获得不祥之兆效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "不祥之兆",
                            "我感觉很不好...",
                            "(获得不祥之兆效果)"
                        ),
                        null)
                ));
        map.put(IDStrings.TWISTED_VINES,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.TWISTED_VINES, new ItemStack(Material.TWISTING_VINES), null, "#1b8045"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.TWISTED_VINES,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "吸引",
                            "自动吸收周围5格内的掉落物",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "吸引",
                            "自动吸收周围5格内的掉落物"
                        ),
                        null)
                ));
        map.put(IDStrings.SLIME,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SLIME, new ItemStack(Material.SLIME_BALL), SkullTextures.ALLOY_GREEN, "#29e01f"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        Material.SLIME_BLOCK.toString(),
                        null,
                        Material.SLIME_BALL.toString(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SLIME,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "弹性",
                            "-50% 摔落伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "弹性",
                            "-25% 摔落伤害"
                        ),
                        null)
                ));
        map.put(IDStrings.REDSTONE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.REDSTONE, new ItemStack(Material.REDSTONE), SkullTextures.ALLOY_RED, "#c4082e"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
                    new CMForms(
                        null,
                        null,
                        Material.REDSTONE_BLOCK.toString(),
                        Material.REDSTONE_ORE.toString(),
                        Material.REDSTONE.toString(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.REDSTONE,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null)
                ));

        map.put(IDStrings.SILICON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SILICON, SlimefunItems.SILICON, SkullTextures.ALLOY_SILVER, "#f2f2f2"),
                    null,
                    new CMToolMakeup(false, true, false, true, true, false),
                    new CMForms(
                        null,
                        Material.QUARTZ.toString(),
                        Material.QUARTZ_BLOCK.toString(),
                        Material.NETHER_QUARTZ_ORE.toString(),
                        SlimefunItems.SILICON.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SILICON,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "缓慢学习",
                            "破坏方块时",
                            "+(5 * 工具等级)% 工具经验获取",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "缓慢学习",
                            "+(5 * 防具等级)% 防具经验获取"
                        ),
                        null)
                ));

        map.put(IDStrings.LEATHER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.LEATHER, new ItemStack(Material.LEATHER), null, "#918056"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.LEATHER,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "厚皮革",
                            "+50% 工具经验获取",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "厚皮革",
                            "+10% 防具经验获取"
                        ),
                        null)
                ));

        map.put(IDStrings.FERROSILICON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.FERROSILICON, SlimefunItems.FERROSILICON, SkullTextures.ALLOY_SILVER, "#f2f2f2"),
                    Arrays.asList(
                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                        map.get(IDStrings.SILICON).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, false, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_FERROSILICON.getItemId(),
                        SlimefunItems.FERROSILICON.getItemId(),
                        Materials.BLOCK_CAST_FERROSILICON.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.FERROSILICON,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "氢气",
                            "受到伤害时",
                            "获得飘浮效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "太阳能",
                            "在白天持续恢复耐久"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "魔童",
                            "获得1层魔童效果",
                            "当拥有4层及以上的魔童效果时",
                            "击退周围5格内的所有的生物",
                            "(凋零与末影龙除外)"
                        ))
                ));
        map.put(IDStrings.REDSTONE_ALLOY,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY, SkullTextures.ALLOY_RED, "#700d21"),
                    Arrays.asList(
                        map.get(IDStrings.REDSTONE).getLiquidItemStack(10),
                        map.get(IDStrings.FERROSILICON).getLiquidItemStack(1),
                        map.get(IDStrings.HARD).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(false, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_REDSTONE_ALLOY.getItemId(),
                        SlimefunItems.REDSTONE_ALLOY.getItemId(),
                        Materials.BLOCK_CAST_REDSTONE_ALLOY.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.REDSTONE_ALLOY,
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "电棍",
                            "有几率在命中生物时召唤闪电",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "充能",
                            "在 5x2x5 范围内随机充能方块",
                            "(激活红石信号)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "谁还要压力板?",
                            "你所站的方块是充能的"
                        ))
                ));
        map.put(IDStrings.DIAMOND,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.DIAMOND, new ItemStack(Material.DIAMOND), SkullTextures.ALLOY_BLUE, "#5fdde8"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
                    new CMForms(
                        null,
                        null,
                        Material.DIAMOND_BLOCK.toString(),
                        Material.DIAMOND_ORE.toString(),
                        Material.DIAMOND.toString(),
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.DIAMOND,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null)
                ));
        map.put(IDStrings.BOOMERITE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BOOMERITE, Materials.INGOT_CAST_BOOMERITE, SkullTextures.ALLOY_PURPLE, "#d94c00"),
                    Arrays.asList(
                        map.get(IDStrings.REINFORCED).getLiquidItemStack(1),
                        map.get(IDStrings.CORBRONZE).getLiquidItemStack(1),
                        map.get(IDStrings.HARD).getLiquidItemStack(1),
                        map.get(IDStrings.COPPER).getLiquidItemStack(5)
                    ),
                    new CMToolMakeup(true, false, false, true, false, false),
                    new CMForms(
                        Materials.NUGGET_CAST_BOOMERITE.getItemId(),
                        Materials.INGOT_CAST_BOOMERITE.getItemId(),
                        Materials.BLOCK_CAST_BOOMERITE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.BOOMERITE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "梯子模拟器™",
                            "右键点击时生成梯子",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "Go Boomer",
                            "警告: 即将发生爆炸"
                        ),
                        null,
                        null)
                ));
        map.put(IDStrings.SEFIRITE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SEFIRITE, Materials.INGOT_CAST_SEFIRITE, SkullTextures.ALLOY_GREEN, "#9beb34"),
                    null,
                    new CMToolMakeup(true, false, false, false, false, false),
                    new CMForms(
                        Materials.NUGGET_CAST_SEFIRITE.getItemId(),
                        Materials.INGOT_CAST_SEFIRITE.getItemId(),
                        Materials.BLOCK_CAST_SEFIRITE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SEFIRITE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "庆祝",
                            "是时候庆祝一下了"
                        ),
                        null,
                        null,
                        null,
                        null,
                        null)
                ));
        map.put(IDStrings.LIQUID_CHRISTMAS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.LIQUID_CHRISTMAS, SlimefunItems.CHRISTMAS_PRESENT, SkullTextures.ALLOY_GREEN, "#00cc36"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
                    new CMForms(
                        null,
                        SlimefunItems.CHRISTMAS_PRESENT.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.LIQUID_CHRISTMAS,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null)
                ));
        map.put(IDStrings.CRINGLEIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.CRINGLEIUM, Materials.INGOT_CAST_SEFIRITE, SkullTextures.ALLOY_GREEN, "#00cc36"),
                    Arrays.asList(
                        map.get(IDStrings.REINFORCED).getLiquidItemStack(2),
                        map.get(IDStrings.LIQUID_CHRISTMAS).getLiquidItemStack(3),
                        map.get(IDStrings.MAGNESIUM).getLiquidItemStack(2)
                    ),
                    new CMToolMakeup(false, false, false, false, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_CRINGLEIUM.getItemId(),
                        Materials.INGOT_CAST_CRINGLEIUM.getItemId(),
                        Materials.BLOCK_CAST_CRINGLEIUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.CRINGLEIUM,
                        null,
                        null,
                        null,
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "庆祝节日",
                            "一起来庆祝圣诞节吧!"
                        ))
                ));

        setupToolConsumers();
        setupArmourConsumers();

    }

    public static void setupToolConsumers() {

        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headAluBrass);          // Abra
        map.get(IDStrings.GOLD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodGold);                                      // All that glitters
        map.get(IDStrings.TWISTED_VINES).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderTwistingVine);               // Attraction
        map.get(IDStrings.COPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headCopper);              // Brains not brawn - Damage
        map.get(IDStrings.COPPER).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headCopper);                   // Brains not brawn - Block Break
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::rodAluBronze);                // Brittle
        map.get(IDStrings.REINFORCED).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::explosive);                 // Bulky (explosive)
        map.get(IDStrings.TIN).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodTin);                                        // Can
        map.get(IDStrings.SEFIRITE).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.HEAD, RightClickEvents::headSefirite);               // Celebrate
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::charged);                 // Charged A (Head)
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::charged);                  // Charged A (Rod)
        map.get(IDStrings.COBALT).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::charged);                 // Charged B (Head)
        map.get(IDStrings.COBALT).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::charged);                  // Charged B (Rod)
        // Conductive (Special case - in Experience.java, should be moved out)
        map.get(IDStrings.CRIMSON_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderCrimsonRoot);                // Decay
        map.get(IDStrings.WEEPING_VINES).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderWeepingVine);                // Doom
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headDuralium);          // Durable - Entity Damage - Damage Reduction + No Exp
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headDuralium);               // Durable - Block Break -  No Exp
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headDuralium);                            // Durable - Tick
        // Easy Fix (Special case - in RepairBench.java. Will have to stay there)
        // Enchanting (Special case - in Experience.java - could be moved if I raise an event)
        map.get(IDStrings.BILLON).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headBillon);                                // Fast
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headMagnesium);        // Flammable
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headCorbronze);             // Flaming Hot
        // Fused (Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        map.get(IDStrings.GOLD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headGold);                  // Golden Veil - Damage
        map.get(IDStrings.GOLD).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headGold);                                    // Golden Veil - Tick
        map.get(IDStrings.ZINC).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headZinc);                                    // Graceful
        map.get(IDStrings.VINE).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderVine);                                // Growth
        map.get(IDStrings.HARD).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::explosive);                        // Heavy (explosive)
        map.get(IDStrings.SOLDER).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headSolder);                    // Hidden - Durability
        map.get(IDStrings.SOLDER).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headSolder);                                // Hidden - Tick
        map.get(IDStrings.FERROSILICON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headFerrosilicon); // Hydrogen
        map.get(IDStrings.BRONZE).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodBronze);                                  // Ingheights
        map.get(IDStrings.BOOMERITE).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.HEAD, RightClickEvents::headBoomerite);             // Ladder Simulator™
        map.get(IDStrings.LEAD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodLead);                                      // Leech
        map.get(IDStrings.REDSTONE_ALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodRedstoneAlloy); // Lightning Rod
        map.get(IDStrings.STEEL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSteel);                                    // Lightweight
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodMagnesium);                            // Magnetisium
        map.get(IDStrings.TIN).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headTin);                    // Malleable - Damage
        map.get(IDStrings.TIN).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headTin);                                      // Malleable - Tick
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodDamsteel);                              // Night Stalker
        map.get(IDStrings.BRASS).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodBrass);                                    // Oxygenated
        map.get(IDStrings.LEAD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headLead);                  // Poisonous
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headAluminum);                // Recycleable
        map.get(IDStrings.WARPED_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindWarpedRoot);                    // Refreshing
        // Reinforced (Special Case - nested within plate mod. Will be moved when mods are changed to consumers)
        map.get(IDStrings.BRONZE).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headBronze);                                // Resistant
        map.get(IDStrings.IRON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodIron);                                      // Sharp I
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headAlubronze);                          // Sharp II
        map.get(IDStrings.SILICON).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.BINDER, BlockBreakEvents::bindSilicon);               // Slow Learner
        map.get(IDStrings.SLIME).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindSlime);             // Slimey
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::rodAluminum);                  // Soft - Durability
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodAluminum);            // Soft - Damage
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::rodAluminum);                 // Soft - Block Break
        map.get(IDStrings.SILVER).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSilver);                                  // Soft Touch
        map.get(IDStrings.BILLON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodBillon);                                  // Springs
        // Stability (Special Case, doesn't do anything, just here for consistency)
        map.get(IDStrings.STEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSteel);                // Stainless
        map.get(IDStrings.BRASS).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headBrass);                // Stiff - Damage
        map.get(IDStrings.BRASS).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headBrass);                                  // Stiff - Tick
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodAlubrass);            // Studious - Damage
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::rodAluBrass);                 // Studious - Block Break
        map.get(IDStrings.ZINC).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodZinc);                                      // Super Light Weight
        map.get(IDStrings.LEATHER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.BINDER, EntityDamageEvents::binderLeather);        // Thick - Exp Entity Damage
        map.get(IDStrings.LEATHER).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.BINDER, BlockBreakEvents::binderLeather);             // Thick - Exp Block Break
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodCorbronze);                            // Too Hot to Handle
        map.get(IDStrings.HARD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headHard);                   // Tuff Stuff
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headDamsteel);          // Vampirism
        // Works (Special Case, doesn't do anything, just here for consistency)
    }

    public static void setupArmourConsumers() {

        map.get(IDStrings.ZINC).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksZinc);               // Acupuncture
        map.get(IDStrings.TWISTED_VINES).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonTwistingWines);          // Attraction
        map.get(IDStrings.BRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateBrass);             // Band
        map.get(IDStrings.BRASS).addEvent(TraitEventType.DURABILITY, TraitPartType.PLATE, DurabilityEvents::plateBrass);                    // Band
        map.get(IDStrings.GOLD).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksGold);                                  // Barter
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateAluBronze);                        // Beautiful
        map.get(IDStrings.COPPER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateCopper);           // Beginner - Damage mod
        map.get(IDStrings.COPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateCopper);            // Beginner - EXP Gain
        map.get(IDStrings.TIN).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksTin);                 // Boost
        map.get(IDStrings.SLIME).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.GAMBESON, PlayerDamagedEvents::gambesonSlime);       // Bouncy
        map.get(IDStrings.FERROSILICON).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::brightBurn);                         // Brightburn
        map.get(IDStrings.BRASS).addEvent(TraitEventType.DURABILITY, TraitPartType.LINKS, DurabilityEvents::linksBrass);                    // Brittle
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateDamSteel);                          // Compounding
        map.get(IDStrings.SILVER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSilver);           // Conductive
        map.get(IDStrings.CRIMSON_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonCrimsonRoots);           // Decay
        map.get(IDStrings.WEEPING_VINES).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonWeepingVines);           // Doom
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateDuralium);       // Durable (Working trait is done via ItemUtils#doesNotUnequip(ItemStack)
        map.get(IDStrings.HARD).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.LINKS, BlockBreakEvents::linksHardened);                 // Dwarven Skills
        // Easily Shaped (In RepairBench)
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksAluBronze);     // Eject!
        // Enchanting (Experience)
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksAluBrass);       // Escape
        map.get(IDStrings.BRONZE).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.PLATE, BlockBreakEvents::plateBronze);                 // Farmer
        map.get(IDStrings.CRINGLEIUM).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksCringleium);                      // Feeling Festive
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateAluminum);       // Foil 50% damage
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateAluminum);                          // Foil +1 speed
        // Fused
        map.get(IDStrings.BOOMERITE).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateBoomerite);                        // Go Boomer
        map.get(IDStrings.VINE).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonVine);                            // Growth
        map.get(IDStrings.STEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSteel);             // Hardy
        map.get(IDStrings.BILLON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksBillon);           // Heat Conductor
        map.get(IDStrings.BRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksBrass);             // Help
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateMagnesium);      // Light - Player Damage
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateMagnesium);                        // Light - Speed
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksMagnesium);                        // Magnesight
        map.get(IDStrings.COBALT).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateCobalt);                              // Magnetic -
        map.get(IDStrings.COBALT).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksCobalt);                              // Magnetic -
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateNickel);                              // Magnetic +
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksNickel);                              // Magnetic +
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateAluBrass);       // Magus
        map.get(IDStrings.TIN).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateTin);                 // Non-corrosive
        map.get(IDStrings.REDSTONE_ALLOY).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateRedstoneAlloy);               // Powered On
        map.get(IDStrings.GOLD).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateGold);               // Prosperous
        map.get(IDStrings.WARPED_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonWarpedRoots);             // Refreshing
        // Reinforcable (Special Case - nested within plate mod. Will be moved when mods are changed to consumers)
        map.get(IDStrings.IRON).addEvent(TraitEventType.TICK, TraitPartType.LINKS, EntityDamageEvents::linksIron);                          // Rusty
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksDuralium);       // Shock Absorbant
        map.get(IDStrings.LEAD).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateLead);                                  // Sickly (plate)
        map.get(IDStrings.LEAD).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksLead);                                  // Sickly (links)
        map.get(IDStrings.SILICON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.GAMBESON, EntityDamageEvents::gambesonSilicon);    // Slow Learner
        map.get(IDStrings.ZINC).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateZinc);                // Sneaky
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksDamSteel);       // Snroht
        map.get(IDStrings.SOLDER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSolder);           // Soft Landing
        map.get(IDStrings.FERROSILICON).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateFerrosilicon);                  // Solar Powered
        map.get(IDStrings.IRON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateIron);               // Steadfast
        map.get(IDStrings.STEEL).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksSteel);                                // Strong
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateCorBronze);                        // SuperHot
        map.get(IDStrings.COPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.LINKS, EntityDamageEvents::linksCopper);            // Tarnished
        map.get(IDStrings.LEATHER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.GAMBESON, EntityDamageEvents::gambesonLeather);    // Thick Hide
        map.get(IDStrings.HARD).addEvent(TraitEventType.DURABILITY, TraitPartType.PLATE, DurabilityEvents::plateHardened);                  // Toughened
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksCorBronze);                        // Warm Blooded
        map.get(IDStrings.BILLON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateBillon);            // WHM
        map.get(IDStrings.REDSTONE_ALLOY).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksRedstoneAlloy);               // Who needs pressure plates
        map.get(IDStrings.REINFORCED).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksReinforced);   // Witherproof
        // Works
    }

}
