package com.kafka.schooling.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "schooling",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received : " + data + " 😘");
    }
}
