package lan.spring_ai.tool_calling.ai.providers;

import org.reactivestreams.Publisher;

public interface NewsProviderAi {

	Publisher<String> prompt(String message);
	
}
