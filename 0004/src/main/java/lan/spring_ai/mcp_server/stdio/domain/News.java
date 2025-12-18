package lan.spring_ai.mcp_server.stdio.domain;

import lombok.Builder;

@Builder
public record News (long id, String title, String url, long time) {

}
