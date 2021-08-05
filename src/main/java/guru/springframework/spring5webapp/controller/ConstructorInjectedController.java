package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService constructorGreetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService constructorGreetingService) {
        this.constructorGreetingService = constructorGreetingService;
    }

    public String getGreeting(){
        return constructorGreetingService.sayGreeting();
    }
}


