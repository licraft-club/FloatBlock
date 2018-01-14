package com.licrafter.floatblocks.config;

import com.licraft.apt.config.ConfigBean;
import com.licraft.apt.config.ConfigValue;

/**
 * Created by shell on 2018/1/14.
 * <p>
 * Github: https://github.com/shellljx
 */
public class LanguageConfig {

    @ConfigBean
    public String configPath;

    @ConfigValue(path = "Language.name")
    public String name;
}
