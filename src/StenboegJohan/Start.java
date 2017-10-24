package StenboegJohan;
/*
Program funtion:
        Making a system with different classes and different methods to show what i've learn since i started.
        Author: Johan Stenbøg
        Reason: Homework during education.
        Due date: 26/10 2017
        Country: Denmark
        */

public class Start {
    public static void main(String[] args) {

        //Opretter et nyt object fra dataholdet.
        DatHoldet dat17 = new DatHoldet();
        MineMetoder metoder = new MineMetoder();

        //Så kan man hente objekterne fra de forskellige klasser.
        System.out.println("Den studerende hedder: " + dat17.johan.getName());

        //Henter setter metoden fra studerende klassen og sætter højden af et studerende objekt. Hvilket her er den studerende lisa.
        dat17.lisa.setHeight(162);
        dat17.lisa.setGender("Female"); //En sætter, der setter køn.
        System.out.println(dat17.lisa.getName() + "(" + dat17.lisa.getGender() + ") er " + dat17.lisa.getHeight() + " cm høj."); //Printer alle de værdier man har sat koblet til objektet.

        //Sætter nogle forskellige værdier til objektet Mikkel.
        dat17.mikkel.setEyeColor("Blå");
        dat17.mikkel.setAge(85);
        dat17.mikkel.setGender("Male");
        dat17.mikkel.setHeight(20);
        //Printer værdierne ud.
        System.out.println(dat17.mikkel.getName() + "(" + dat17.mikkel.getGender() + ") er " + dat17.mikkel.getHeight() + "cm høj. " + dat17.mikkel.getName() + " er " + dat17.mikkel.getAge() + " år gammel og har øjenfarven: " + dat17.mikkel.getEyeColor());

        //Henter metoderne fra MineMetoder klassen.
        metoder.get5NUmbers();

        metoder.getCommentFromUser();

        metoder.getCounterTo15();

        metoder.getCurrentTime();

        metoder.getRandomNumber();
    }
}

