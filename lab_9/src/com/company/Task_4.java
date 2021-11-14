package com.company;

import java.util.Comparator;
import java.util.TreeSet;

public class Task_4{
    public Task_4() {
        Comparator<Students> Studcomp = new StudentsSurnameComparator().thenComparing(new StudentsAgeComparator().thenComparing(new StudentsScoreComparator()));
        TreeSet<Students> stud = new TreeSet<>(Studcomp);
        stud.add(new Students("Иванов","Иван", 20, 4.45f));
        stud.add(new Students("Петров","Пётр",20, 4f));
        stud.add(new Students("Смолов","Максим", 19, 4.75f));
        stud.add(new Students("Ефремов","Сергей",19, 4.5f));
        stud.add(new Students("Вязов","Артём",18, 4.5f));
        stud.add(new Students("Сколов","Максим",21, 5.0f));
        stud.add(new Students("Возов","Анатолий",20, 3.75f));
        stud.add(new Students("Афонин", "Василий", 19, 4.0f));

        stud.add(new Students("Михайлов","Иван", 21, 4.45f));
        stud.add(new Students("Яшин","Пётр",20, 4f));
        stud.add(new Students("Михайлов","Максим", 19, 4.75f));
        stud.add(new Students("Кузнецов","Сергей",19, 4.5f));
        stud.add(new Students("Редискин","Артём",18, 4.5f));
        stud.add(new Students("Морковкин","Максим",21, 5.0f));
        stud.add(new Students("Морковкин","Анатолий",20, 5.0f));
        stud.add(new Students("Кузнецов", "Василий", 19, 4.0f));

        for(Students p : stud){
            System.out.println(p.getFirstName() + " "+ p.getAge() + " лет, ср. балл: "+p.getScore());
        }


    }
}
