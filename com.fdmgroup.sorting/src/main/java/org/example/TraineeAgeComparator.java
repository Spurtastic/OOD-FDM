package org.example;

import java.util.Comparator;

public class TraineeAgeComparator implements Comparator<Trainee> {
    @Override
    public int compare(Trainee o1, Trainee o2) {
        return o1.getAge() - o2.getAge();
    }
}
