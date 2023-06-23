package com.pt.vx.config;


/**
 * 天气相关配置
 */
public class WeatherConfig {
    /**
     * 天气相关的总开关
     * true则为开启，false则为关闭
     */
    public static boolean OPEN = true;

    /**
     * 天气资源的key
     */
    public static final String weatherSourceKey = "dc7d30dc8bec497d984f3747ac7ca3d1";

    /**
     * 天气资源类型
     * 0 为高德地图
     * 1 为和风天气
     */
    public static Integer weatherSourceType = 1;

    /**
     * 天气类型
     * 0 为实时天气
     * 1 为天气预报
     * 默认天气预报
     */
    public static Integer getWeatherType = 1;


}
