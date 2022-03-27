package com.corso.secondoEsercizio;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<Artwork> array= new ArrayList<>();
        CollectionClass c=new CollectionClass("Collezione1",array);
        array.add((Square )new Square("PrimoSquare",33.50,25.10));
        array.add((Square )new Square("SecondoSquare",26.50,30.20));
        array.add((Sculture )new Sculture("PrimaSculture",33.50,25.10, 12.00));
        array.add((Sculture )new Sculture("SecondaSculture",33.50,25.10,14.10));

        //metodi di CollectionClass
        c.addOpera((Square )new Square("TerzoSquare",30.50,25.20));
        c.print(array);

        Scanner s=new Scanner(System.in);
        System.out.println("Seleziona un indice dalla lista di sopra per vedere lo spazio dioccupazione: ");
        int select= s.nextInt();
        Artwork a= array.get(select);
        System.out.println(c.printOccupazione(a));

    }
}
