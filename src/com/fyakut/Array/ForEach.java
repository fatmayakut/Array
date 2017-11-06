package com.fyakut.Array;

public class ForEach {
    /**
     *
     */

    public static void main(String... args) {
/**
 * dizileri metotlara parametre olarak verme
 */
        int[] sayilar = {2, 5, 9, 6};
        ekranayazdr(sayilar[2]);
        elemanlarıntoplaminiBul(sayilar);
       // toplaminibul( ...sayilar:5,9);


    }

    private static void toplaminibul(int... sayilar) {
        int toplam=0;
        for (int sayi:sayilar)
            toplam=toplam+sayi;
        System.out.println(toplam);
    }


    private static void ekranayazdr(int i) {
        System.out.println(i);
    }

    private static void elemanlarıntoplaminiBul(int[] glenDizi) {
        int toplam = 0;
        for (int gecici : glenDizi)
            toplam = toplam + gecici;
        System.out.println(toplam);
    }

}



    /**
     * gelişmiş for dongüleri
     */
     /* int[] sayilar={5,6,8,-6,9,10};
      for (int i=0;i<sayilar.length;i++){
          System.out.println("sayılar:"+sayilar[i]);
      }
      for (int gecici:sayilar){
          System.out.println(gecici);
      }

      int[] dizi={2,6,8,9,5,7};
        int toplam=0;
        for (int i=0;i<dizi.length;i++){
            toplam=toplam+dizi[i];
            System.out.println("toplam"+toplam);
}
    int topla=0;
        for (int say:dizi){
                topla=topla+say;
                }
                System.out.println("topla"+topla);

                String[] gunler={"pazrts","sali","çarsamba","persembe","cuma","cmrts","pazar"};
                for (String s:gunler){
                System.out.println(s);
                }*/

