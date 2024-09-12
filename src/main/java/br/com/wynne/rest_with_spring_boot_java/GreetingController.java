package br.com.wynne.rest_with_spring_boot_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";
    private static AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam (value = "name", defaultValue = "World") String name){

        return new Greeting(TEMPLATE.formatted(name),counter.incrementAndGet());
    }
}
