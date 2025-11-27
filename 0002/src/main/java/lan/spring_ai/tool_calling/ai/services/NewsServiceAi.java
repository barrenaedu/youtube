package lan.spring_ai.tool_calling.ai.services;

import org.reactivestreams.Publisher;

public interface NewsServiceAi {

	Publisher<String> prompt(String message);

}
