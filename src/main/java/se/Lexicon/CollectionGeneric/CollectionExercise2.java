package se.Lexicon.CollectionGeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise2 {
    public static void main(String[] args) {
        List<String> weekdays= new ArrayList<>();
        weekdays.add("*******The weekdays are*******");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        Iterator itr=weekdays.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
