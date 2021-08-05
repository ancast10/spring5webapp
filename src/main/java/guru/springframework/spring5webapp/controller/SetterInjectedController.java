package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService setterGreetingService;

    @Qualifier("setterGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService setterGreetingService) {
        this.setterGreetingService = setterGreetingService;
    }

    public String getGreeting(){
        return setterGreetingService.sayGreeting();
    }
}
