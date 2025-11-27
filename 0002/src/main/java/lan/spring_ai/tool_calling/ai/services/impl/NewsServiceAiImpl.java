package lan.spring_ai.tool_calling.ai.services.impl;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;

import lan.spring_ai.tool_calling.ai.providers.NewsProviderAi;
import lan.spring_ai.tool_calling.ai.services.NewsServiceAi;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class NewsServiceAiImpl implements NewsServiceAi {
	private final NewsProviderAi newsProviderAi;

	@Override
	public Publisher<String> prompt(String message) {
		return newsProviderAi.prompt(message);
	}
	
}
