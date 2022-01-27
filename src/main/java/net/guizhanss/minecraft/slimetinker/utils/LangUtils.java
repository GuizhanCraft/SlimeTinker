package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LangUtils {

    public static String getMaterialName(String type) {
        switch (type.toUpperCase()) {
            // Vanilla + Core SF
            case "IRON":
                return "铁";
            case "GOLD":
                return "金";
            case "COPPER":
                return "铜";
            case "SILVER":
                return "银";
            case "TIN":
                return "锡";
            case "MAGNESIUM":
                return "镁";
            case "ALUMINUM":
                return "铝";
            case "LEAD":
                return "铅";
            case "ZINC":
                return "锌";
            case "COAL":
                return "煤";
            case "STEEL":
                return "钢";
            case "DAMASCUS_STEEL":
                return "大马士革钢";
            case "DURALIUM":
                return "硬铝";
            case "BRONZE":
                return "青铜";
            case "ALUMINUM_BRONZE":
                return "铝青铜";
            case "HARDENED_METAL":
                return "硬化金属";
            case "CORINTHIAN_BRONZE":
                return "科林斯青铜";
            case "SOLDER":
                return "焊锡";
            case "BILLON":
                return "银铜合金";
            case "BRASS":
                return "黄铜";
            case "ALUMINUM_BRASS":
                return "铝黄铜";
            case "NICKEL":
                return "镍";
            case "COBALT":
                return "钴";
            case "REINFORCED_ALLOY":
                return "强化合金";
            case "STRING":
                return "线";
            case "VINE":
                return "藤蔓";
            case "CRIMSON_ROOT":
                return "绯红菌索";
            case "WARPED_ROOT":
                return "诡异菌索";
            case "WEEPING_VINE":
                return "垂泪藤";
            case "TWISTED_VINE":
                return "缠怨藤";
            case "SLIME":
                return "粘液";
            case "DIAMOND":
                return "钻石";
            case "REDSTONE":
                return "红石";
            case "REDSTONE_ALLOY":
                return "红石合金";
            case "SILICON":
                return "硅";
            case "FERROSILICON":
                return "硅铁";
            case "LEATHER":
                return "皮革";

            // Infinity Expansion
            case "VOID":
                return "虚空";
            case "INFINITE":
                return "无尽";
            case "FORTUNE_SINGULARITY":
                return "时运奇点";
            case "MAGIC_SINGULARITY":
                return "魔法奇点";
            case "EARTH_SINGULARITY":
                return "地球奇点";
            case "METAL_SINGULARITY":
                return "金属奇点";
            case "MAGSTEEL":
                return "磁钢";
            case "TITANIUM":
                return "钛";
            case "MYTHRIL":
                return "秘银";
            case "ADAMANTITE":
                return "精金";
            case "MAGNONIUM":
                return "镁合金";
            case "COPPER_SINGULARITY":
                return "铜结构";
            case "ZINC_SINGULARITY":
                return "锌结构";
            case "TIN_SINGULARITY":
                return "锡结构";
            case "ALUMINUM_SINGULARITY":
                return "铝结构";
            case "SILVER_SINGULARITY":
                return "银结构";
            case "MAGNESIUM_SINGULARITY":
                return "镁结构";
            case "LEAD_SINGULARITY":
                return "铅结构";
            case "GOLD_SINGULARITY":
                return "金结构";
            case "IRON_SINGULARITY":
                return "铁结构";
            case "DIAMOND_SINGULARITY":
                return "钻石结构";
            case "INFINITY_SINGULARITY":
                return "无尽结构";

            // Slimefun Warfare
            case "SLIME_STEEL":
                return "软钢";
            case "REINFORCED_SLIME_STEEL":
                return "强化软钢";
            case "OSMIUM_SUPERALLOY":
                return "锇高温合金";
            case "OSMIUM":
                return "锇";
            case "SEGGANESSON":
                return "塞格尼森";
            case "UNPATENTABLIUM":
                return "非专利品";

            // DynaTech
            case "STAINLESS_STEEL":
                return "不锈钢";
            case "VEX_GEM":
                return "恼鬼宝石";
            case "STAR_DUST":
                return "星尘";
            case "GHOSTLY_ESSENCE":
                return "幽灵精华";
            case "TESSERACTING_MATERIAL":
                return "光学材料";

            // LiteXpansion
            case "RUBBER":
                return "橡胶";
            case "REFINED_IRON":
                return "精炼铁";
            case "MIXED_METAL":
                return "合金";
            case "ADVANCED_ALLOY":
                return "高级合金";
            case "THORIUM":
                return "钍";
            case "MAG_THOR":
                return "镁钍合金";
            case "CARBON_MESH":
                return "粗制碳板";
            case "SCRAP":
                return "废料";
            case "IRIDIUM":
                return "铱";

            // Other
            default:
                return ThemeUtils.toTitleCase(type);
        }
    }

    public static String getToolName(String type){
        switch(type.toUpperCase()){
            case "PICK":
                return "镐";
            case "SHOVEL":
                return "铲";
            case "AXE":
                return "斧";
            case "SWORD":
                return "剑";
            case "HOE":
                return "锄";
            default:
                return ThemeUtils.toTitleCase(type);
        }
    }

    public static String getToolHead(String type){
        switch(type.toUpperCase()){
            case "PICK":
                return "镐头";
            case "SHOVEL":
                return "铲头";
            case "AXE":
                return "斧刃";
            case "SWORD":
                return "剑刃";
            case "HOE":
                return "锄头";
            default:
                return ThemeUtils.toTitleCase(type);
        }
    }

    public static String getArmorPart(String part) {
        switch(part.toUpperCase()){
            case "HELMET":
                return "头盔";
            case "CHESTPLATE":
                return "胸甲";
            case "LEGGINGS":
                return "护腿";
            case "BOOTS":
                return "靴子";
            default:
                return ThemeUtils.toTitleCase(part);
        }
    }

    public static String getToolOrArmorName(String type){
        String toolName = getToolName(type);
        return toolName.equals(ThemeUtils.toTitleCase(type)) ? getArmorPart(type) : toolName;
    }
}
