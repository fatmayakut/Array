package com.fyakut.Array;

public class StringClass {
    /**
     * karakter sınıfıdr. Değiştirilemez nesnelerdir.Değiştirmek isityorsak StringBuilder kullnılmalı
     */
    public static void main(String... args) {
String takim="fenerbahce";
String takim2=new String("fenerbahçe");
        System.out.println("takım:"+takim+"takım2:"+takim2);
        System.out.println("fener"+"bahçe");//+ işlemi Stringlerde birleştirmeye yarar


        //String metodları

        System.out.println("fenerbahçe harf sayısı:"+takim.length());
        System.out.println("fenerbahçe 4.harfi:"+takim.charAt(4));
        System.out.println("fenerbahçe 2-6 arasındaki harfler:"+takim.substring(2,6));
        System.out.println("fenerbahçe index no :"+takim.indexOf("r"));
        System.out.println("fenerbahçe harf değiştir:"+takim.replace("a","b"));
        System.out.println("fenerbahçe harf Büyük harfe cevir:"+takim.toUpperCase());
        System.out.println("fenerbahçe küçük harfe cevir:"+takim.toLowerCase());


        String yil="1995";
        System.out.println(yil);//yil-5 yazamayız int değildir
        //inte ceviri
        System.out.println(Integer.parseInt(yil)-5);
        int yil2=1995;
        System.out.println(String.valueOf(yil2));

        /**
         * Stringlerin karşılaştırılması
         */
        String s1=new String("fatma");//bu durumlarda karşılaştır yaparsa eşit değil çıkar farklı
                                            // bellekte oldukları için if referans yerlerini kontrol eder.
        String s2=new String("fatma");
        if (s1==s2){// eguals kullnılmalıdır
            System.out.println("eşittir");

        }else
            System.out.println("eşittdeğildir");
        if (s1.equals(s2)){
            System.out.println("eguals:eşittir");
        }
    }
}
