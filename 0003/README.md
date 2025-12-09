# Video 0003 - Spring AI & LM Studio
Example of how to configure a Java application to use a local LLM using the software LM Studio.


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

