package lan.spring_ai.tool_calling.ai.services.impl;

import java.util.List;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;

import lan.spring_ai.tool_calling.ai.providers.NewsProviderAi;
import lan.spring_ai.tool_calling.ai.services.NewsServiceAi;
import lan.spring_ai.tool_calling.domain.News;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class NewsServiceAiImpl implements NewsServiceAi {
	private final NewsProviderAi newsProviderAi;

	@Override
	public Publisher<String> prompt(String message) {
		return newsProviderAi.prompt(message);
	}
	
	@Override
	public List<News> promptStructured(String message) {
		return newsProviderAi.promptStructured(message);
	}
	
}
