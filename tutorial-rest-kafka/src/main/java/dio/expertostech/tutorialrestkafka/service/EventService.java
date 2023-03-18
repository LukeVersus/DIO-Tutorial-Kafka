package dio.expertostech.tutorialrestkafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final KafkaTemplate<Object, Object> template;

    public <T> void addEvent(String topic, T data) {
        template.send(topic, data);
    }

}
