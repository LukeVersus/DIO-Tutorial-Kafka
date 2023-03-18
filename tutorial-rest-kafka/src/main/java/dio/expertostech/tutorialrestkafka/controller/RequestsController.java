package dio.expertostech.tutorialrestkafka.controller;


import dio.expertostech.tutorialrestkafka.data.RequestData;
import dio.expertostech.tutorialrestkafka.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RequestsController {

    private final EventService eventService;

    @PostMapping(path = "/api/save-request")
    public ResponseEntity<String> saveRequest(@RequestBody RequestData request) {
        eventService.addEvent("SaveRequest", request);
        return ResponseEntity.ok("Success!");
    }

}
