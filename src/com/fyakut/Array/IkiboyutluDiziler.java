package com.fyakut.Array;

public class IkiboyutluDiziler {

    public static void main(String... args){

     /*   //veritipi[] diziadi=new veritipi[satirsayisi][sütünsayisi]

        int[][] dizi=new int[2][3];

        dizi[0][0]=0;
        dizi[0][1]=1;
       // dizi[2][0]=0;ArrayIndexOutOfBoundsException

        //küçükten büyüge sırala max ve min değerlerini bulma

        int[] sayilar={5,9,11,-5,56,96};

        int max=sayilar[0];
        for (int i=0; i<sayilar.length;i++){
       if (max<sayilar[i]){
           max=sayilar[i];}
       else{
           max=max;}
        }System.out.println("max:"+max);
        int min=sayilar[0];
        for (int j=0; j<sayilar.length;j++){
            if (min>sayilar[j]){
                min=sayilar[j];}
            else{
                min=min;}
        }System.out.println("min:"+min);

for (int i=0;i<sayilar.length;i++){
    for (int j=0;j<sayilar.length;j++){
        if (sayilar[j]>sayilar[j+1])
            sayilar[j]=sayilar[j+1];
        else
            sayilar[j]=sayilar[j+1];

    }System.out.println(sayilar[i]);
}*/

        /**
         * dizileri kopyalamak
          */

       int[] dizi1={2,5,5,8};
       int[] dizi2=new int[dizi1.length];
       for (int i=0;i<dizi1.length;i++){
           dizi2[i]=dizi1[i];

       }for (int i:dizi2)
        System.out.println(i);


        /**
         * arraycopy kullanımı
         *  System.arraycopy(dizi1, başlandıc,dizi2, baslangıc,uzunlugu);
         */
int[] dizi3=new int[dizi1.length];
System.arraycopy(dizi1,0,dizi3,0,dizi1.length);//dizi1 dizi3 ekopyaladı
for (int a:dizi3)
    System.out.println(a);
    }
}
