package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.Item;

public class RubySword extends Item {

    public RubySword(){
        super(new Item.Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("rubysword");
    }
}
