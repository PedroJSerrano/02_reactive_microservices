package controller;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NamesController {

    public Flux<String> getNames() {

        List<String> names = List.of("One", "Two", "Three", "Four");

        return Flux.fromIterable(names);

    }
}
