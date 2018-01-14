package com.licrafter.floatblocks.config;

import com.licraft.apt.config.ConfigBean;
import com.licraft.apt.config.ConfigSection;
import com.licraft.apt.config.ConfigValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shell on 2018/1/14.
 * <p>
 * Github: https://github.com/shellljx
 */
@ConfigBean(file = "config.yml")
public class DefaultConfig {

    @ConfigValue(path = "settings.language")
    public String language;
    @ConfigSection(path = "settings.floatItems")
    public List<FloatItem> floatItems = new ArrayList<>();

    public static class FloatItem {
        @ConfigValue(path = "lores")
        public List<String> lores;
        @ConfigValue(path = "location.x")
        public int x;
        @ConfigValue(path = "location.y")
        public int y;
        @ConfigValue(path = "location.z")
        public int z;
        @ConfigValue(valueKey = true)
        public String key;
    }
}