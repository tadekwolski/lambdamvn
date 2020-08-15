package org.company.services;

import org.company.entity.Apple;
import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleServiceTest {

    static List<Apple> inventory;
    static List<Boolean> booleanList;
    static AppleService appleService;


    @BeforeAll
    static void init() {
        System.out.println("Setting up data...");
        inventory = Arrays.asList(
                new Apple(150, "green"),
                new Apple(200, "red"),
                new Apple(250, "yellow")
        );

        booleanList = Arrays.asList(
                Boolean.TRUE,
                Boolean.TRUE,
                Boolean.FALSE,
                Boolean.FALSE
        );
        appleService = new AppleService();
    }

    @org.junit.jupiter.api.Test
    void filterApples() {
        List<Apple> filtered = appleService.filterApples(inventory);
        filtered.sort((Comparator.comparing(Apple::getWeight)).reversed());
        assertEquals(filtered.size(),1);
    }

    @org.junit.jupiter.api.Test
    void testFilterApples() {
        List<Apple> filtered = appleService.filterApples(inventory,x -> x.getWeight() > 150);
        filtered.sort((Comparator.comparing(Apple::getWeight)).reversed());
        assertEquals(filtered.size(),2);
    }
}