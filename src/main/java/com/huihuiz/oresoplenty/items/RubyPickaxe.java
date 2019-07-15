package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe(){
        super(OresOPlenty.setup.tool_RUBY, 1, -2.8F, new Item.Properties()
                .maxStackSize(1)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("oresoplenty","rubypickaxe");
    }
}