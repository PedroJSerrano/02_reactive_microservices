package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@RestController
public class NamesController {

    @GetMapping(value = "/names")
    public Flux<String> getNames() {

        List<String> names = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        return Flux.fromIterable(names)
                .delayElements(Duration.ofMillis(500));
    }
}
