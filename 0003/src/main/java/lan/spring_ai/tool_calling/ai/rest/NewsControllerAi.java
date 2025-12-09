package lan.spring_ai.tool_calling.ai.rest;

import java.util.List;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lan.spring_ai.tool_calling.ai.services.NewsServiceAi;
import lan.spring_ai.tool_calling.domain.News;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
public class NewsControllerAi {
	private final NewsServiceAi newsServiceAi;

	@PostMapping(value = "/news/ai", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public Publisher<String> prompt(@RequestBody String message) {
		return newsServiceAi.prompt(message);
	}
	
	@PostMapping(value = "/news/ai/structured", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<News> promptStructured(@RequestBody String message) {
		return newsServiceAi.promptStructured(message);
	}
	
}
