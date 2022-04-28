
package se.Lexicon.CollectionGeneric;

import java.util.ArrayList;
import java.util.List;

public class CollectionExercise3 {
    public static void main(String[] args) {
        List<String> weekdays=new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        System.out.println(weekdays);
        weekdays.add(3,"Thursday");
        System.out.println(weekdays);

    }
}
