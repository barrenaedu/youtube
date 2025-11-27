package lan.spring_ai.tool_calling.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lan.spring_ai.tool_calling.domain.News;
import lan.spring_ai.tool_calling.providers.NewsProvider;
import lan.spring_ai.tool_calling.services.NewsService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NewsServiceImpl implements NewsService {
	private final NewsProvider newsProvider;
	
	@Override
	public List<News> getTopStories(int limit) {
		return newsProvider.getTopStories(limit);
	}
	
}
