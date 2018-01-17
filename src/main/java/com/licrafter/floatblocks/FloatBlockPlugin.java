package com.licrafter.floatblocks;

import com.licraft.apt.PluginAnnotations;
import com.licrafter.floatblocks.cmds.PlayerCmds;
import com.licrafter.floatblocks.config.DefaultConfig;
import com.licrafter.floatblocks.config.LanguageConfig;
import com.licrafter.floatblocks.listener.PlayerListener;
import com.licrafter.lib.config.LicraftConfigUtils;
import com.licrafter.lib.eco.EcoSetup;
import com.licrafter.lib.eco.EconomyInterface;
import com.licrafter.lib.log.LicraftLog;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shell on 2017/11/29.
 * <p>
 * Github: https://github.com/shellljx
 */
public class FloatBlockPlugin extends JavaPlugin {

    public DefaultConfig defaultConfig = new DefaultConfig();
    public LanguageConfig languageConfig = new LanguageConfig();
    public Set<String> validLanguages = new HashSet<>(Arrays.asList("zh", "en"));
    public Set<String> validConfigFiles = new HashSet<>(Arrays.asList("config.yml", "data.yml"));
    public EconomyInterface economy;

    @Override
    public void onEnable() {
        LicraftLog.printEnableInfo(this);
        for (String lang : validLanguages) {
            saveResource("languages" + File.separator + lang + ".yml", false);
        }
        for (String config : validConfigFiles) {
            LicraftConfigUtils.writeDefaultConfigFromJar(this, config);
        }
        PluginAnnotations.CONFIG.load(this, defaultConfig);
        languageConfig.configPath = "languages" + File.separator + defaultConfig.language + ".yml";
        PluginAnnotations.CONFIG.load(this, languageConfig);

        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new PlayerListener(this), this);
        getCommand("float").setExecutor(new PlayerCmds(this));
        getCommand("floatadmin").setExecutor(new PlayerCmds(this));

        economy = EcoSetup.onEnable(this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        LicraftLog.printDisableInfo(this);
    }
}
