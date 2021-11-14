package com.company;

import java.util.*;

public class Task_3 {
    public Task_3() {
        TreeMap<Float, Students> Studmap = new TreeMap<Float,Students>();

        Studmap.put(4.45f, new Students("Иванов","Иван"));
        Studmap.put(3.8f,new Students("Петров","Пётр"));
        Studmap.put(4.2f,new Students("Смолов","Максим"));
        Studmap.put(5.0f, new Students("Ефремов","Сергей"));
        Studmap.put(4.75f,new Students("Вязов","Артём"));
        Studmap.put(3.5f,new Students("Сколов","Максим"));
        Studmap.put(4.2f,new Students("Возов","Анатолий"));
        Studmap.put(3.0f,new Students("Егоров","Пётр"));
        Studmap.put(4.0f,new Students("Редискин","Максим"));
        Studmap.put(3.75f, new Students("Хромов","Сергей"));
        Studmap.put(3.2f,new Students("Королёв","Анатолий"));

        for(Map.Entry<Float, Students> item : Studmap.entrySet()){
            System.out.println(item.getValue().getFirstName() + " : "+item.getKey());
        }
    }
}