package com.corso.secondoEsercizio;

public class Sculture extends Artwork{
    private double altezza,larghezza,profondità;


    /**
     *
     * @param artista
     * @param altezza
     * @param larghezza
     * @param profondità
     */
    public Sculture(String artista, double altezza, double larghezza, double profondità) {
        super(artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondità = profondità;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getProfondità() {
        return profondità;
    }

    public void setProfondità(double profondità) {
        this.profondità = profondità;
    }

    @Override
    public String toString() {
        return "Sculture date: "+ this.getArtista()+", con "+this.altezza+"di altezza, "+
                this.larghezza+"  di larghezza e "+ this.profondità+" di profondità";
    }


    //metodo astratto implementazione
    @Override
    public double printiEncumbrance() {
        return this.altezza*this.larghezza*this.profondità;
    }
}