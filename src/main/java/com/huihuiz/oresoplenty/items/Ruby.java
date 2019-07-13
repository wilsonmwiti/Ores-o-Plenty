package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.Item;

public class Ruby extends Item {

    public Ruby(){
        super(new Item.Properties()
                .maxStackSize(64)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("ruby");
    }
}
