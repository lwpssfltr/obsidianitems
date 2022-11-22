package net.lpf.obsidiancraft.proxy;

import net.lpf.obsidiancraft.init.ObsidianItems;

public class Proxy {

    public void preInit() {
        ObsidianItems.init();
        ObsidianItems.register();
    }

    public void init() {
        ObsidianItems.registerSmelting();
        ObsidianItems.registerRecipies();
    }
}
