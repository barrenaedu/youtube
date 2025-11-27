package lan.spring_ai.tool_calling.ai.providers.impl;

import java.util.List;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import lan.spring_ai.tool_calling.domain.News;
import lan.spring_ai.tool_calling.providers.hackernews.HackerNewsProviderImpl;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class HackerNewsTools {
	private final HackerNewsProviderImpl hackerNewsService;
	
	@Tool(description = "Get the top numbers of news stories")
	public List<News> getTopStories(int limit) {
		return hackerNewsService.getTopStories(limit);
	}
	
	@Tool(description = "Get the top numbers of old stories")
	public List<News> getTopOldStories(int limit) {
		return List.of(
			new News(1l, "Title 1", "http://example.com/1", 0l),
			new News(2l, "Title 2", "http://example.com/2", 0l)
		);
	}
	
}
