package StenboegJohan;
/*
Program funtion:
        Displaying what i've learned during the last months.
        Author: Johan Stenbøg
        Reason: Homework during education.
        Due date: 26/10 2017
        Country: Denmark
        */

import java.text.DateFormat; //importere DateFormat klassen.
import java.text.SimpleDateFormat; //importere simpleDateFormat klassen
import java.util.Date;  //Importere Date klassen
import java.util.Random; //importere Random klassen.
import java.util.Scanner; //Importere Scanner klassen.

public class MineMetoder {

    public void getRandomNumber() {//Opretter en metode
        Random rn = new Random(); //Laver et nyt objekt fra randomclassen.
        int answer = rn.nextInt(10 - 1 + 1) + 1; //Sætter randomfunktionen op, og sætter den til at tage værdier fra 1 og til 10.
        System.out.println("The random number between 1 and 10 is: " + answer); //Viser det tilfældigt genereret nummer.
    }
    public void getCommentFromUser() { //Opretter en metode
        Scanner scanner = new Scanner(System.in); //Opretter et nyt scanner objekt.
        System.out.println("Enter a comment and press enter when done."); //Printer en vejledende tekst til hvad man skal intaste.
        String comment = scanner.nextLine(); //Deklarerer comment, til at være scanner inputet.
        System.out.println("Usercomment: " + comment);//Udskriver vejledene tekst samt brugerinputet fra scanneren.
    }
    public void get5NUmbers() { //Opretter en ny metode.
        for (int i = 1; i < 6; i++) { //Opsætter et for loop. Så længe i er < 6, skal den lægge 1 til hver gang.
            System.out.println("Count is: " + i); //Printer resultatet ud.
        }
    }
    public void getCounterTo15() { //Laver en ny metode.
        int count = 1; //Sætter en startværdi.
        do { //Siger at systemet skal printe noget tekst samt værdien af "count" mens den lægger 1 til hver gang.
            System.out.println("Count is: " + count);
            count++;
        } while (count < 16); //Alt det skal den gøre mens værdien af count er < 16. Der kommer altså 15 tal.
    }
    public void getCurrentTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //Specificere hvordan datoen skal skrives op.
        Date date = new Date(); //Laver et objekt ud fra Date klassen og printer det ud.
        System.out.println(dateFormat.format(date));
    }
}
