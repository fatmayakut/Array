package com.fyakut.Array;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String... args) {
        String[] isim = {"ümran", "fatma", "yakut","ahmet"};
        String[] soyad = {"Denizhan", "kalay", "yurtsever","ayse"};
     ArrayList<String> birlesenİsimler=  birlestir(isim, soyad);
        //System.out.println(birlesenİsimler.size());
        yazdır(birlesenİsimler);
    }

    private static void yazdır(ArrayList<String> birlesenİsimler) {
        for (String gecici:birlesenİsimler)
            System.out.println(gecici);
    }


    private static ArrayList<String> birlestir(String[] isim, String[] soyad) {
        ArrayList<String> tumisimler = new ArrayList<>();
        int yas = (int) (Math.random() * 50);
        for (int i = 0; i < isim.length; i++) {
            String birles = isim[i] + soyad[i] + yas;
           // System.out.println(birles);
            tumisimler.add(birles);
        }
        return tumisimler;
    }


}
