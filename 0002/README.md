# Video 0002 - Spring AI - ChatClient & Tool Calling
Example of Spring AI - ChatClient & Tool Calling


## OpenCode Zen
```shell
$ curl https://opencode.ai/zen/v1/chat/completions \
  -H "Authorization: Bearer $OPENCODE_ZEN_AI_API_KEY" \
  -H "Content-Type: application/json" \
  -d '{
    "model": "grok-code",
    "messages": [
      {
        "role": "user",
        "content": "Explain quantum computing in simple terms."
      }
    ],
    "temperature": 0.7,
    "max_tokens": 500
  }'
 
# LM Studio - Explain quantum computing
$ curl http://localhost:1234/v1/chat/completions \
  -H "Authorization: Bearer 12346" \
  -H "Content-Type: application/json" \
  -d '{
    "model": "gpt-oss-20b",
    "messages": [
      {
        "role": "user",
        "content": "Explain quantum computing in simple terms."
      }
    ],
    "temperature": 0.7,
    "max_tokens": 500
  }'  

# Hello
$ curl -X POST http://localhost:1234/v1/chat/completions \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer dummy" \
  -d '{
    "model": "gpt-oss-20b",
    "messages": [{"role": "user", "content": "hello"}],
    "temperature": 0.7,
    "stream": false,
    "max_tokens": 1024
  }'
```


## Call application
```shell
$ curl -X POST http://localhost:5000/news/ai \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 10 top new stories'

$ curl -X POST http://localhost:5000/news/ai/structured \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 10 top new stories and order them by time in an ASCENDING order'

$ curl -X POST http://localhost:5000/news/ai/structured \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 10 top new stories and order them by time in an DESCENDING order'

$ curl -X POST http://localhost:5000/news/ai/structured \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 10 top news stories. Filter out those that do not contain the word Microsoft, and exclude field url in the response'
```


## References
- https://github.com/HackerNews/API
- https://hacker-news.firebaseio.com/v0/beststories.json
- https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty
- https://hacker-news.firebaseio.com/v0/item/8863.json?print=pretty

