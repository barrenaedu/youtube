# Video 0002 - Spring AI [ChatClient & Tool Calling]
Example of Spring AI [ChatClient & Tool Calling]

## Call application
```shell
$ curl -X GET 'http://localhost:5000/news?limit=10'

$ curl -X POST http://localhost:5000/news/ai \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 6 top new stories'

$ curl -X POST http://localhost:5000/news/ai \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 10 top new stories and order them by time in an ASCENDING order'

$ curl -X POST http://localhost:5000/news/ai \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 10 top new stories and order them by time in an DESCENDING order'

$ curl -X POST http://localhost:5000/news/ai \
  -H "Content-Type: text/plain" \
  -d 'Get all the information of the first 6 top new stories, filter out those that do not contain the word Claude'
```

## References
- Spring AI (ChatClient): https://docs.spring.io/spring-ai/reference/api/chatclient.html
- Spring AI (Tool Calling): https://docs.spring.io/spring-ai/reference/api/tools.html
- Spring Framework: https://spring.io/projects/spring-framework
- Hacker News: https://github.com/HackerNews/API
