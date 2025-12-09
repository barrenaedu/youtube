package lan.spring_ai.tool_calling.ai.providers;

import java.util.List;

import org.reactivestreams.Publisher;

import lan.spring_ai.tool_calling.domain.News;

public interface NewsProviderAi {

	Publisher<String> prompt(String message);

	List<News> promptStructured(String message);
	
}
