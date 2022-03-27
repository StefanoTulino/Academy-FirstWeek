package com.corso.secondoEsercizio;

public class Square extends Artwork {
    private double altezza;
    private double larghezza;

    /**
     *
     * @param artista
     * @param altezza
     * @param larghezza
     */
    public Square(String artista, double altezza, double larghezza) {
        super(artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
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


    @Override
    public String toString() {
        return "Square date: "+ this.getArtista()+", con "+this.altezza+"di altezza e "+
                this.larghezza+"  di larghezza";
    }

    //implmentazione del metodo astratto della superclasse Artwork
    @Override
    public double printiEncumbrance() {
        return this.altezza * this.larghezza;
    }


}
