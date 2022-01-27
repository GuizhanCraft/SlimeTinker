package io.github.sefiraat.slimetinker.items.componentmaterials.cmelements;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.componentmaterials.ComponentMaterial;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryMolten;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.Getter;
import net.guizhanss.minecraft.slimetinker.utils.LangUtils;
import org.bukkit.inventory.ItemStack;

@Getter
public class CMLiquid {

    private final String texture;
    private ComponentMaterial parent;
    private SlimefunItemStack itemStack;
    private SlimefunItem item;

    public CMLiquid(String texture) {
        this.texture = texture;
    }

    public void setupLiquid(ComponentMaterial parent) {
        this.parent = parent;
        String titName = LangUtils.getMaterialName(parent.getId());
        this.itemStack = ThemeUtils.themedItemStack(
            parent.getId() + "_LIQUID",
            texture,
            ThemeItemType.MOLTEN_METAL,
            "熔融" + titName,
            ThemeUtils.PASSIVE + "熔融态" + titName
        );

        this.item = new SlimefunItem(ItemGroups.MOLTEN_METALS, itemStack, DummySmelteryMolten.TYPE, new ItemStack[]{
            null, null, null,
            null, parent.getRepresentativeStack(), null,
            null, null, null
        });
        item.register(SlimeTinker.inst());
    }

}
