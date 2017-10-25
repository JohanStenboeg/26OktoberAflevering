package StenboegJohan;
/*
Program funtion:
        Making a system with different classes and different methods to show what i've learn since i started.
        Author: Johan Stenbøg
        Reason: Homework during education.
        Due date: 26/10 2017
        Country: Denmark
        */


public class DatHoldet {
    //Her oprettes objekterne, der bliver oprettet ud fra de 3 forskellige constructorere, der er lavet i Studerende.java klassen.
    //Her kunne man tilføje alle på hele årgangen, men har valgt kun at tilføje 3.

    //Opretter et objekt ud fra constructor1.
    Studerende johan = new Studerende("Johan");

    //Opretter et objekt ud fra constructor2.
    Studerende lisa = new Studerende("Lisa", "Green");

    //Opretter et objekt ud fra constructor3.
    Studerende mikkel = new Studerende("Mikkel", 18);

    //Opretter et objekt ud fra constructor4.
    Studerende lasse = new Studerende("Lasse", 27, "Male", "Blue", 175);

}