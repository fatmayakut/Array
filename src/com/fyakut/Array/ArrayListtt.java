package com.fyakut.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtt {
    public static void main(String[] args){

        int[] dizi1={2,6,5,8,9,10};
        Arrays.sort(dizi1);//dizi elemanlarını sıralar
        for (int s:dizi1)
            System.out.println(s);

        //dizleri karşılastır......

        int[] dizi2={2,6,5,8,9,10};
        Arrays.sort(dizi2);//yerlerini de değiştirr
        System.out.println(Arrays.equals(dizi1,dizi2));

        /**
         * dizide yeni alanlara ihitiyacımız olduğunuzda arraylist kullnaırız
         */
        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(5);//eleman ekler
        liste.add(6);
        liste.remove(2);//indexi verilen elemanı listeden çıkarır
        liste.clear();//listedeki bütün elemanları siler
        liste.indexOf(2);// listede 2 varsa onun indexini donderir listede olmayan için -1 donderir
        liste.size(); // eleman sayısını donderir
    }



}

