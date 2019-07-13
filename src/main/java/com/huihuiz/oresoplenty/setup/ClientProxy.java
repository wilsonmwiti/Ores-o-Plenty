package com.huihuiz.oresoplenty.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @Override
    public void init(){

    }

    public World getClientWorld(){
        return Minecraft.getInstance().world;
    }
}
