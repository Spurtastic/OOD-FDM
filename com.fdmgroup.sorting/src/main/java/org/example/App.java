package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collection.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Trainee tr1 = new Trainee(1, "John", 20, 3.5);
        Trainee tr2 = new Trainee(2, "Mary", 21, 3.6);
        Trainee tr3 = new Trainee(3, "Peter", 22, 3.7);
        Trainee tr4 = new Trainee(4, "Paul", 23, 3.8);
        Trainee tr5 = new Trainee(5, "Jane", 24, 3.9);
        ArrayList<Trainee> trainees = new ArrayList<Trainee>();

        trainees.add(tr1);
        trainees.add(tr3);
        trainees.add(tr5);
        trainees.add(tr2);
        trainees.add(tr4);

        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName() + "is " + trainee.getAge() + " years old.");

        }

        System.out.println(" ");

        TraineeAgeComparator tac = new TraineeAgeComparator();
        Collections.sort(trainees, tac);

        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName() + "is " + trainee.getAge() + " years old.");

        }

    }
}
