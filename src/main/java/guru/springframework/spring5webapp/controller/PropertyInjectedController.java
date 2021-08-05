package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService propertyGreetingService;

    public String getGreeting() {
        return propertyGreetingService.sayGreeting();
    }
}
