package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.service.ConstructorGreetingServiceImpl;
import guru.springframework.spring5webapp.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.propertyGreetingService = new PropertyGreetingServiceImpl();
    }

    @Test
    public void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }

}