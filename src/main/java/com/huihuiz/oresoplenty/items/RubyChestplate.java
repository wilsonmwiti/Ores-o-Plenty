package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class RubyChestplate extends ArmorItem {

    public RubyChestplate() {
        super(OresOPlenty.setup.armor_RUBY, EquipmentSlotType.CHEST, new Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("oresoplenty","rubychestplate");
    }
}
