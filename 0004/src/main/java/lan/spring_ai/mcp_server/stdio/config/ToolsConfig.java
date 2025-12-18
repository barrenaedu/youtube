package lan.spring_ai.mcp_server.stdio.config;

import java.util.List;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lan.spring_ai.mcp_server.stdio.mcp.NewsTools;

@Configuration
public class ToolsConfig {

	@Bean
	public List<ToolCallback> getAvailableTools(NewsTools newsTools) {
		return List.of(ToolCallbacks.from(newsTools));
	}

}
