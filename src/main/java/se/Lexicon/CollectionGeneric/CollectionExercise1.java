package se.Lexicon.CollectionGeneric;

import java.util.ArrayList;
import java.util.List;

public class CollectionExercise1 {
    public static void main(String[] args) {
        List<String> numbers=new ArrayList<>();
        numbers.add("Monday");
        numbers.add("Tuesday");
        numbers.add("Wednesday");
        numbers.add("Thursday");
        numbers.add("Friday");
        numbers.add("Saturday");
        numbers.add("Sunday");
        System.out.println("####The days of the Week####"+ numbers);

    }
}
