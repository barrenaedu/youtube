package lan.spring_ai.mcp_server.stdio.providers.hackernews;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import lan.spring_ai.mcp_server.stdio.domain.News;
import lan.spring_ai.mcp_server.stdio.providers.NewsProvider;
import lan.spring_ai.mcp_server.stdio.providers.hackernews.HackerNewsDomain.Story;

@Component
public class HackerNewsProviderImpl implements NewsProvider{
	private static final String BASE_URL = "https://hacker-news.firebaseio.com/v0/";
	private final RestClient restClient;
	
	public HackerNewsProviderImpl(RestClient.Builder builder) {
		this.restClient = builder
				.baseUrl(BASE_URL)
				.defaultHeader("Accept", "application/json")
				.build();
	}
	
	@Override
	public List<News> getTopNewsStories(int limit) {
		// Get list of best story IDs
		List<Long> ids = restClient.get()
				.uri("beststories.json")
				.retrieve()
				.body(new ParameterizedTypeReference<List<Long>>() {});
		// If no stories, return empty list
		if (ids == null) {
			return List.of();
		}
		// Get details for each story
		return ids.parallelStream().limit(limit)
				// Get details
				.map(id -> restClient
						.get()
						.uri("item/{id}.json", id)
						.retrieve()
						.body(Story.class))
				// Extract interesting fields
				.map(story -> new News(
						story.id(), 
						story.title(), 
						story.url(), 
						story.time()))
				// Sort by time in ascending order
				.sorted((s1, s2) -> Long.compare(s1.time(), s2.time()))
				.toList();
	}
	
}
