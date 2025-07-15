package controller;

import init.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest(classes = Application.class)
class ApplicationTests {

    @Autowired
    NamesController controller;

    @Test
    void testGetNames() {
        StepVerifier.create(controller.getNames())
                .expectNext("One")
                .expectNext("Two", "Three", "Four")
                .expectNext("Five", "Six")
                .expectNext("Seven", "Eight", "Nine")
                .expectNext("Ten")
                .expectNextCount(1)
                .verifyComplete();
    }

}
