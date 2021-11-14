package com.company;

import java.util.Comparator;

public class StudentsSurnameComparator implements Comparator<Students> {
          public int compare(Students a, Students b){
        return a.FirstName.compareTo(b.FirstName); }
}
