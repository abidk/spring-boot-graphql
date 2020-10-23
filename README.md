# Spring boot + Graphql example
This is an example project to showcase graphql running with spring boot.

## Running the app

1. `./gradlew clean bootRun`
1. You can then execute:
```
curl \
    -X POST \
    -H "Content-Type: application/json" \
    --data '{ "query": "{ user(id: 1) { id, name } }" }' \
    http://localhost:8080/graphql
```