package com.company;

import java.util.Comparator;

public class StudentsAgeComparator implements Comparator<Students> {
    public int compare(Students a, Students b){

        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}
