package javaCode;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Main {

    public static void uniqueList(List<Integer> numList) {

        List<Integer> uniqueList = numList.stream().distinct().toList();

        System.out.println("Unique List: " + uniqueList);
    }

    public static void mapList(List<String> strList) {

        List<String> mappedList = strList.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("Capitalized List: " + mappedList);
    }

    public static void flatMapList(List<List<String>> numList2) {

        List<String> flatMapList = numList2.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println("Flat Map List: " + flatMapList);
    }

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 4, 5, 6);

        // uniqueList(numList);

        List<String> strList = Arrays.asList("John", "Doe", "Mark");

        // mapList(strList);

        List<List<String>> numList2 = Arrays.asList(
                Arrays.asList("1", "2", "3"),
                Arrays.asList("4", "5", "6"),
                Arrays.asList("7", "8", "9"));

        flatMapList(numList2);

    }
}