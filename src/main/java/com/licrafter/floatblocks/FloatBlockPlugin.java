package com.licrafter.floatblocks;

import com.licraft.apt.PluginAnnotations;
import com.licrafter.floatblocks.config.DefaultConfig;
import com.licrafter.floatblocks.config.LanguageConfig;
import com.licrafter.lib.config.LicraftConfigUtils;
import com.licrafter.lib.log.LicraftLog;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shell on 2017/11/29.
 * <p>
 * Github: https://github.com/shellljx
 */
public class FloatBlockPlugin extends JavaPlugin {

    public DefaultConfig configManager = new DefaultConfig();
    public LanguageConfig languageConfig = new LanguageConfig();
    public Set<String> validLanguages = new HashSet<>(Arrays.asList("zh", "en"));
    public Set<String> validConfigFiles = new HashSet<>(Arrays.asList("config.yml", "data.yml"));

    @Override
    public void onEnable() {
        LicraftLog.printEnableInfo(this);
        for (String lang : validLanguages) {
            saveResource("languages" + File.separator + lang + ".yml", false);
        }
        for (String config : validConfigFiles) {
            LicraftConfigUtils.writeDefaultConfigFromJar(this, config);
        }
        PluginAnnotations.CONFIG.load(this, configManager);
        languageConfig.configPath = "languages" + File.separator + configManager.language + ".yml";
        PluginAnnotations.CONFIG.load(this, languageConfig);
        LicraftLog.consoleMessage(this, languageConfig.name);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        LicraftLog.printDisableInfo(this);
    }
}
