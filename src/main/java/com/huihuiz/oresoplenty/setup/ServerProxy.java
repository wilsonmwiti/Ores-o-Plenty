package com.huihuiz.oresoplenty.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public void init(){

    }

    public World getClientWorld(){
        throw new IllegalStateException("Only run this on the client!");
    }

}
