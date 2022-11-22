package net.lpf.obsidiancraft.proxy;

import net.lpf.obsidiancraft.init.ObsidianItems;

public class ClientProxy extends Proxy {

    @Override
    public void init() {
        ObsidianItems.registerRenders();
        super.init();
    }
}
