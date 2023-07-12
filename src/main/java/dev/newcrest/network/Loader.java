package dev.newcrest.network;

import dev.waterdog.waterdogpe.plugin.Plugin;
import dev.waterdog.waterdogpe.utils.config.Configuration;

public class Loader extends Plugin {

    public static Configuration cfg;

    @Override
    public void onEnable() {
        EventListener.init(this);
        saveResource("config.yml");
        cfg = getConfig();
    }
	
}
