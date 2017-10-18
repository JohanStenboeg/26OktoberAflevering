package StenboegJohan;
/*
Program funtion:
        Displaying what i've learned during the last months.
        Author: Johan Stenbøg
        Reason: Homework during education.
        Due date: 26/10 2017
        Country: Denmark
        */



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random; //importere Random klassen.
import java.util.Scanner; //Importere Scanner klassen.

public class MineMetoder {

    /*public int getAlcholBuyStatus(){ //Opretter en metode.
        double aBS = getAge(); //Deklarerer at aBS er den samme værdi som getAge, så den tager den værdi og regner ud fra.
        if (aBS < 18) //Sætter et if statement op.
            return "Person too young to buy alcohol"; //Hvis tallet den får fra getAge er under 18, skriver den denne linje.
        else //sætter et else up. Da man kun kan være under eller over 18 år.
            return "Person is old enough to buy alcohol";
        //Hvis personen er eller over 18, så skriver den denne linje ud.
    }*/
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }



}
