package pl.bykowski.springwebfluxexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class SpringWebfluxExampleApplicationTests {

    @Test
    void contextLoads() {

        Flux.just("Joeann", "Trudie", "Brandie", "Sofie", "Valaree", "Kennie", "Arabella", "Nisse", "Glory", "Robinett", "Elsie", "Kelbee", "Lianne", "Johan")
                .filter(name -> name.startsWith("J"))
                .subscribe(System.out::println);
//
//
//        Mono.just()


    }

}
