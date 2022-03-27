package com.corso.terzoEsercizio;

import java.util.ArrayList;

public class AziendaSanitaria {

    public ArrayList<Paziente> arrayList = new ArrayList<>();
    public ArrayList<Medico> arrayMedico = new ArrayList<>();

    public AziendaSanitaria(ArrayList<Paziente> arrayList, ArrayList<Medico> arrayMedico) {
        this.arrayList = arrayList;
        this.arrayMedico = arrayMedico;
    }

    public ArrayList<Paziente> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Paziente> arrayList) {
        this.arrayList = arrayList;
    }


    public ArrayList<Medico> getArrayMedico() {
        return arrayMedico;
    }

    public void setArrayMedico(ArrayList<Medico> arrayMedico) {
        this.arrayMedico = arrayMedico;
    }

    //METODI:
    public void addPaziente(Paziente p) throws DuplicateException {
        int rs= trovaPaziente(p.getNumeroTess());
        if(rs==0){
            arrayList.add(p);
        }
        if(rs==1)
            eliminaPaziente(p.getNumeroTess());

    }


    private int trovaPaziente(int numeroSearch)  {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getNumeroTess() == numeroSearch) {
                System.out.println("il paziente esiste ed è il paziente: " + arrayList.get(i).toString());
                return 1;
            }
        }
        return 0;
    }

    private void eliminaPaziente(int numeroSearch) throws DuplicateException {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getNumeroTess() == numeroSearch) {
                throw  new DuplicateException("il paziente con id verrà eliminato " + arrayList.get(i).getNumeroTess());
            }
        }
    }



    public void addMedico(Medico m) throws DuplicateException {

        int rs= trovaMedico(m.getNome());
        if(rs==0)
            arrayMedico.add(m);

        if(rs==1)
            eliminaMedico(m.getNome());
        }


    private int trovaMedico(String nome)  {
        for (int i = 0; i < arrayMedico.size(); i++) {
            if (arrayMedico.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println("il medico esiste ed è: " + arrayMedico.get(i).toString());
                return 1;
            }
        }
        return 0;
    }

    private void eliminaMedico(String nome) throws DuplicateException {
        for (int i = 0; i < arrayMedico.size(); i++) {
            if (arrayMedico.get(i).getNome().equalsIgnoreCase(nome)) {
                throw  new DuplicateException("i duplicati del medico con nome:  "+ arrayMedico.get(i).getNome()
                        + " verranno eliminati");
            }
        }
    }


    public ArrayList<Paziente> listaMedico(String nomeMedico) {
        ArrayList<Paziente> listPaziente = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getMedico().getNome().equalsIgnoreCase(nomeMedico))
                listPaziente.add(arrayList.get(i));
        }
        return listPaziente;
    }

    //non VA
    public Medico statMedico(ArrayList<Medico> m) {
        Medico rs = new Medico();
        return rs;
    }


    public void copyM() {
        Medico rs = new Medico();
        for (int i = 0; i < arrayList.size(); i++)
            arrayMedico.add(arrayList.get(i).getMedico());
        }

}