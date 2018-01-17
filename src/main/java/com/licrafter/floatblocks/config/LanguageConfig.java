package com.licrafter.floatblocks.config;

import com.licraft.apt.config.ConfigBean;
import com.licraft.apt.config.ConfigSection;
import com.licraft.apt.config.ConfigValue;

import java.util.List;

/**
 * Created by shell on 2018/1/14.
 * <p>
 * Github: https://github.com/shellljx
 */
public class LanguageConfig {

    @ConfigBean
    public String configPath;

    @ConfigSection(path = "Language.commandPage")
    public List<CmdEntry> cmdEntries;


    public static class CmdEntry{
        @ConfigValue(path = "description")
        public String description;
        @ConfigValue(path = "info")
        public List<String> infos;
        @ConfigValue(path = "hover")
        public List<String> hovers;
        @ConfigValue(valueKey = true)
        public String valueKey;
    }
}
