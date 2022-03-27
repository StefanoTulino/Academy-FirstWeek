package com.corso.secondoEsercizio;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionClass {

    private String nome;
    private ArrayList<Artwork> arrayList= new ArrayList<>();


    public CollectionClass(String nome, ArrayList<Artwork> arrayList) {
        this.nome = nome;
        this.arrayList = arrayList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Artwork> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Artwork> arrayList) {
        this.arrayList = arrayList;
    }

    //Metodi aggiuntivi
    public void addOpera(Artwork a){
        arrayList.add(a);
    }

    public void print(ArrayList<Artwork> arrayList){
        for(int i=0;i<arrayList.size();i++){
            System.out.println("Opera n. "+i+"  "+ arrayList.get(i));
        }
    }

    public String printOccupazione(Artwork a) {
        if(a instanceof Square)
            return ((Square)a).toString()+"con totale:"+((Square)a).printiEncumbrance();
        else if(a instanceof Sculture)
            return ((Sculture)a).toString()+" con totale:"+((Sculture)a).printiEncumbrance();

        else return null;
    }

}
