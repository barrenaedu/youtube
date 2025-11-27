package lan.spring_ai.tool_calling.ai.providers.impl;

import org.reactivestreams.Publisher;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

import lan.spring_ai.tool_calling.ai.providers.NewsProviderAi;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class HackerNewsProviderAiImpl implements NewsProviderAi {
	private final HackerNewsTools hackerNewsTools;
	private final ChatClient chatClient;
	
	public Publisher<String> prompt(String message) {
		return chatClient
				.prompt()
				.user(message)
				.tools(hackerNewsTools)
				.stream() 
				.content();
	}
	
}
