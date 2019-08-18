Author- Sushree Swagatika Mishra

Project Name- POC of rabbitMQ running in docker. One spring boot producer and one spring boot consumer exchanging messages,both running in docker.

Description- 

1. Rabbit-Mq Producer
		spring-boot application for rabbit-mq producer to produce messages and pass it through exchange.AMQP template is used.

2. Rabbit-mq-Consumer
		spring-boot application for rabbit-mq consumer to consume messages sent by producer from queue which is binded to exchange 			through routing-key. AMQP template is used.





