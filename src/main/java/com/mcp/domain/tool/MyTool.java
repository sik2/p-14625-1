package com.mcp.domain.tool;

import org.springframework.ai.tool.annotation.Tool;

import java.util.Random;

public class MyTool {

    private final String[] weathers = {"Sunny", "Rainy", "Cloudy"};
    private final Random random = new Random();

    @Tool
    public String getWeather(String location) {
        return weathers[random.nextInt(weathers.length)];
    }
}
