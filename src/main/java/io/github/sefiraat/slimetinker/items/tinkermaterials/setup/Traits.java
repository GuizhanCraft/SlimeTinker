package io.github.sefiraat.slimetinker.items.tinkermaterials.setup;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.InteractionEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.events.friend.TraitEventType;
import io.github.sefiraat.slimetinker.items.tinkermaterials.elements.MaterialTrait;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;


public final class Traits {

    private Traits() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // region Core

    public static final MaterialTrait CORE_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("稳定")
        .setLore(
            "没有特性!"
        );

    public static final MaterialTrait CORE_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("锋利 1")
        .setLore(
            "获得力量效果 (可叠加)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodIron);

    public static final MaterialTrait CORE_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("坚固")
        .setLore(
            "有33%的几率免疫爆炸伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIron);

    public static final MaterialTrait CORE_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("腐蚀")
        .setLore(
            "-20% 输出伤害",
            "+10% 玩家经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksIron);

    public static final MaterialTrait CORE_GOLD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("金色面纱")
        .setLore(
            "获得隐身效果",
            "",
            "应用在武器上时: ",
            "-100% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headGold)
        .addConsumer(TraitEventType.TICK, TickEvents::headGold);

    public static final MaterialTrait CORE_GOLD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("闪闪发光")
        .setLore(
            "获得发光效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodGold);

    public static final MaterialTrait CORE_GOLD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("繁荣")
        .setLore(
            "在受到伤害时",
            "有1%几率掉落1个金粒"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateGold);

    public static final MaterialTrait CORE_GOLD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("来个交易")
        .setLore(
            "猪灵会被你吸引",
            "(周围5格内的猪灵不会攻击你)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGold);

    public static final MaterialTrait CORE_COPPER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("这是个脑力活")
        .setLore(
            "+50% 工具经验获取",
            "-50% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait CORE_COPPER_ROD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("经验传导")
        .setLore(
            "所有工具经验转化为玩家经验"
        );

    public static final MaterialTrait CORE_COPPER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("新手")
        .setLore(
            "+20% 防具经验获取",
            "+25% 承受伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateCopper);

    public static final MaterialTrait CORE_COPPER_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("暗淡")
        .setLore(
            "-20% 输出伤害",
            "+20% 防具经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait CORE_LEAD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("剧毒")
        .setLore(
            "命中时有25%的几率附加中毒效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headLead);

    public static final MaterialTrait CORE_LEAD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("蚂蟥")
        .setLore(
            "获得额外血量,但会消耗能量",
            "(获得饥饿,生命提升III效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodLead);

    public static final MaterialTrait CORE_LEAD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("生病了")
        .setLore(
            "铅制防具并不是个好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateLead);

    public static final MaterialTrait CORE_LEAD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("生病了")
        .setLore(
            "铅制防具并不是个好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLead);

    public static final MaterialTrait CORE_SILVER_HEAD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("附魔")
        .setLore(
            "-50% 工具经验获取",
            "",
            "工具升级时获得随机附魔",
            "附魔可能并不适用于该工具"
        );

    public static final MaterialTrait CORE_SILVER_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("轻触")
        .setLore(
            "你感觉轻松多了",
            "(获得缓降III效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSilver);

    public static final MaterialTrait CORE_SILVER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("导电")
        .setLore(
            "免疫闪电伤害",
            "被闪电击中时在周围召唤闪电"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSilver);

    public static final MaterialTrait CORE_SILVER_LINKS = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("附魔")
        .setLore(
            "防具升级时获得随机附魔",
            "附魔可能并不适用于该防具"
        );

    public static final MaterialTrait CORE_ALUMINUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("再生资源")
        .setLore(
            "使用时有25%的几率恢复耐久"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headAluminum);

    public static final MaterialTrait CORE_ALUMINUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("柔韧")
        .setLore(
            "+200% 耐久消耗",
            "+50% 工具经验获取"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluminum);

    public static final MaterialTrait CORE_ALUMINUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("快跑")
        .setLore(
            "+50% 承受伤害",
            "获得速度效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluminum)
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluminum);

    public static final MaterialTrait CORE_ALUMINUM_LINKS = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("快速修复")
        .setLore(
            "只需要1个修复工具即可完全修复"
        );

    public static final MaterialTrait CORE_TIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("幸运")
        .setLore(
            "-50% 输出伤害",
            "获得幸运效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headTin);

    public static final MaterialTrait CORE_TIN_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("罐头")
        .setLore(
            "你不再饥饿,但你变得更加虚弱",
            "(获得饱和和虚弱效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodTin);

    public static final MaterialTrait CORE_TIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("抗毒")
        .setLore(
            "免疫中毒效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateTin);

    public static final MaterialTrait CORE_TIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("承伤")
        .setLore(
            "当受到伤害时,获得伤害吸收效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTin);

    public static final MaterialTrait CORE_ZINC_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("海豚的恩惠")
        .setLore(
            "激活海豚的力量!",
            "(获得海豚的恩惠效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headZinc);

    public static final MaterialTrait CORE_ZINC_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("飘浮")
        .setLore(
            "未蹲下时让你变得比空气还轻",
            "(获得飘浮II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodZinc);

    public static final MaterialTrait CORE_ZINC_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("偷袭")
        .setLore(
            "当目标看向别处时,",
            "+100% 对其造成的伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateZinc);

    public static final MaterialTrait CORE_ZINC_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("针灸")
        .setLore(
            "免疫来自仙人掌的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksZinc);

    public static final MaterialTrait CORE_MAGNESIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("燃烧")
        .setLore(
            "有(工具等级 x 5)%的几率",
            "让敌人着火"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("磁铁")
        .setLore(
            "随机捡起附近5格范围内的物品"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("快溜")
        .setLore(
            "-25% 输出伤害",
            "获得速度效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagnesium)
        .addConsumer(TraitEventType.TICK, TickEvents::plateMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("镁地™夜视")
        .setLore(
            "获得夜视和虚弱效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksMagnesium);

    public static final MaterialTrait CORE_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("不锈钢")
        .setLore(
            "可以抵挡鲜血",
            "(仅视觉效果)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSteel);

    public static final MaterialTrait CORE_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("轻量")
        .setLore(
            "+50% 工具经验获取",
            "获得速度效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSteel);

    public static final MaterialTrait CORE_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("坚硬")
        .setLore(
            "-25% 受到的爆炸伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSteel);

    public static final MaterialTrait CORE_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("强壮")
        .setLore(
            "获得生命提升效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("吸血鬼")
        .setLore(
            "造成伤害时有33%的几率恢复1点血量",
            "-50% 伤害 (日间)",
            "+50% 伤害 (夜间)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("夜行者")
        .setLore(
            "获得夜视效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("复用")
        .setLore(
            "获得生命提升效果",
            "其等级取决于含有复用特性的防具数量",
            "1件 \u21e8 1级",
            "2件 \u21e8 3级",
            "3件 \u21e8 6级",
            "4件 \u21e8 10级"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDamSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("荆棘")
        .setLore(
            "免疫并反弹荆棘伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDamSteel);

    public static final MaterialTrait CORE_DURALUMIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("耐用")
        .setLore(
            "工具损坏时依然可用,但:",
            "-50% 输出伤害",
            "获得挖掘疲劳效果",
            "无法获得工具经验"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDuralium)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headDuralium)
        .addConsumer(TraitEventType.TICK, TickEvents::headDuralium);

    public static final MaterialTrait CORE_DURALUMIN_ROD = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("完全修复")
        .setLore(
            "只需要1格修复工具即可完全修复"
        );

    public static final MaterialTrait CORE_DURALUMIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("耐用")
        .setLore(
            "防具损坏时依然可用,但:",
            "+20% 承受伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateDuralium);

    public static final MaterialTrait CORE_DURALUMIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("减震剂")
        .setLore(
            "有10%的几率免疫伤害",
            "多个特性不会提高该几率"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDuralium);

    public static final MaterialTrait CORE_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("防火")
        .setLore(
            "获得防火效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBronze);

    public static final MaterialTrait CORE_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("不对劲")
        .setLore(
            "一定是这个工具有问题,一定是..."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBronze);

    public static final MaterialTrait CORE_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("农民")
        .setLore(
            "收获农作物时增加1个掉落物",
            "该效果不会受到时运的影响",
            "该效果不会叠加,但可被其他特性影响"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::plateBronze);

    public static final MaterialTrait CORE_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("脆弱")
        .setLore(
            "+100% 耐久消耗"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("锋利 2")
        .setLore(
            "获得力量效果 (可叠加)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headAlubronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("脆弱")
        .setLore(
            "+100% 耐久消耗"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("鲜花")
        .setLore(
            "在行走时有几率让周围的草地上开花"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("弹射!")
        .setLore(
            "当血量低于一半时受到伤害",
            "会弹射起飞!",
            "(获得飘浮III效果)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBronze);

    public static final MaterialTrait CORE_HARDENED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("击退")
        .setLore(
            "击退任何命中的生物",
            "有几率禁锢目标"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait CORE_HARDENED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("锤子")
        .setLore(
            "可挖掘 3x3x3 区域"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_HARDENED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("坚韧")
        .setLore(
            "不消耗耐久"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateHardened);

    public static final MaterialTrait CORE_HARDENED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("地精")
        .setLore(
            "在挖矿时有几率找到不稀有的物品",
            "该几率可以叠加"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("炽热")
        .setLore(
            "可熔炼掉落物",
            "",
            "这也许是把熔炉镐?"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("烫烫烫")
        .setLore(
            "&k锟斤拷"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("高温")
        .setLore(
            "有几率使周围实体着火"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("温血")
        .setLore(
            "在地狱获得速度II效果",
            "在末地获得缓慢效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCorBronze);

    public static final MaterialTrait CORE_SOLDER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("隐身")
        .setLore(
            "获得隐身效果",
            "但在使用时会立即损坏"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSolder)
        .addConsumer(TraitEventType.TICK, TickEvents::headSolder);

    public static final MaterialTrait CORE_SOLDER_ROD = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("绑定")
        .setLore(
            "工具无法被丢弃",
            "也不会在死亡时掉落"
        );

    public static final MaterialTrait CORE_SOLDER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("软着陆")
        .setLore(
            "免疫鞘翅的撞击伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSolder);

    public static final MaterialTrait CORE_SOLDER_LINKS = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("绑定")
        .setLore(
            "防具无法被丢弃",
            "也不会在死亡时掉落"
        );

    public static final MaterialTrait CORE_BILLON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("速掘")
        .setLore(
            "获得急迫效果",
            "(可叠加)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBillon);

    public static final MaterialTrait CORE_BILLON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("弹簧")
        .setLore(
            "让你跳的更高",
            "(获得跳跃提升IV效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBillon);

    public static final MaterialTrait CORE_BILLON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("天使降临")
        .setLore(
            "你的攻击将治疗目标",
            "而不是伤害目标"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateBillon);

    public static final MaterialTrait CORE_BILLON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("热导体")
        .setLore(
            "免疫岩浆块的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBillon);

    public static final MaterialTrait CORE_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("倒霉鬼")
        .setLore(
            "+20% 输出伤害",
            "获得厄运III效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait CORE_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("氧气")
        .setLore(
            "获得水下呼吸效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBrass);

    public static final MaterialTrait CORE_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("绑定环")
        .setLore(
            "+200% 耐久消耗",
            "承受伤害将根据耐久度计算:",
            "耐久高于一半时减少承受伤害,满耐久度时最多减少25%",
            "耐久低于一半时增加承受伤害,1耐久度时最多增加25%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateBrass)
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateBrass);

    public static final MaterialTrait CORE_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("崩!撤!卖!溜!")
        .setLore(
            "+100% 耐久消耗",
            "当血量低于一半时受到伤害",
            "获得速度III效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("阿布拉")
        .setLore(
            "命中生物时有33%的几率",
            "使目标随机传送"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("好学")
        .setLore(
            "+50% 工具经验获取",
            "+50% 玩家经验获取",
            "-50% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAlubrass)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("巫师")
        .setLore(
            "-50% 承受的魔法伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("逃脱")
        .setLore(
            "受到伤害时随机传送到附近",
            "(CD: 10秒)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait CORE_NICKEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("带电(负极-)")
        .setLore(
            "有20%的几率",
            "+200% 输出伤害",
            "并禁锢目标",
            "(需要与正极同时存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("带电(负极-)")
        .setLore(
            "有20%的几率",
            "+200% 输出伤害",
            "并禁锢目标",
            "(需要与正极同时存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("磁铁(负极-)")
        .setLore(
            "磁铁的负极",
            "磁铁可以自动吸收周围的掉落物",
            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateNickel);

    public static final MaterialTrait CORE_NICKEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("磁铁(负极-)")
        .setLore(
            "磁铁的负极",
            "磁铁可以自动吸收周围的掉落物",
            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksNickel);

    public static final MaterialTrait CORE_COBALT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("带电(正极+)")
        .setLore(
            "有20%的几率",
            "+200% 输出伤害",
            "并禁锢目标",
            "(需要与负极同时存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("带电(正极+)")
        .setLore(
            "有20%的几率",
            "+200% 输出伤害",
            "并禁锢目标",
            "(需要与负极同时存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("磁铁(正极+)")
        .setLore(
            "磁铁的正极",
            "磁铁可以自动吸收周围的掉落物",
            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCobalt);

    public static final MaterialTrait CORE_COBALT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("磁铁(正极+)")
        .setLore(
            "磁铁的正极",
            "磁铁可以自动吸收周围的掉落物",
            "范围 = (磁铁正极数 + 磁铁负极数) - (磁铁正级数与负极数的差异)",
            "(即磁铁正负极数越多,且正负极数尽量一致,即可增大范围)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCobalt);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("锤子")
        .setLore(
            "可挖掘 3x3x3 区域"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_ROD = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("双倍强化")
        .setLore(
            "强化合金板模组拥有双倍效果",
            "(只需5个即可不消耗耐久)"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_PLATES = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("双倍强化")
        .setLore(
            "强化合金板模组拥有双倍效果",
            "(只需5个即可不消耗耐久)"
        );

    public static final MaterialTrait CORE_REINFORCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("防凋零")
        .setLore(
            "免疫凋零效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksReinforced);

    public static final MaterialTrait CORE_STRING_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("又不是不能用")
        .setLore(
            "没有任何效果",
            "能用就行了"
        );

    public static final MaterialTrait CORE_STRING_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("又不是不能用")
        .setLore(
            "没有任何效果",
            "能用就行了"
        );

    public static final MaterialTrait CORE_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("生长")
        .setLore(
            "在白天缓慢修复工具"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderVine);

    public static final MaterialTrait CORE_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("生长")
        .setLore(
            "在白天缓慢修复工具"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVine);


    public static final MaterialTrait CORE_CRIMSON_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("腐烂")
        .setLore(
            "在夜间缓慢修复工具"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderCrimsonRoot);

    public static final MaterialTrait CORE_CRIMSON_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("腐烂")
        .setLore(
            "在夜间缓慢修复工具"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCrimsonRoots);

    public static final MaterialTrait CORE_WARPED_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("恢复")
        .setLore(
            "缓慢治疗玩家"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindWarpedRoot);

    public static final MaterialTrait CORE_WARPED_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("恢复")
        .setLore(
            "缓慢治疗玩家"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWarpedRoots);

    public static final MaterialTrait CORE_WEEPING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("不祥之兆")
        .setLore(
            "我感觉很不好...",
            "(获得不祥之兆效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderWeepingVine);

    public static final MaterialTrait CORE_WEEPING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("不祥之兆")
        .setLore(
            "我感觉很不好...",
            "(获得不祥之兆效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWeepingVines);

    public static final MaterialTrait CORE_TWISTING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("吸引")
        .setLore(
            "自动吸收周围5格内的掉落物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderTwistingVine);

    public static final MaterialTrait CORE_TWISTING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("吸引")
        .setLore(
            "自动吸收周围5格内的掉落物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonTwistingWines);

    public static final MaterialTrait CORE_SLIME_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("弹性")
        .setLore(
            "-50% 摔落伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlime);

    public static final MaterialTrait CORE_SLIME_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("弹性")
        .setLore(
            "-25% 摔落伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlime);

    public static final MaterialTrait CORE_SILICON_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("缓慢学习")
        .setLore(
            "破坏方块时",
            "+(5 * 工具等级)% 工具经验获取"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::bindSilicon);

    public static final MaterialTrait CORE_SILICON_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("缓慢学习")
        .setLore(
            "+(5 * 防具等级)% 防具经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonSilicon);

    public static final MaterialTrait CORE_LEATHER_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("厚皮革")
        .setLore(
            "+50% 工具经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::binderLeather)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::binderLeather);

    public static final MaterialTrait CORE_LEATHER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("厚皮革")
        .setLore(
            "+10% 防具经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonLeather);

    public static final MaterialTrait CORE_FERROSILICON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("氢气")
        .setLore(
            "受到伤害时",
            "获得飘浮效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("太阳能")
        .setLore(
            "在白天持续恢复耐久"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("魔童")
        .setLore(
            "获得1层魔童效果",
            "当拥有4层及以上的魔童效果时",
            "击退周围5格内的所有的生物",
            "(凋灵与末影龙除外)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("电棍")
        .setLore(
            "有几率在命中生物时召唤闪电"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("充能")
        .setLore(
            "在 5x2x5 范围内随机充能方块",
            "(激活红石信号)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("谁还要压力板?")
        .setLore(
            "你脚下的方块是充能的"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksRedstoneAlloy);

    public static final MaterialTrait CORE_BOOMERITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("梯子模拟器™")
        .setLore(
            "右键点击时生成梯子"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headBoomerite);

    public static final MaterialTrait CORE_BOOMERITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Go Boomer")
        .setLore(
            "警告: 即将发生爆炸"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateBoomerite);

    public static final MaterialTrait CORE_SEFIRITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("庆祝")
        .setLore(
            "是时候庆祝一下Sefi的生日了"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headSefirite);

    public static final MaterialTrait CORE_CRINGLEIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("庆祝节日")
        .setLore(
            "一起来庆祝圣诞节吧!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCringleium);

    public static final MaterialTrait CORE_LOVE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("这是你要的一切")
        .setLore(
            "你被关爱了",
            "(获得生命回复效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLove);

    public static final MaterialTrait CORE_NICEINIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nice")
        .setLore(
            "Nice"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headNice)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headNice);

    public static final MaterialTrait CORE_SMITHIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("坚毅")
        .setLore(
            "有 50% 几率不消耗耐久。"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSmithium);

    public static final MaterialTrait CORE_SMITHIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("勤勉")
        .setLore(
            "Shift + 右键点击来激活急速爆裂效果，持续30秒。",
            "急速爆裂效果生效期间，",
            "每破坏一个方块有 [50 ÷ 急迫等级]% 几率",
            "增加1级急迫效果，最高为急迫 10。冷却时间5分钟。"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodSmithium)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodSmithium);

    public static final MaterialTrait CORE_SMITHIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("抗热")
        .setLore(
            "有 25% 几率无视火焰/岩浆伤害。"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::platesSmithium);

    public static final MaterialTrait CORE_SMITHIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("工匠技术")
        .setLore(
            "有 25% 几率返还维修花费。"
        );

    public static final MaterialTrait CORE_ANNIVERSARIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("粘液科技10周年!")
        .setLore(
            "庆祝粘液科技10周年!",
            "",
            "需要全套护甲才能生效."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAnniversary);

    // endregion

    // region Infinity Expansion

    public static final MaterialTrait INFINITY_VOID_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("虚空矿工")
        .setLore(
            "在挖掘时有几率掉落随机的矿产"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headVoid);

    public static final MaterialTrait INFINITY_VOID_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("虚空恐惧")
        .setLore(
            "+150% 输出伤害",
            "在末地时:",
            "+250% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodVoid);

    public static final MaterialTrait INFINITY_VOID_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("虚空行者")
        .setLore(
            "虚空不再是你的敌人",
            "(落入虚空时自动传送至当前位置向上200格的位置)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateVoid);

    public static final MaterialTrait INFINITY_VOID_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("末地领主")
        .setLore(
            "-10% 来自末影龙,末影人,潜影贝的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksVoid);

    public static final MaterialTrait INFINITY_MAGSTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("真的是不锈钢")
        .setLore(
            "很像不锈钢,但真的是可以抵挡鲜血",
            "(更炫酷的视觉效果)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagSteel);

    public static final MaterialTrait INFINITY_MAGSTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("燃烧")
        .setLore(
            "有(工具等级 x 5)%的几率",
            "让敌人着火"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait INFINITY_MAGSTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("暗淡")
        .setLore(
            "-20% 输出伤害",
            "+20% 防具经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait INFINITY_MAGSTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("防御")
        .setLore(
            "受到伤害时,有5%的几率",
            "免疫伤害并获得伤害吸收效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagSteel);

    public static final MaterialTrait INFINITY_TITANIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("双倍强化")
        .setLore(
            "强化合金板模组拥有双倍效果",
            "(只需5个即可不消耗耐久)"
        );

    public static final MaterialTrait INFINITY_TITANIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("耐用")
        .setLore(
            "工具损坏时依然可用,但:",
            "-50% 输出伤害",
            "获得挖掘疲劳效果",
            "无法获得工具经验"
        );

    public static final MaterialTrait INFINITY_TITANIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("地精")
        .setLore(
            "在挖矿时有几率找到不稀有的物品",
            "该几率可以叠加"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait INFINITY_TITANIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("防火")
        .setLore(
            "免疫来自火焰、岩浆与岩浆块的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTitanium);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("稳定 II")
        .setLore(
            "还是没有特性"
        );

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("锋利 1 II")
        .setLore(
            "获得力量II效果 (可叠加)",
            "(不要在意这糟糕的名字)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("坚固 II")
        .setLore(
            "爆炸将治疗你",
            "而不会造成伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("腐蚀 II")
        .setLore(
            "-10% 输出伤害",
            "+10% 玩家经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingIron);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("金色面纱 II")
        .setLore(
            "获得隐身效果",
            "",
            "应用在武器上时: ",
            "+50% 输出伤害"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingGold)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("闪闪发光 II")
        .setLore(
            "获得彩虹发光效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("繁荣 II")
        .setLore(
            "在受到伤害时",
            "有1%几率掉落1-4个金粒"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("来个交易 II")
        .setLore(
            "猪灵会被你深深地吸引",
            "(周围5格内的猪灵不会攻击你)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingGold);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("这是个脑力活 II")
        .setLore(
            "+200% 工具经验获取",
            "-50% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_ROD = new MaterialTrait()
        // Special case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("经验传导 II")
        .setLore(
            "所有工具经验转化为玩家经验",
            "并获得额外50%的加成"
        );

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("新手 II")
        .setLore(
            "+40% 防具经验获取",
            "+50% 承受伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("暗淡 II")
        .setLore(
            "-20% 输出伤害",
            "+40% 防具经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingCopper);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("剧毒 II")
        .setLore(
            "命中时有50%的几率附加中毒II效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("蚂蟥 II")
        .setLore(
            "获得额外血量",
            "(获得生命提升II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("生病了 II")
        .setLore(
            "铅制防具真的不是个好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("生病了 II")
        .setLore(
            "铅制防具真的不是个好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingLead);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_HEAD = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("附魔 II")
        .setLore(
            "-50% 工具经验获取",
            "工具升级时获得1-3个随机附魔",
            "附魔可能并不适用于该工具"
        );

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("轻触 II")
        .setLore(
            "你感觉更加轻松了",
            "(免疫摔落伤害)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("导电 II")
        .setLore(
            "被闪电击中时可获得治疗",
            "并在周围生成闪电风暴"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_LINKS = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("附魔 II")
        .setLore(
            "防具升级时获得1-3个随机附魔",
            "附魔可能并不适用于该防具"
        );

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("再生资源 II")
        .setLore(
            "使用时有33%的几率恢复耐久"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("柔韧 II")
        .setLore(
            "+100% 耐久消耗",
            "+100% 工具经验获取"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodSingAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodSingAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("快跑 II")
        .setLore(
            "+50% 承受伤害",
            "获得速度II效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingAluminium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingAluminium);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("快速修复 II")
        .setLore(
            "只需要1个任意材质的修复工具即可完全修复"
        );

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("幸运 II")
        .setLore(
            "-50% 输出伤害",
            "获得幸运II效果",
            "获得速度II效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("罐头 II")
        .setLore(
            "饥饿度不会下降"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("抗毒 II")
        .setLore(
            "免疫中毒、饥饿、虚弱效果",
            "中毒效果会治疗你"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("承伤 II")
        .setLore(
            "当受到伤害时,获得伤害吸收II效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingTin);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("海豚的恩惠 II")
        .setLore(
            "激活海豚的力量!更多的力量!",
            "(获得海豚的恩惠II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("飘浮 II")
        .setLore(
            "蹲下时让你变得比空气还轻",
            "(获得飘浮II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("偷袭 II")
        .setLore(
            "当目标看向别处时,",
            "+100% 对其造成的伤害",
            "(看向别处的判定范围更广)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("针灸 II")
        .setLore(
            "免疫来自仙人掌的伤害",
            "来自仙人掌的伤害可以治疗你"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingZinc);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("燃烧 II")
        .setLore(
            "有(工具等级 x 10)%的几率",
            "让敌人着火更长时间"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("磁铁 II")
        .setLore(
            "随机捡起附近10格范围内的物品"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("快溜 II")
        .setLore(
            "-50% 输出伤害",
            "获得速度II效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingMagnesium)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("镁地™夜视 II")
        .setLore(
            "获得夜视效果",
            "并标记出周围10格内所有生物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingMagnesium);

    public static final MaterialTrait INFINITY_MYTHRIL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("精灵疾驰")
        .setLore(
            "+50% 耐久消耗",
            "获得急迫II效果",
            "获得速度效果"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headMythril)
        .addConsumer(TraitEventType.TICK, TickEvents::headMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("贡多林刺针")
        .setLore(
            "击退附近所有的敌对生物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("魔童")
        .setLore(
            "获得1层魔童效果",
            "当拥有4层及以上的魔童效果时",
            "击退周围5格内的所有的敌对生物",
            "(凋灵与末影龙除外)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait INFINITY_MYTHRIL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("野性的呼唤")
        .setLore(
            "当受到伤害时",
            "有几率召唤一只狼来帮助你"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMythril);

    public static final MaterialTrait INFINITY_ADAMANTITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("神秘")
        .setLore(
            "挖矿时: ",
            "+100% 玩家经验获取",
            "",
            "击杀生物时: ",
            "+50% 玩家经验获取"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headAdamantite)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("坚硬")
        .setLore(
            "免疫爆炸伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("射歪了")
        .setLore(
            "-25% 来自弹射物的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("有经验的")
        .setLore(
            "+10% 工具经验获取",
            "+10% 玩家经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait INFINITY_MAGNONIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("宽宏大量")
        .setLore(
            "你真的太棒了",
            "谢谢你"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headMagnonium);

    public static final MaterialTrait INFINITY_MAGNONIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("炽热")
        .setLore(
            "可熔炼掉落物"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait INFINITY_MAGNONIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("逃脱")
        .setLore(
            "受到伤害时随机传送到附近",
            "(CD: 10秒)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait INFINITY_MAGNONIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("有氧")
        .setLore(
            "谁需要它呢?",
            "(免疫溺水伤害)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagnonium);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("幸运")
        .setLore(
            "获得双倍掉落物",
            "可与青金石模组叠加"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("商人面纱")
        .setLore(
            "没有副作用的隐身",
            "(获得隐身III效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("多么幸运")
        .setLore(
            "受到1点以上(初始)伤害时",
            "有0.5%的几率获得一件礼物"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("鲜花")
        .setLore(
            "在行走时有几率让周围的草地上开花"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("魔术戏法")
        .setLore(
            "对周围所有生物随机释放魔术戏法,包括:",
            "- 击退",
            "- 中毒",
            "- 随机传送",
            "- 着火",
            "- 速度"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("揭露秘密")
        .setLore(
            "标记出周围10格内的所有的生物(也许不一定是)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("巫师袍")
        .setLore(
            "造成伤害时",
            "有几率释放魔法"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("魔法薄荷")
        .setLore(
            "免疫龙息伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagic);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("撼地者")
        .setLore(
            "击退并禁锢命中的生物"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("粉碎机")
        .setLore(
            "破坏方块时的掉落物",
            "就像经过了粉碎机一样"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("岩浆行者")
        .setLore(
            "脚下的岩浆变为岩浆块"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("自然法则")
        .setLore(
            "右键点击时,喂食周围的两只动物",
            "(CD: 2分钟)",
            "无论是否喂食成功,该效果都会进入冷却"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksEarth);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("干净利落")
        .setLore(
            "+100% 输出伤害",
            "获得急迫II效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("经验导体")
        .setLore(
            "所有玩家经验以10:1的比例",
            "转化为工具经验"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("圆桌骑士")
        .setLore(
            "受到伤害时有几率",
            "在周围生成圆桌骑士",
            "(好吧,是铁傀儡)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("闪光弹")
        .setLore(
            "受到伤害时,有几率",
            "反弹伤害并使攻击者眩晕"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMetal);

    public static final MaterialTrait INFINITY_INFINITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("无尽")
        .setLore(
            "这件工具获得了永生..."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headInfinity);

    public static final MaterialTrait INFINITY_INFINITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("概念性防御")
        .setLore(
            "-50% 承受伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodInfinity);

    public static final MaterialTrait INFINITY_INFINITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("无尽反应盔甲")
        .setLore(
            "每次承受伤害的10%会被存储",
            "最多可存储10点伤害(5颗心)",
            "右键点击对周围所有生物",
            "释放存储的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateInfinity)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateInfinity);

    public static final MaterialTrait INFINITY_INFINITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("衔尾蛇")
        .setLore(
            "有20%的几率反弹承受的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("断点")
        .setLore(
            "无法破坏",
            "+200% 输出伤害",
            "+200% 工具经验获取",
            "可挖掘 3x3x3 区域"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingInfinity)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingInfinity)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("无尽力量")
        .setLore(
            "每承受2000点伤害(减伤计算前)",
            "可以获得一个新的随机附魔",
            "无等级上限"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("无尽防御")
        .setLore(
            "当装备全套包含无尽防御的防具时",
            "所有承受的伤害均减少至1点"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingInfinity);

    public static final MaterialTrait INFINITY_REINFORCED_DRACONIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setSponsoredBy("Bunkky/ReasonFoundDecoy")
        .setTraitName("龙之愤怒")
        .setLore(
            "当被末影龙击中后,获得龙之愤怒效果,",
            "每层增加10%对末影龙的伤害,持续15秒,无上限.",
            "层数可叠加，2层为20%，3层为30%，以此类推",
            "叠加层数后重置持续时间."
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headReinforcedDraconium)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headReinforcedDraconium);

    // endregion

    // region LiteXpansion

    public static final MaterialTrait LITE_RUBBER_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("绝缘")
        .setLore(
            "免疫闪电伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindRubber);

    public static final MaterialTrait LITE_RUBBER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("出汗")
        .setLore(
            "橡胶护身软甲真的太热了!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonRubber);

    public static final MaterialTrait LITE_REFINED_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("真的稳定")
        .setLore(
            "真的没有特性",
            "不过也许升级后会有呢?",
            "",
            "工具等级满10级后:",
            "+(工具等级 * 10)% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("不知礼，无以立也")
        .setLore(
            "获得速度效果",
            "+50% 输出伤害",
            "你的战斗过程将变得炫酷"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRefinedIron)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodRefinedIron)
        .addConsumer(TraitEventType.TICK, TickEvents::rodRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("王牌特工")
        .setLore(
            "需要满足以下全部条件才能生效:",
            "- 装备全套有王牌特工特性的盔甲",
            "- 熟知礼仪 (不知礼，无以立也)",
            "",
            "右键点击时召唤毁灭阵",
            "对阵中的所有生物造成伤害",
            "(CD: 20分钟)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("看不到我")
        .setLore(
            "攻击者获得失明效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksRefinedIron);

    public static final MaterialTrait LITE_MIXED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("合金")
        .setLore(
            "随机获得其冶炼材料的特性",
            "但效果减半",
            "(随机获得速度,防火,幸运效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMixedMetal);

    public static final MaterialTrait LITE_MIXED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("倒霉鬼")
        .setLore(
            "+20% 输出伤害",
            "获得厄运III效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait LITE_MIXED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("有经验的")
        .setLore(
            "+10% 工具经验获取",
            "+10% 玩家经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait LITE_MIXED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("混乱")
        .setLore(
            "受到攻击时",
            "有几率与攻击者互换位置"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMixedMetal);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("散射")
        .setLore(
            "攻击时对周围所有生物同时造成伤害",
            "散射的伤害不会受到其他特性或模组的影响"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("高负荷")
        .setLore(
            "每损失50点耐久,会",
            "消耗一块铁锭来恢复50点耐久"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_PLATES = new MaterialTrait()
        // Event More Advanced (mod affector)
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("更加高级")
        .setLore(
            "Advanced modifiers +1 for each piece.",
            "(开发中的特性,暂不翻译)"
        );

    public static final MaterialTrait LITE_ADVANCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("高温")
        .setLore(
            "有几率使周围实体着火"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait LITE_MAG_THOR_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("耐热")
        .setLore(
            "你可以在岩浆里游泳",
            "(免疫火焰与岩浆伤害)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headMagThor);

    public static final MaterialTrait LITE_MAG_THOR_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("吸血鬼")
        .setLore(
            "造成伤害时有33%的几率恢复1点血量",
            "-50% 伤害 (日间)",
            "+50% 伤害 (夜间)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait LITE_MAG_THOR_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("放射性盔甲板")
        .setLore(
            "受到伤害时",
            "对攻击者施加中毒效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMagThor);

    public static final MaterialTrait LITE_MAG_THOR_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("建筑狂怒")
        .setLore(
            "有20%的几率在受到伤害时",
            "获得速度效果",
            "获得急迫效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagThor);

    public static final MaterialTrait LITE_CARBON_MESH_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("敏捷")
        .setLore(
            "获得速度效果",
            "-33% 承受伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindCarbonMesh)
        .addConsumer(TraitEventType.TICK, TickEvents::bindCarbonMesh);

    public static final MaterialTrait LITE_CARBON_MESH_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("碳纤维")
        .setLore(
            "获得速度效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCarbonMesh);

    public static final MaterialTrait LITE_SCRAP_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("可怕")
        .setLore(
            "+300% 耐久消耗",
            "-100% 工具经验获取"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headScrap)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headScrap);

    public static final MaterialTrait LITE_SCRAP_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("这是个脑力活")
        .setLore(
            "+100% 工具经验获取",
            "-50% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait LITE_SCRAP_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("可悲")
        .setLore(
            "警告: 不要穿上这件盔甲",
            "会有坏事发生",
            "+400% 玩家经验获取"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateScrap);

    public static final MaterialTrait LITE_SCRAP_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("分崩离析")
        .setLore(
            "+200% 玩家经验获取",
            "受到伤害时护甲有几率直接掉落"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksScrap)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksScrap);

    public static final MaterialTrait LITE_IRIDIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("保护")
        .setLore(
            "使你免于死亡",
            "(CD: 20分钟)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headIridium);

    public static final MaterialTrait LITE_IRIDIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("别看我")
        .setLore(
            "使目标看向你的朝向",
            "(CD: 20秒)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodIridium);

    public static final MaterialTrait LITE_IRIDIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("不屈")
        .setLore(
            "承受伤害的10%会被反弹至攻击者"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIridium);

    public static final MaterialTrait LITE_IRIDIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("非常规力量")
        .setLore(
            "承受的伤害会被转化为能源",
            "并存储在盔甲中(伤害不会被抵消)",
            "右键点击释放存储的能源",
            "用于给物品栏中所有的物品充电"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksIridium)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksIridium);

    // endregion

    // region Slimefun Warfare

    public static final MaterialTrait SFW_SEGGANESSON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("超载")
        .setLore(
            "每次攻击的初始伤害会被存储",
            "每10次攻击会释放所有已存储的伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("失明速度")
        .setLore(
            "获得速度V效果",
            "获得失明效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("引力")
        .setLore(
            "所有附近的实体",
            "会被缓慢地拖向你"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("灵魂虹吸")
        .setLore(
            "每击杀一个敌对生物可收集1个灵魂",
            "每100个灵魂 +1% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSegganesson);

    public static final MaterialTrait SFW_SLIMESTEEL_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("弹性 II")
        .setLore(
            "-50% 摔落伤害",
            "获得跳跃提升II效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlimesteel);

    public static final MaterialTrait SFW_SLIMESTEEL_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("月面弹跳")
        .setLore(
            "该特性运用于靴子时: ",
            "免疫摔落伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlimeSteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("强力粘液")
        .setLore(
            "当物品栏有空间时",
            "掉落的方块将直接进入物品栏中"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("灵活")
        .setLore(
            "仅在工具未损坏时有效",
            "-50% 承受伤害",
            "消耗与初始伤害数值相同的耐久"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("刚性与柔性")
        .setLore(
            "获得速度效果",
            "获得跳跃提升效果",
            "+10% 承受伤害"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateReinforcedSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("射偏了")
        .setLore(
            "有10%的几率免疫来自弹射物的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksReinforcedSlimesteel);

    public static final MaterialTrait SFW_OSMIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("锤子")
        .setLore(
            "可挖掘 3x3x3 区域"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait SFW_OSMIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("重型鞍座")
        .setLore(
            "命中的目标会被减速",
            "并且无法传送"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodOsmium);

    public static final MaterialTrait SFW_OSMIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("增重")
        .setLore(
            "获得减速效果",
            "受到伤害时,攻击者会被击退"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateOsmium);

    public static final MaterialTrait SFW_OSMIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("画笔")
        .setLore(
            "有5%的几率被承受伤害治疗"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksOsmium);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("野蛮人")
        .setLore(
            "获得挖掘疲劳效果",
            "命中的目标会被禁锢",
            "+100% 输出伤害",
            "有33的几率额外 +100% 输出伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headOsmiumSuperalloy)
        .addConsumer(TraitEventType.TICK, TickEvents::headOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("击退")
        .setLore(
            "击退任何命中的生物",
            "有几率禁锢目标"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("闪电风暴")
        .setLore(
            "当装备全套有闪电风暴特性的盔甲时",
            "有几率在周围召唤闪电风暴"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("部分衰变")
        .setLore(
            "有几率随机对周围生物造成伤害",
            "不会致死"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksOsmiumSuperalloy);

    public static final MaterialTrait SFW_UNPATENTABLIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("创新")
        .setLore(
            "在白天: ",
            "+100% 工具经验获取",
            "+100% 玩家经验获取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headUnpatentabilum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_ROD = new MaterialTrait()
        // Special case in ItemDrop and PlayerDeath
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("无形权利")
        .setLore(
            "工具无法被丢弃",
            "不会在死亡时掉落"
        );

    public static final MaterialTrait SFW_UNPATENTABLIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("强力凝视")
        .setLore(
            "你看向的实体会传送到你身边",
            "不会对玩家、凋灵、末影龙生效"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("圆桌骑士")
        .setLore(
            "受到伤害时有几率",
            "在周围生成圆桌骑士",
            "(好吧,是铁傀儡)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    // endregion

    // region DynaTech

    public static final MaterialTrait DYN_STAINLESS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("超级不锈钢")
        .setLore(
            "真的，绝对是不锈钢",
            "可以抵挡更多鲜血",
            "(更多花里胡哨的炫酷效果)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("餐具")
        .setLore(
            "攻击动物可直接喂食自己",
            "真不错..."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("标准")
        .setLore(
            "-5% 承受伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("水里是安全的")
        .setLore(
            "获得水下呼吸效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksStainlessSteel);

    public static final MaterialTrait DYN_VEX_GEM_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("土遁")
        .setLore(
            "右键点击随机传送到附近",
            "(CD: 5分钟)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::bindVex);

    public static final MaterialTrait DYN_VEX_GEM_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("真让人烦恼")
        .setLore(
            "恼鬼宝石不应该这样用!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVex);

    public static final MaterialTrait DYN_STAR_DUST_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("光煞")
        .setLore(
            "+50% 输出伤害",
            "攻击可使目标眩晕"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStarDust);

    public static final MaterialTrait DYN_STAR_DUST_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("依凡")
        .setLore(
            "\"不要向流星许愿，否则它就会变成女人\"",
            "获得发光效果",
            "周围的村民会不断向你聚集"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodStarDust);

    public static final MaterialTrait DYN_STAR_DUST_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("星光")
        .setLore(
            "有5%的几率",
            "在夜间恢复1点血量(半颗心)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateStardust);

    public static final MaterialTrait DYN_STAR_DUST_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("魔童")
        .setLore(
            "获得1层魔童效果",
            "当拥有4层及以上的魔童效果时",
            "击退周围5格内的所有的敌对生物",
            "(凋灵与末影龙除外)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("幽灵形态")
        .setLore(
            "免疫来自弹射物的伤害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("超立方体 [B]")
        .setLore(
            "只有 [A] 与 [B] 同时存在时才会生效",
            "",
            ThemeUtils.CLICK_INFO + "Shift + 右键点击" + ThemeUtils.PASSIVE + "存储位置",
            ThemeUtils.CLICK_INFO + "右键点击" + ThemeUtils.PASSIVE + "传送到存储的位置",
            "(CD: 10分钟)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("攻壳机动队")
        .setLore(
            "消耗耐久来缓慢攻击周围所有生物",
            "该特性不会致死",
            "(消耗耐久不受其他特性,模组,附魔的影响)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("幽灵之影")
        .setLore(
            "像幽灵一样盘旋",
            "(获得飘浮效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGhostly);

    public static final MaterialTrait DYN_TESSERACT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("超立方体 [A]")
        .setLore(
            "只有 [A] 与 [B] 同时存在时才会生效",
            "",
            ThemeUtils.CLICK_INFO + "Shift + 右键点击" + ThemeUtils.PASSIVE + "存储位置",
            ThemeUtils.CLICK_INFO + "右键点击" + ThemeUtils.PASSIVE + "传送到存储的位置",
            "(CD: 10分钟)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headTessMat);

    public static final MaterialTrait DYN_TESSERACT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("光学能量")
        .setLore(
            "需要全套包含双光学能量特性的盔甲",
            "(每件盔甲需要有2个光学能量特性)才能生效",
            "当你处于异次元之家中时，会不断积累光学能量",
            "当受到伤害时，光学能量会被释放用于抵消伤害",
            "(伤害为经过增伤/减伤计算后)",
            "1点光学能量可以抵消1点伤害",
            "若光学能量不足以抵消全部伤害,则不会抵消任何伤害",
            "每件盔甲最多可以存储50点光学能量",
            "全套盔甲最多可以存储200点光学能量"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    public static final MaterialTrait DYN_TESSERACT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("光学能量")
        .setLore(
            "需要8个光学能量特性才能生效",
            "(每件盔甲需要有2个光学能量特性)",
            "当你处于异次元之家中时，会不断积累光学能量",
            "当受到伤害时，光学能量会被释放用于抵消伤害",
            "(伤害为经过增伤/减伤计算后)",
            "1点光学能量可以抵消1点伤害",
            "若光学能量不足以抵消全部伤害,则不会抵消任何伤害",
            "每件盔甲最多可以存储50点光学能量",
            "全套盔甲最多可以存储200点光学能量"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    // endregion

    // region TranscEndence

    public static final MaterialTrait TNS_DAXI_STRENGTH = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("超能力")
        .setLore(
            "有20%的几率释放出超能力核心的力量",
            "造成100%额外伤害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDaxiStrength);

    public static final MaterialTrait TNS_DAXI_ABSORPTION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("超能力联合(A)")
        .setLore(
            "当4种超能力(A, F, S, R)联合起来后",
            "你死亡时可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiAbsorption);

    public static final MaterialTrait TNS_DAXI_FORTITUDE = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("超能力联合(F)")
        .setLore(
            "当4种超能力(A, F, H, R)联合起来后",
            "你死亡时可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiFortitude);

    public static final MaterialTrait TNS_DAXI_SATURATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("超能力联合(H)")
        .setLore(
            "当4种超能力(A, F, H, R)联合起来后",
            "你死亡时可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiSaturation);

    public static final MaterialTrait TNS_DAXI_REGENERATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("超能力联合(R)")
        .setLore(
            "当4种超能力(A, F, H, R)联合起来后",
            "你死亡时可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiRegeneration);

    // endregion

    // region Networks

    public static final MaterialTrait NTW_UTLIMANINIUM = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.NETWORKS_NOTE)
        .setTraitName("接入网络")
        .setLore(
            "你可以通过头盔发射出的信号",
            "远程接入一个网格",
            "",
            "在空手时:",
            ThemeUtils.CLICK_INFO + "Shift + 右键点击" + ThemeUtils.PASSIVE + "绑定网格",
            ThemeUtils.CLICK_INFO + "左键点击" + ThemeUtils.PASSIVE + "打开绑定的网格",
            "",
            ThemeUtils.ITEM_MOLTEN_METAL + "该特性仅用于头盔时有效"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksUltimaninium);

    // endregion
}
