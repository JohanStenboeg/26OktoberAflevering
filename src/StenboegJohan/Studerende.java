package StenboegJohan;
/*
Program funtion:
Making a system with different classes and different methods to show what i've learn since i started.
Author: Johan Stenbøg
Reason: Homework during education.
Due date: 26/10 2017
Country: Denmark
 */

public class Studerende {

    //Deklarerer variablen navn for de studerende.
    private String name = "";

    //Deklarer variablen alder for de studerende.
    private int age = 0;

    //Deklarer variablen køn for de studerende.
    private String gender = "";

    //Deklarer variablen øjenfarve for de studerende.
    private String eyeColor = "";

    //Deklarer variablen højde for de studerende.
    private double height = 0.0;

    //Opretter en constructor1, der kun behøver et navn for at oprette et object.
    public Studerende(String name){
        this.name = name;
        System.out.println("New student added named: " + name);
    }

    //Opretter en constructor2, der behøver et navn og en alder for at oprette et object.
    public Studerende(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("New student added named: " + name + " and age: " + age);
    }

    //Opretter en constructor3, der behøver et navn og et køn for at oprette et object.
    public Studerende(String name, String gender){
        this.name = name;
        this.gender = gender;
        System.out.println("New student added named: " + name + " and it is a " + gender);
    }

    //Opretter en getter funktion så man kan hente navnet.

    public String getName(){return name;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}


    public void setGender(String gender){this.gender = gender;}
    public String getGender(){return gender;}


    public void setEyeColor(String eyeColor){this.eyeColor = eyeColor;}
    public String getEyeColor(){return eyeColor;}


    public void setHeight(double height){this.height = height;}
    public double getHeight(){return height;}













}
