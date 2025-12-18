package lan.spring_ai.mcp_server.stdio.providers;

import java.util.List;

import lan.spring_ai.mcp_server.stdio.domain.News;

public interface NewsProvider {

	List<News> getTopNewsStories(int limit);
	
}
