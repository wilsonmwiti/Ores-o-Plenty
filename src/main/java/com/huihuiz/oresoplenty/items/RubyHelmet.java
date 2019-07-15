package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class RubyHelmet extends ArmorItem {

    public RubyHelmet() {
        super(OresOPlenty.setup.armor_RUBY, EquipmentSlotType.HEAD, new Item.Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("oresoplenty","rubyhelmet");
    }
}
