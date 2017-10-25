package StenboegJohan;
/*
Program function:
Making a system with different classes and different methods to show what i've learn since i started.
Author: Johan Stenbøg
Reason: Test during education.
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
    public Studerende(String name){ /*For man kan oprette et nyt objekt, skal det have et navn. Det er altså en construktor der har en betingelse.
        At de har et navn giver god mening, så der ikke bliver oprettet i dette tilfælde studerende uden navn.
        Var der ikke en betingelse hedder det en no-args constructor. */
        this.name = name; //Refererer til sig selv, bare så der ikke står name = name.
        System.out.println("New student added named: " + name);
    }

    //Opretter en constructor2, der behøver et navn og en alder for at oprette et object.
    public Studerende(String name, int age){ //her er der 2 betingelser for at objektet kan blive oprettet. Navn og alder.
        this.name = name;
        this.age = age;
        System.out.println("New student added named: " + name + " and age: " + age);
    }

    //Opretter en constructor3, der behøver et navn og en øjenfarve for at oprette et object.
    public Studerende(String name, String eyeColor){ //Øjenfarven er normalt lige meget i forhold til oprettelse af en student, her er det bare for et eksempel til en anden constructor.
        this.name = name;
        this.eyeColor = eyeColor;
        System.out.println("New student added named: " + name + " with eyecolor: " + gender);
    }

    public Studerende(String name, int age, String gender, String eyeColor, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.height = height;
        System.out.println("New student added named: " + name + " aged: " + age + " with eyecolor: " + eyeColor + " and with height: " + height + ". " + gender );
    }

    //Opretter en getter funktion så man kan hente navnet.
    public String getName(){return name;} //Da alle variablerne er private, så skal den her når der bliver kaldt på getName, retunere name fra variablen.

    //OPrettter getters og setters.
    public void setAge(int age){this.age = age;} //En metode til at give oprettede objekter en alder.
    public int getAge(){return age;} //Her kan man hente deres alder og printe det.


    public void setGender(String gender){this.gender = gender;}
    public String getGender(){return gender;}


    public void setEyeColor(String eyeColor){this.eyeColor = eyeColor;}
    public String getEyeColor(){return eyeColor;}


    public void setHeight(double height){this.height = height;}
    public double getHeight(){return height;}
}
