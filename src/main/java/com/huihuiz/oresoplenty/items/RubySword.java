package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class RubySword extends SwordItem {

    public RubySword(){
        super(OresOPlenty.setup.tier_RUBY, 3, -2.4F, new Item.Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("rubysword");
    }
}
