package lan.spring_ai.mcp_server.stdio.providers.hackernews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HackerNewsDomain {

	@JsonIgnoreProperties(ignoreUnknown = true)
	public record Story(
			@JsonProperty("id") long id,
			@JsonProperty("by") String by, 
			@JsonProperty("descendants") int descendants,
			@JsonProperty("kids") List<Long> kids,
			@JsonProperty("score") long score,
			@JsonProperty("time") long time,
			@JsonProperty("title") String title,
			@JsonProperty("type") String type,
			@JsonProperty("url") String url
			) {
	}

}
