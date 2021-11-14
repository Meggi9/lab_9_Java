package com.company;

import java.util.Comparator;

public class StudentsScoreComparator implements Comparator<Students> {
    public int compare(Students a, Students b){

        if(a.getScore()> b.getScore())
            return 1;
        else if(a.getScore()< b.getScore())
            return -1;
        else
            return 0;
    }
}
