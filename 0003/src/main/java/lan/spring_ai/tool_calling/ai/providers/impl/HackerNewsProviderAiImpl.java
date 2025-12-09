package lan.spring_ai.tool_calling.ai.providers.impl;

import java.util.List;

import org.reactivestreams.Publisher;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

import lan.spring_ai.tool_calling.ai.providers.NewsProviderAi;
import lan.spring_ai.tool_calling.domain.News;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class HackerNewsProviderAiImpl implements NewsProviderAi {
	private final HackerNewsTools hackerNewsTools;
	private final ChatClient chatClient;
	
	@Override
	public Publisher<String> prompt(String message) {
		return chatClient
				.prompt()
				.user(message)
				.tools(hackerNewsTools)
				.stream() 
				.content();
	}
	
	@Override
	public List<News> promptStructured(String message) {
		return chatClient
		        .prompt()
				.user(message)
		        .tools(hackerNewsTools)
		        .call()
		        .entity(new ParameterizedTypeReference<List<News>>() {});
	}
	
}
