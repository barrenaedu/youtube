package lan.spring_ai.tool_calling.providers;

import java.util.List;

import lan.spring_ai.tool_calling.domain.News;

public interface NewsProvider {

	List<News> getTopStories(int limit);
	
}
