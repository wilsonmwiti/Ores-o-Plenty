package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class RubyBoots extends ArmorItem {

    public RubyBoots() {
        super(OresOPlenty.setup.armor_RUBY, EquipmentSlotType.FEET, new Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("oresoplenty","rubyboots");
    }
}
