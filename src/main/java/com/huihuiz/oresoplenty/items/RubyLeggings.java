package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class RubyLeggings extends ArmorItem {

    public RubyLeggings() {
        super(OresOPlenty.setup.armor_RUBY, EquipmentSlotType.LEGS, new Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("oresoplenty","rubyleggings");
    }
}
