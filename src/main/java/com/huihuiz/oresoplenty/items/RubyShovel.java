package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class RubyShovel extends ShovelItem {
    public RubyShovel(){
        super(OresOPlenty.setup.tool_RUBY, 1.5F, -3F, new Item.Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("oresoplenty","rubyshovel");
    }
}
