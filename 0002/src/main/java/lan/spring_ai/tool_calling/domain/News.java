package lan.spring_ai.tool_calling.domain;

import lombok.Builder;

@Builder
public record News (long id, String title, String url, long time) {

}
