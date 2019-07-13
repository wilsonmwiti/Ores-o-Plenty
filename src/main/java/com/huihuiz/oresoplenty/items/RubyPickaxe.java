package com.huihuiz.oresoplenty.items;

import com.huihuiz.oresoplenty.OresOPlenty;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class RubyPickaxe extends Item {

    public RubyPickaxe(){
        super(new Item.Properties()
                .maxStackSize(1)
                .addToolType(ToolType.PICKAXE, 3)
                .group(OresOPlenty.setup.itemGroup));
        setRegistryName("rubypickaxe");
    }
}
