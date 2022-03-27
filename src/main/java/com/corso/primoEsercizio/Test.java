package com.corso.primoEsercizio;

public class Test {
    public static void main(String[] args) {
        A[] arr = new B[10];
        C gamma = new C();
        B beta = gamma;
        A alfa = gamma;

        //aggiunta del cast--> segnalava errore--> STAMPA C1 --> metodo public String f(A x, A[] arr)
        System.out.println(beta.f ((A) gamma,arr));
        //STAMPA A2--> metodo public String f(Object x, Object y)
        System.out.println(gamma.f(arr,alfa)) ;
        //STAMPA C2--> metodo public String f(B x, Object y)
        System.out.println(gamma.f(beta,alfa));
        //STAMPA 7-->  OR INCLUSIVO BIT A BIT
        System.out.println(5 | 7);
    }
}
