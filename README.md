# spring-boot-jaeger
Example - Jaeger Tracing with Spring Boot

Ramp up Jaeger:

```
docker-compose up -d
```

Run all services

send an example request to the main service:

```
# httpie
http :7001/api/compute
```

Open a browser and enter following url:

http://localhost:7004/
