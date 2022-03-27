package com.corso.terzoEsercizio;

import java.util.ArrayList;

public class TestFinal {

    public static void main(String[] args) throws DuplicateException {
        ArrayList<Paziente> array = new ArrayList<>();
        ArrayList<Medico> arrayM = new ArrayList<>();

        AziendaSanitaria a=new AziendaSanitaria(array,arrayM);
        a.addPaziente(new Paziente(123,new Medico("Pluto1")));
        a.addPaziente(new Paziente(346,new Medico("Pluto2")));
        a.addPaziente(new Paziente(680,new Medico("Pluto2")));
        a.addPaziente(new Paziente(105,new Medico("Pluto3")));
        a.addPaziente(new Paziente(107,new Medico("Pluto3")));
        a.addPaziente(new Paziente(108,new Medico("Pluto3")));

        //PER LANCIARE ECCEZIONE
        //a.addPaziente(new Paziente(105,new Medico("Pluto1")));

        for(int i=0;i<a.getArrayList().size();i++){
            System.out.println("Stampa array paziente :" + a.getArrayList().get(i).toString() );
        }

        ArrayList<Paziente>result= a.listaMedico("Pluto2");
        for(int j=0;j<result.size();j++){
            System.out.println("Lista dei pazienti di un Medico: "+ result.get(j));
        }

        a.copyM();
        //Ultimo metodo di Azienda Sanitaria non implementato --> statMedico

        //Duplicati inseriti e poi rimossi, non sono riuscito ad evitare di inserirli
    }
}
