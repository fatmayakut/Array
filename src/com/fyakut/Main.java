package com.fyakut;

public class Main {

    public static void main(String[] args) {
/**
 * aynı tipteki veriler için ayrı ayrı değişkenler tanımlamak yerine tek bir yerde saklamaya yarar
 */

//veritipi[] diziAdi=new veritipi[elemansayısı]
        // int[] yenidizi={a,b,a,5}
        int[] sayilar= new int[5];//u durumda garbage college olur
      //  sayilar=new int[15];

        sayilar[0]=1;
        sayilar[1]=3;
        sayilar[2]=6;

        sayilar[3]=-9;
        sayilar[4]=15;
        //sayilar[5]=10; main" java.lang.ArrayIndexOutOfBoundsException: 5 hatası alır
       // System.out.println(sayilar);
        for (int i=0;i<sayilar.length; i++)
            System.out.println("sayılar:"+sayilar[i]);


    }
}
