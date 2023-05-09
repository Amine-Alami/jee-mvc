package com.hitema.jee.services;

import com.hitema.jee.entities.Country;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class CountryServiceImplTest {

    private static final Logger log = LoggerFactory.getLogger(CountryServiceImplTest.class);
    @Autowired
    private CountryService service;

    private static Country country;

    @BeforeAll
    static void beforeAll(){
        log.trace("<<<<<<<<<<Before All START>>>>>>>>>>");
        country = new Country();
        country.setCountry("Monaco");
        country.setLastUpdate(LocalDateTime.now());
        log.trace("<<<<<<<<<<Before All END  >>>>>>>>>>");
    }

    @BeforeEach
    void setUp() {
        log.trace("<<<<<<<<<<Before Each>>>>>>>>>>");
        assertNotNull(service, "ERROR Service Country NOT Injected !!!....");
    }

    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void readAll() {
        assertNotNull(country,"ERROR Country NOT Instancied !!!!!");
        service.readAll().forEach(c->log.trace("{}",c));
    }
}