package org.company.services;

import org.company.entity.Apple;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppleService {




    public List<Apple> filterApples(@NotNull List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        result.addAll(inventory.stream().filter(x -> x.getWeight() > 200).collect(Collectors.toList()));
        return result;
    }

    public List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        result.addAll(inventory.stream().filter(x -> p.test(x)).collect(Collectors.toList()));
        return result;
    }
}