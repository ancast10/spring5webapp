package guru.springframework.spring5webapp.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl  implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world property!";
    }
}
