package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class RubyAxe extends AxeItem {

    public RubyAxe() {
        super(OresOPlenty.setup.tier_RUBY, 5.5F, -3F, new Item.Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("rubyaxe");
    }
}