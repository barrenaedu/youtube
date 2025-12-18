# Video 0004 - Local MCP Server with transport stdio using Spring AI
Example of how to build a Java application that acts as a MCP Server that uses transport stdio.

## MCP Inspector
```shell
$ mvn clean package
$ npx @modelcontextprotocol/inspector
# On the web interface
  1) Configure server
	command: java
	arguments: -jar './target/0004-spring-ai-mcp-server-stdio-0.0.1-SNAPSHOT.jar'
	> Press 'Connect' button
	
  2) Go to 'Tools' section and press button 'List Tools', select a tool and run it.
```

## OpenCode CLI
```shell
$ nano ./opencode.jsonc
  {
    "$schema": "https://opencode.ai/config.json",
    "mcp": {
      "get-top-news": {
        "type": "local",
        "command": ["java", "-jar", "/mnt/data/projects/YouTube/videos/20251209 - 0004 - MCP Server/java/target/0004-spring-ai-mcp-server-0.0.1-SNAPSHOT.jar"],
        "enabled": true
      },
    },
  }
$ opencode mcp list
$ opencode
	> Op 1) get the top 8 new stories
	> Op 2) use the get-top-news tool and get the top 8 new stories
 ```

## References

### Model Context Protocol
- https://modelcontextprotocol.io
- https://modelcontextprotocol.io/docs/tools/inspector

### OpenCode
- https://opencode.ai/docs/mcp-servers

### HackerNews
- https://github.com/HackerNews/API
- https://hacker-news.firebaseio.com/v0/beststories.json
- https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty
- https://hacker-news.firebaseio.com/v0/item/8863.json?print=pretty

