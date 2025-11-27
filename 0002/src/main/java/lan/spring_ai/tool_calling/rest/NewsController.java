package lan.spring_ai.tool_calling.rest;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lan.spring_ai.tool_calling.domain.News;
import lan.spring_ai.tool_calling.services.NewsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@AllArgsConstructor
public class NewsController {
	private final NewsService newsService;

	@GetMapping("/news")
	public Publisher<News> chat(@RequestParam int limit) {
		Flux<News> flux = Mono
				.fromFuture(new CompletableFuture<List<News>>()
						.completeAsync(() -> newsService.getTopStories(limit)))
				.flatMapIterable(Function.identity()).log();
		log.info("Flux: {}", flux);
		return flux;
	}

}
