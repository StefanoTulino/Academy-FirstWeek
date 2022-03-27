package com.corso.secondoEsercizio;

public abstract class Artwork {
    private String artista;

    public Artwork(){
    }

    /**
     * @param artista
     */
    public Artwork(String artista) {
        this.artista = artista;
    }

    //metodo Astratto
    public abstract double printiEncumbrance();


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Artwork) {
            Artwork a = (Artwork) obj;
            return true;
        }
        else return false;
    }

}
