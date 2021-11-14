package com.company;

public class Students {

    public String FirstName;
    public String LastName;
    public float Score;
    public int Age;

    public  Students(String FirstName, String LastName)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public Students(String FirstName, String LastName, int Age, float Score)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Score = Score;
    }
    public  String getFirstName(){return FirstName + " "+LastName;}
    public int getAge(){return Age;}
    public float getScore(){return Score;}
}
