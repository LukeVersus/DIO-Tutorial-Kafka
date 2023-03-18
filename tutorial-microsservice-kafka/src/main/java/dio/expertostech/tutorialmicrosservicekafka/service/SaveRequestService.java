package dio.expertostech.tutorialmicrosservicekafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dio.expertostech.tutorialmicrosservicekafka.data.RequestData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaveRequestService {

    @KafkaListener(topics = "SaveRequest", groupId = "MicrosserviceSaveRequest")
    private void execute(ConsumerRecord<String, String> record) {
        log.info("Key = {}", record.key());
        log.info("Headers = {}", record.headers());
        log.info("Partition = {}", record.partition());

        String data = record.value();

        ObjectMapper mapper = new ObjectMapper();
        RequestData request = null;

        try {
            request = mapper.readValue(data, RequestData.class);
        } catch (JsonProcessingException e) {
            log.error("Mapper error. Data = {}", data, e);
            return;
        };

        log.info("Data received. {}", request);

    }

}
