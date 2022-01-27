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
public final class CMInfinity {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.VOID,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.VOID, Objects.requireNonNull(SlimefunItem.getById("VOID_INGOT")).getItem(), SkullTextures.ALLOY_PURPLE_DEEP, "#5c5756"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        "VOID_DUST",
                        "VOID_INGOT",
                        Materials.BLOCK_CAST_VOID.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.VOID,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "虚空矿工",
                            "在挖掘时有几率掉落随机的矿产",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "虚空恐惧",
                            "+150% 输出伤害",
                            "在末地时:",
                            "+250% 输出伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "虚空行者",
                            "虚空不再是你的敌人",
                            "(落入虚空时自动传送至当前位置向上200格的位置)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "末地领主",
                            "-10% 来自末影龙,末影人,潜影贝的伤害"
                        ))
                ));

        map.put(IDStrings.MAGSTEEL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MAGSTEEL, Objects.requireNonNull(SlimefunItem.getById("MAGSTEEL")).getItem(), SkullTextures.ALLOY_BROWN, "#730000"),
                    Arrays.asList(
                        CMCore.getMap().get(IDStrings.MAGNESIUM).getLiquidItemStack(2),
                        CMCore.getMap().get(IDStrings.STEEL).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_MAGSTEEL.getItemId(),
                        "MAGSTEEL",
                        Materials.BLOCK_CAST_MAGSTEEL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.MAGSTEEL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "真的是不锈钢",
                            "很像不锈钢,但真的是可以抵挡鲜血",
                            "(更炫酷的视觉效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "燃烧",
                            "有(工具等级 x 5)%的几率",
                            "让敌人着火",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "暗淡",
                            "-20% 输出伤害",
                            "+20% 防具经验获取"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "防御",
                            "受到伤害时,有5%的几率",
                            "免疫伤害并获得伤害吸收效果"
                        ))
                ));

        map.put(IDStrings.TITANIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.TITANIUM, Objects.requireNonNull(SlimefunItem.getById("TITANIUM")).getItem(), SkullTextures.ALLOY_SILVER, "#adadad"),
                    Arrays.asList(
                        CMCore.getMap().get(IDStrings.REINFORCED).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.DAMSTEEL).getLiquidItemStack(1),
                        CMCore.getMap().get(IDStrings.HARD).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_TITANIUM.getItemId(),
                        "TITANIUM",
                        Materials.BLOCK_CAST_TITANIUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.TITANIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "双倍强化",
                            "强化合金板模组拥有双倍效果",
                            "(只需5个即可不消耗耐久)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "耐用",
                            "工具损坏时依然可用,但:",
                            "-50% 输出伤害",
                            "获得挖掘疲劳效果",
                            "无法获得工具经验",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "地精",
                            "在挖矿时有几率找到额外的物品",
                            "装备更多有该特性的防具可以增加几率"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "防火",
                            "免疫来自火焰、岩浆与岩浆块的伤害"
                        ))
                ));

        map.put(IDStrings.SINGIRON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGIRON, Objects.requireNonNull(SlimefunItem.getById("IRON_SINGULARITY")).getItem(), SkullTextures.ALLOY_SILVER, "#8c8c8c"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "IRON_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGIRON,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "稳定 II",
                            "还是没有特性"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "锋利 1 II",
                            "获得力量II效果 (可叠加)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "坚固 II",
                            "爆炸将治疗你",
                            "而不会造成伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "腐蚀 II",
                            "-10% 输出伤害",
                            "+10% 玩家经验获取"
                        ))
                ));

        map.put(IDStrings.SINGGOLD,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGGOLD, Objects.requireNonNull(SlimefunItem.getById("GOLD_SINGULARITY")).getItem(), SkullTextures.ALLOY_TAN, "#ffe138"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "GOLD_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGGOLD,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "金色面纱 II",
                            "获得隐身效果",
                            "+50% 输出伤害,用于武器时",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "闪闪发光 II",
                            "获得彩虹发光效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "繁荣 II",
                            "在受到伤害时",
                            "有1%几率掉落1-4个金粒"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "来个交易 II",
                            "猪灵会被你深深地吸引",
                            "(周围5格内的猪灵不会攻击你)"
                        ))
                ));

        map.put(IDStrings.SINGCOPPER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGCOPPER, Objects.requireNonNull(SlimefunItem.getById("COPPER_SINGULARITY")).getItem(), SkullTextures.ALLOY_BROWN, "#c99732"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "COPPER_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGGOLD,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "这是个脑力活 II",
                            "+200% 工具经验获取",
                            "-50% 输出伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "经验传导 II",
                            "所有工具经验转化为玩家经验",
                            "并获得额外50%的加成",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "新手 II",
                            "+40% 防具经验获取",
                            "+50% 承受伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "暗淡 II",
                            "-20% 输出伤害",
                            "+40% 防具经验获取"
                        ))
                ));

        map.put(IDStrings.SINGLEAD,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGLEAD, Objects.requireNonNull(SlimefunItem.getById("LEAD_SINGULARITY")).getItem(), SkullTextures.ALLOY_PURPLE, "#9043ba"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "LEAD_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGLEAD,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "剧毒 II",
                            "命中时有50%的几率附加中毒II效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "蚂蟥 II",
                            "获得额外血量",
                            "(获得生命提升II效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "生病了 II",
                            "铅制防具真的不是个好主意",
                            "(获得中毒V效果)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "生病了 II",
                            "铅制防具真的不是个好主意",
                            "(获得中毒V效果)"
                        ))
                ));

        map.put(IDStrings.SINGSILVER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGSILVER, Objects.requireNonNull(SlimefunItem.getById("SILVER_SINGULARITY")).getItem(), SkullTextures.ALLOY_SILVER, "#d4d4d4"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "SILVER_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGSILVER,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "附魔 II",
                            "-50% 工具经验获取",
                            "工具升级时获得1-3个随机附魔",
                            "附魔可能并不适用于该工具",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "轻触 II",
                            "你感觉更加轻松了",
                            "(免疫摔落伤害)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "导电 II",
                            "被闪电击中时可获得治疗",
                            "并在周围生成闪电风暴"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "附魔 II",
                            "防具升级时获得1-3个随机附魔",
                            "附魔可能并不适用于该防具"
                        ))
                ));

        map.put(IDStrings.SINGALUMINUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGALUMINUM, Objects.requireNonNull(SlimefunItem.getById("ALUMINUM_SINGULARITY")).getItem(), SkullTextures.ALLOY_SILVER, "#b0b0b0"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "ALUMINUM_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGALUMINUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "再生资源 II",
                            "使用时有33%的几率恢复耐久",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "柔韧 II",
                            "+100% 耐久消耗",
                            "+100% 工具经验获取",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "快跑 II",
                            "+50% 承受伤害",
                            "获得速度II效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "快速修复 II",
                            "只需要1个任意材质的修复工具即可完全修复"
                        ))
                ));

        map.put(IDStrings.SINGTIN,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGTIN, Objects.requireNonNull(SlimefunItem.getById("TIN_SINGULARITY")).getItem(), SkullTextures.ALLOY_SILVER, "#a89b9b"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "TIN_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGTIN,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "幸运 II",
                            "-50% 输出伤害",
                            "获得幸运II效果",
                            "获得速度II效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "罐头 II",
                            "饥饿度不会下降",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "抗毒 II",
                            "免疫中毒、饥饿、虚弱效果",
                            "中毒效果会治疗你"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "承伤 II",
                            "当受到伤害时,获得伤害吸收II效果"
                        ))
                ));

        map.put(IDStrings.SINGZINC,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGZINC, Objects.requireNonNull(SlimefunItem.getById("ZINC_SINGULARITY")).getItem(), SkullTextures.ALLOY_SILVER, "#9ba8a6"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "ZINC_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGZINC,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "海豚的恩惠 II",
                            "激活海豚的力量!更多的力量!",
                            "(获得海豚的恩惠II效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "飘浮 II",
                            "蹲下时让你变得比空气还轻",
                            "(获得飘浮II效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "偷袭 II",
                            "当目标看向别处时,",
                            "+100% 对其造成的伤害",
                            "(看向别处的判定范围更广)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "针灸 II",
                            "免疫来自仙人掌的伤害",
                            "来自仙人掌的伤害可以治疗你"
                        ))
                ));

        map.put(IDStrings.SINGMAGNESIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGMAGNESIUM, Objects.requireNonNull(SlimefunItem.getById("MAGNESIUM_SINGULARITY")).getItem(), SkullTextures.ALLOY_PINK, "#e8cef5"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "MAGNESIUM_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGMAGNESIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "燃烧 II",
                            "有(工具等级 x 10)%的几率",
                            "让敌人着火更长时间",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "磁铁 II",
                            "随机捡起附近10格范围内的物品",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "快溜",
                            "-50% 输出伤害",
                            "获得速度II效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "镁地™夜视 II",
                            "获得夜视效果",
                            "并标记出周围10格内所有生物"
                        ))
                ));
        map.put(IDStrings.SINGDIAMOND,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGDIAMOND, Objects.requireNonNull(SlimefunItem.getById("DIAMOND_SINGULARITY")).getItem(), SkullTextures.ALLOY_BLUE, "#e8cef5"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
                    new CMForms(
                        null,
                        null,
                        "DIAMOND_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGDIAMOND,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null)
                ));


        map.put(IDStrings.MYTHRIL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MYTHRIL, Objects.requireNonNull(SlimefunItem.getById("MYTHRIL")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#4ebdc7"),
                    Arrays.asList(
                        CMCore.getMap().get(IDStrings.REINFORCED).getLiquidItemStack(1),
                        map.get(IDStrings.SINGIRON).getLiquidItemStack(9),
                        CMCore.getMap().get(IDStrings.HARD).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_MYTHRIL.getItemId(),
                        "MYTHRIL",
                        Materials.BLOCK_CAST_MYTHRIL.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.MYTHRIL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "精灵疾驰",
                            "+50% 耐久消耗",
                            "获得急迫II效果",
                            "获得速度效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "贡多林刺针",
                            "击退附近所有的敌对生物",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "魔童",
                            "获得1层魔童效果",
                            "当拥有4层及以上的魔童效果时",
                            "击退周围5格内的所有的敌对生物",
                            "(凋零与末影龙除外)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "野性的呼唤",
                            "当受到伤害时",
                            "有几率召唤一只狼来帮助你"
                        ))
                ));

        map.put(IDStrings.ADAMANTITE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ADAMANTITE, Objects.requireNonNull(SlimefunItem.getById("ADAMANTITE")).getItem(), SkullTextures.ALLOY_TAN, "#c93ec2"),
                    Arrays.asList(
                        CMCore.getMap().get(IDStrings.REDSTONE_ALLOY).getLiquidItemStack(1),
                        map.get(IDStrings.SINGDIAMOND).getLiquidItemStack(9),
                        map.get(IDStrings.MAGSTEEL).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_ADAMANTITE.getItemId(),
                        "ADAMANTITE",
                        Materials.BLOCK_CAST_ADAMANTITE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.ADAMANTITE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "神秘",
                            "+100% 玩家经验获取(挖矿)",
                            "+50% 玩家经验获取(打怪)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "坚硬",
                            "免疫爆炸伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "射歪了",
                            "-25% 来自弹射物的伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "有经验的",
                            "+10% 工具经验获取",
                            "+10% 玩家经验获取"
                        ))
                ));

        map.put(IDStrings.MAGNONIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MAGNONIUM, Objects.requireNonNull(SlimefunItem.getById("MAGNONIUM")).getItem(), SkullTextures.ALLOY_PURPLE, "#4a0446"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_MAGNONIUM.getItemId(),
                        "MAGNONIUM",
                        Materials.BLOCK_CAST_MAGNONIUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.MAGNONIUM,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "宽宏大量",
                            "你真的太棒了",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "炽热",
                            "可熔炼掉落物",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "逃脱",
                            "受到伤害时随机传送到附近(10秒冷却时间)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "有氧",
                            "谁需要它呢?",
                            "(免疫溺水伤害)"
                        ))
                ));


        map.put(IDStrings.FORTUNE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.FORTUNE, Objects.requireNonNull(SlimefunItem.getById("FORTUNE_SINGULARITY")).getItem(), SkullTextures.ALLOY_PURPLE, "#f0d541"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        "FORTUNE_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.FORTUNE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "幸运",
                            "获得双倍掉落物",
                            "可与青金石模组叠加",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "商人面纱",
                            "没有副作用的隐身",
                            "(获得隐身III效果)",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "多么幸运",
                            "受到1点以上(初始)伤害时",
                            "有0.5%的几率获得一件礼物"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "鲜花",
                            "在行走时有几率让周围的草地上开花"
                        ))
                ));

        map.put(IDStrings.MAGIC,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MAGIC, Objects.requireNonNull(SlimefunItem.getById("MAGIC_SINGULARITY")).getItem(), SkullTextures.ALLOY_BLUE, "#c941e8"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        "MAGIC_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.MAGIC,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "魔术戏法",
                            "对周围所有生物随机释放魔术戏法,包括:",
                            "- 击退",
                            "- 中毒",
                            "- 随机传送",
                            "- 着火",
                            "- 速度",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "揭露秘密",
                            "标记出周围10格内的所有的生物",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "巫师袍",
                            "造成伤害时",
                            "有几率释放魔法"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "魔法薄荷",
                            "免疫龙息伤害"
                        ))
                ));

        map.put(IDStrings.EARTH,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.EARTH, Objects.requireNonNull(SlimefunItem.getById("EARTH_SINGULARITY")).getItem(), SkullTextures.ALLOY_GREEN, "#44e34f"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        "EARTH_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.EARTH,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "撼地者",
                            "击退并禁锢命中的生物",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "粉碎机",
                            "破坏方块时的掉落物",
                            "就像经过了粉碎机一样",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "岩浆行者",
                            "脚下的岩浆变为岩浆块"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "自然法则",
                            "(2分钟冷却时间)右键点击时",
                            "喂食周围的两只动物",
                            "无论是否喂食成功,该效果都会进入冷却"
                        ))
                ));

        map.put(IDStrings.METAL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.METAL, Objects.requireNonNull(SlimefunItem.getById("METAL_SINGULARITY")).getItem(), SkullTextures.ALLOY_SILVER, "#5b615b"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        null,
                        null,
                        null,
                        null,
                        "METAL_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.METAL,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "干净利落",
                            "+100% 输出伤害",
                            "获得急迫II效果",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "经验导体",
                            "所有玩家经验以10:1的比例",
                            "转化为工具经验",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "圆桌骑士",
                            "受到伤害时有几率",
                            "在周围生成圆桌骑士",
                            "(好吧,是铁傀儡)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "闪光弹",
                            "受到伤害时,有几率",
                            "反弹伤害并使攻击者眩晕"
                        ))
                ));


        map.put(IDStrings.INFINITY,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.INFINITY, Objects.requireNonNull(SlimefunItem.getById("INFINITE_INGOT")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#d1ebf0"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_INFINITY.getItemId(),
                        "INFINITE_INGOT",
                        Materials.BLOCK_CAST_INFINITY.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.INFINITY,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "无尽",
                            "这件工具永远不会损坏",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "概念性防御",
                            "-50% 承受伤害",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "无尽反应盔甲",
                            "每次承受伤害的10%会被存储",
                            "最多可存储10点伤害(5颗心)",
                            "右键点击对周围所有生物",
                            "释放存储的伤害"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "衔尾蛇",
                            "有20%的几率反弹承受的伤害"
                        ))
                ));

        map.put(IDStrings.SINGINFINITY,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SINGINFINITY, Objects.requireNonNull(SlimefunItem.getById("INFINITY_SINGULARITY")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#e8cef5"),
                    null,
                    new CMToolMakeup(true, false, false, true, false, true),
                    new CMForms(
                        null,
                        null,
                        "INFINITY_SINGULARITY",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SINGINFINITY,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "断点",
                            "无法破坏",
                            "+200% 输出伤害",
                            "+200% 工具经验获取",
                            "可挖掘 3x3x3 区域",
                            "",
                            ThemeUtils.ITEM_MOLTEN_METAL + "必须手持工具或武器才有效果"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "无尽力量",
                            "每承受2000点伤害(减伤计算前)",
                            "可以获得一个新的随机附魔",
                            "无等级上限"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.INFINITY_EXPANSION_NOTE,
                            "无尽防御",
                            "当装备全套包含无尽防御的防具时",
                            "所有承受的伤害均减少至1点"
                        ))
                ));

        setupToolConsumers();
        setupArmourConsumers();

    }

    public static void setupToolConsumers() {

        map.get(IDStrings.ADAMANTITE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.ROD, PlayerDamagedEvents::rodAdamantite);           // Adamant
        map.get(IDStrings.SINGGOLD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSingGold);                                  // All that Glitters II
        map.get(IDStrings.SINGCOPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSingCopper);          // Brains Not Brawn II - Damage
        map.get(IDStrings.SINGCOPPER).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headSingCopper);               // Brains Not Brawn II - Block Break
        map.get(IDStrings.SINGINFINITY).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headSingInfinity);            // Breakpoint - Durability
        map.get(IDStrings.SINGINFINITY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSingInfinity);      // Breakpoint - Damage
        map.get(IDStrings.SINGINFINITY).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headSingInfinity);           // Breakpoint - Block Break
        map.get(IDStrings.SINGTIN).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSingTin);                                    // Can II
        map.get(IDStrings.METAL).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headMetal);                                      // Clean Cut - Tick
        map.get(IDStrings.METAL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headMetal);                    // Clean Cut - Damage
        map.get(IDStrings.INFINITY).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.ROD, PlayerDamagedEvents::rodInfinity);               // Conceptual Defence
        // Conductive II (Special case, handled in Experience.java)
        map.get(IDStrings.METAL).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::rodMetal);                           // Conductor - Block Break
        map.get(IDStrings.METAL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodMetal);                      // Conductor - Damage
        // Durable - Damage (Special Case - in EntityDamageListener.java - cant move)       |
        // Durable - Block Break (Special Case - in BlockBreakListener.java - cant move)    |-- CO - Duralium Head
        map.get(IDStrings.TITANIUM).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headDuralium);                                // Durable - Tick
        map.get(IDStrings.EARTH).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headEarth);                    // Earth Shaker
        map.get(IDStrings.MYTHRIL).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headMythril);                      // Elven Speed - Durability
        map.get(IDStrings.MYTHRIL).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headMythril);                                  // Elven Speed - Tick
        // Enchanting II (Special Case, handled in Experience.java)
        map.get(IDStrings.VOID).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodVoid);                        // Fear the Void
        map.get(IDStrings.MAGSTEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headMagnesium);              // Flammable                                                                        |-- CO - Magnesium Head
        map.get(IDStrings.SINGMAGNESIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSingMagnesium);    // Flammable II
        map.get(IDStrings.MAGNONIUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::headCorbronze);                  // Flaming Hot                                                                      |-- CO - Corin Bronze Head
        map.get(IDStrings.FORTUNE).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headFortune);                     // Fortunate
        map.get(IDStrings.SINGGOLD).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headSingGold);                                // Golden Veil II - Tick
        map.get(IDStrings.SINGGOLD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSingGold);              // Golden Veil II - Damage
        map.get(IDStrings.SINGZINC).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headSingZinc);                                // Graceful II
        map.get(IDStrings.EARTH).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::rodEarth);                           // Grinder
        map.get(IDStrings.INFINITY).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headInfinity);                    // Infinite
        map.get(IDStrings.SINGLEAD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSingLead);                                  // Leech II
        map.get(IDStrings.MAGNONIUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headMagnonium);                 // Magnanimous
        map.get(IDStrings.SINGMAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSingMagnesium);                        // Magnetesium II
        map.get(IDStrings.SINGTIN).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSingTin);                // Malleable II - Damage
        map.get(IDStrings.SINGTIN).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headSingTin);                                  // Malleable II - Tick
        map.get(IDStrings.FORTUNE).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodFortune);                                    // Merchant's Veil
        map.get(IDStrings.ADAMANTITE).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headAdamantite);               // Mystic - Block Break
        map.get(IDStrings.ADAMANTITE).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headAdamantite);          // Mystic - Damage
        map.get(IDStrings.SINGLEAD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSingLead);              // Poisonous II
        map.get(IDStrings.MAGSTEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headMagSteel);              // Really Stainless
        map.get(IDStrings.SINGALUMINUM).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headSingAluminum);            // Recyclable II
        // Reinforced                                                                       |-- CO - Reinforced Rod
        map.get(IDStrings.MAGIC).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodMagic);                                        // Secrets Revealed
        map.get(IDStrings.SINGIRON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSingIron);                                  // Sharp 1 II
        map.get(IDStrings.SINGALUMINUM).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::rodSingAluminum);              // Soft II - Durability
        map.get(IDStrings.SINGALUMINUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::rodSingAluminum);             // Soft II - Block Break
        map.get(IDStrings.SINGALUMINUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodSingAluminum);        // Soft II - Damage
        map.get(IDStrings.SINGSILVER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.ROD, PlayerDamagedEvents::rodSingSilver);           // Soft Touch II
        // Stability II (Does nothing, here for consistency)
        map.get(IDStrings.MYTHRIL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodMythril);                                    // Sting of Gondolin
        map.get(IDStrings.SINGZINC).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSingZinc);                                  // Super Lightweight II
        map.get(IDStrings.MAGIC).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headMagic);                                      // Trick
        map.get(IDStrings.VOID).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headVoid);                           // Void Miner

    }

    public static void setupArmourConsumers() {
        map.get(IDStrings.SINGZINC).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksSingZinc);           // Acupuncture II
        map.get(IDStrings.SINGGOLD).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksSingGold);                              // Barter II
        map.get(IDStrings.FORTUNE).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::plateAluBronze);                              // Beautiful (CO)
        map.get(IDStrings.SINGCOPPER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSingCopper);       // Beginner II - Damage
        map.get(IDStrings.SINGCOPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateSingCopper);        // Beginner II - Exp
        map.get(IDStrings.SINGTIN).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksSingTin);             // Boost II
        map.get(IDStrings.MYTHRIL).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::brightBurn);                                  // Brightburn
        map.get(IDStrings.MYTHRIL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksMythril);             // Call of the Wild
        map.get(IDStrings.SINGSILVER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSingSilver);       // Conductivity II
        map.get(IDStrings.MAGSTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksMagSteel);           // Defender
        map.get(IDStrings.ADAMANTITE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateAdamantite);       // Deflective
        map.get(IDStrings.TITANIUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.PLATE, BlockBreakEvents::linksHardened);                 // Dwarven Skills (CO)
        // Easily Shaped II (In RepairBench)
        // Enchanting II (in Experience)
        map.get(IDStrings.MAGNONIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::linksAluBrass);          // Escape (CO)
        map.get(IDStrings.ADAMANTITE).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.LINKS, EntityDamageEvents::linksAdamantite);        // Experienced - Kill
        map.get(IDStrings.ADAMANTITE).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.LINKS, BlockBreakEvents::linksAdamantite);             // Experienced - Block Break
        map.get(IDStrings.SINGALUMINUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateSingAluminium);                     // Foil II - Speed
        map.get(IDStrings.SINGALUMINUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSingAluminium);  // Foil II - Damage
        map.get(IDStrings.METAL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksMetal);                 // Gleam
        map.get(IDStrings.TITANIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksTitanium);           // Heat Resistant
        map.get(IDStrings.FORTUNE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateFortune);             // How Fortunate!
        map.get(IDStrings.FORTUNE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateFortune);             // How Fortunate!
        map.get(IDStrings.INFINITY).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateInfinity);           // Infinite Capacity
        map.get(IDStrings.INFINITY).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.PLATE, RightClickEvents::plateInfinity);                 // Infinite Capacity - Click
        map.get(IDStrings.SINGINFINITY).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksSingInfinity);   // Infinite Defence
        map.get(IDStrings.SINGINFINITY).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSingInfinity);   // Infinity Powerful
        map.get(IDStrings.EARTH).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.LINKS, RightClickEvents::linksEarth);                       // It's Natural
        map.get(IDStrings.METAL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateMetal);                 // KOTR
        map.get(IDStrings.EARTH).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateEarth);                                    // Lava Walker
        map.get(IDStrings.SINGMAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateSingMagnesium);                    // Light II - Speed
        map.get(IDStrings.SINGMAGNESIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateSingMagnesium);  // Light II - Damage
        map.get(IDStrings.MAGIC).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksMagic);                 // Magical Mint
        map.get(IDStrings.SINGMAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksSingMagnesium);                    // Magnesight II
        map.get(IDStrings.SINGTIN).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateSingTin);                                // Non-Corrosive II
        map.get(IDStrings.INFINITY).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksInfinity);           // Oroborus
        map.get(IDStrings.MAGNONIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksMagnonium);         // Oxygenated
        map.get(IDStrings.VOID).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateVoid);                   // Planewalker
        map.get(IDStrings.SINGGOLD).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSingGold);           // Prosperous II
        map.get(IDStrings.SINGIRON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.LINKS, EntityDamageEvents::linksSingIron);            // Rusty II
        map.get(IDStrings.SINGLEAD).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksSingLead);                              // Sickly II - Links
        map.get(IDStrings.SINGLEAD).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateSingLead);                              // Sickly II - Plate
        map.get(IDStrings.SINGZINC).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateSingZinc);            // Sneaky II
        map.get(IDStrings.SINGIRON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSingIron);           // Steadfast II
        map.get(IDStrings.MAGSTEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::linksCopper);              // Tarnished (CO)
        map.get(IDStrings.SINGCOPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.LINKS, EntityDamageEvents::linksSingCopper);        // Tarnished II
        map.get(IDStrings.VOID).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksVoid);                   // The End
        map.get(IDStrings.MAGIC).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateMagic);                  // Wizard Robes
    }

}
