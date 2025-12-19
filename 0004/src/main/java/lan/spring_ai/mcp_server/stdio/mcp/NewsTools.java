package lan.spring_ai.mcp_server.stdio.mcp;

import java.util.List;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

import lan.spring_ai.mcp_server.stdio.domain.News;
import lan.spring_ai.mcp_server.stdio.providers.NewsProvider;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class NewsTools {
	private final NewsProvider provider;
	
	@McpTool(name = "get-top-news-stories", description = "Get the top news stories")
	public List<News> getTopNewsStories(@McpToolParam(description = "The number of stories to retrive") int limit) {
		return provider.getTopNewsStories(limit);
	}

}
