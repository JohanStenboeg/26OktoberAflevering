package StenboegJohan;
/*
Program funtion:
        Making a system with different classes and different methods to show what i've learn since i started.
        Author: Johan Stenbøg
        Reason: Homework during education.
        Due date: 26/10 2017
        Country: Denmark
        */

import com.sun.org.apache.xpath.internal.SourceTree;

public class Start {
    public static void main(String[] args) {

        //Opretter et nyt object fra dataholdet.
        DatHoldet dat17 = new DatHoldet();
        MineMetoder metoder = new MineMetoder();

        //Så kan man hente objekterne fra de forskellige klasser.
        System.out.println("The students name is: " + dat17.johan.getName());

        //Henter setter metoden fra studerende klassen og sætter højden af et studerende objekt. Hvilket her er den studerende lisa.
        dat17.lisa.setHeight(162);
        dat17.lisa.setGender("Female"); //En sætter, der setter køn.
        System.out.println(dat17.lisa.getName() + "(" + dat17.lisa.getGender() + ") is " + dat17.lisa.getHeight() + " cm tall."); //Printer alle de værdier man har sat koblet til objektet.

        //Sætter nogle forskellige værdier til objektet Mikkel.
        dat17.mikkel.setEyeColor("Blue");
        dat17.mikkel.setAge(85);
        dat17.mikkel.setGender("Male");
        dat17.mikkel.setHeight(20);
        //Printer værdierne ud.
        System.out.println(dat17.mikkel.getName() + "(" + dat17.mikkel.getGender() + ") is " + dat17.mikkel.getHeight() + "cm tall. " + dat17.mikkel.getName() + " is " + dat17.mikkel.getAge() + " years old and has the eyecolor: " + dat17.mikkel.getEyeColor());

        //Displaying the 4th object, named Lasse.
        //There is no need for any setters as the object was created by the 4th constructor that requries all values before an object can be created.
        System.out.println(dat17.lasse.getName() + "(" + dat17.lasse.getGender() + ") is " + dat17.lasse.getHeight() + "cm tall. " + dat17.lasse.getName() + " is " + dat17.lasse.getAge() + " years old and has the eyecolor: " + dat17.lasse.getEyeColor());

        //Henter metoderne fra MineMetoder klassen.
        metoder.get5NUmbers();

        metoder.getCommentFromUser();

        metoder.getCounterTo15();

        metoder.getCurrentTime();

        metoder.getRandomNumber();
    }
}

