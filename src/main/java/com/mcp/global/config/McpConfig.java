package com.mcp.global.config;

import com.mcp.domain.tool.MyTool;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpConfig {

    @Bean
    public ToolCallbackProvider myTools() {
        return MethodToolCallbackProvider.builder()
                .toolObjects(new MyTool())
                .build();
    }
}
