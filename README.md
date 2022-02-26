### Event Driven Architecture with Kafka

- [x] Spring Boot
- [x] Kafka

![Spring Boot and Kafka](https://miro.medium.com/max/1400/1*8U--zxLQ3R6hQB67ZUhQnA.jpeg)

#### Installation Kafka

###### STEP 1: GET KAFKA

[Download](https://www.apache.org/dyn/closer.cgi?path=/kafka/3.1.0/kafka_2.13-3.1.0.tgz) the latest Kafka release and extract it:

```
$ tar -xzf kafka_2.13-3.1.0.tgz
$ cd kafka_2.13-3.1.0
```
###### STEP 2: START THE KAFKA ENVIRONMENT
```
# Start the ZooKeeper service
# Note: Soon, ZooKeeper will no longer be required by Apache Kafka.
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
Open another terminal session and run:
```
# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties
```

###### STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
So before you can write your first events, you must create a topic. Open another terminal session and run:
```
$ bin/kafka-topics.sh --create --topic schooling --bootstrap-server localhost:9092
```

###### STEP 4: READ THE EVENTS
Open another terminal session and run the console consumer client to read the events you just created:
```
$ bin/kafka-console-consumer.sh --topic schooling --from-beginning --bootstrap-server localhost:9092
```