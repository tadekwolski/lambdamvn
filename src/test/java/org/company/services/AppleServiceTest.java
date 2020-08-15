package org.company.services;

import org.company.entity.Apple;
import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleServiceTest {

    static List<Apple> inventory;
    static List<Boolean> booleanList;


    @BeforeAll
    static void init() {
        System.out.println("Setting up data...");
        inventory = Arrays.asList(
                new Apple(150, "green"),
                new Apple(200, "red"),
                new Apple(250, "yellow")
        );

        booleanList = Arrays.asList(
                new Boolean("true"),
                new Boolean("true"),
                new Boolean("false"),
                new Boolean("false")
        );
    }

    @org.junit.jupiter.api.Test
    void filterApples() {
    }

    @org.junit.jupiter.api.Test
    void testFilterApples() {
    }


    /*
     Main m = new Main();
        m.init();
        System.out.println("ello!");
        List<Apple> filtered = m.filterApples(inventory);
        System.out.println("Filtered>200 : " + filtered);
        filtered = m.filterApples(inventory, x -> x.getWeight() > 150);
        filtered.sort((Comparator.comparing(Apple::getWeight)).reversed());
        System.out.println("Filtered>150 " + filtered);
        System.out.println("Boolean distinct: "+booleanList.stream().distinct().count());
     */
}