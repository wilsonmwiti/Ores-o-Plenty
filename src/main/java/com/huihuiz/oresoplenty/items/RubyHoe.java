package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class RubyHoe extends HoeItem {
    public RubyHoe() {
        super(OresOPlenty.setup.tier_RUBY, -0.5F, new Item.Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("rubyhoe");
    }
}
