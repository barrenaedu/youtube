package lan.spring_ai.tool_calling.services;

import java.util.List;

import lan.spring_ai.tool_calling.domain.News;

public interface NewsService {

	List<News> getTopStories(int limit);
	
}
