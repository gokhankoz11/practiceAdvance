package Practice04;

import java.util.Scanner;

public class StringBuilder {
    /*
        Bir öğrenci, matematik dersinde, verilen bir sayının faktöriyelini hesaplamak için bir program yazmak istiyor.
        Program, kullanıcıdan bir sayı girmesini isteyecek ve faktöriyel hesaplama işlemini gerçekleştirecektir.
        Kullanıcının girdiği sayı 20'den küçük veya eşit olacaktır.
        Faktöriyel hesaplama işlemi tamamlandıktan sonra sonucu ekrana yazdıracaktır.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("20 den kücük veya esit bir sayi giriniz..");
        int sayi= input.nextInt();
        if (sayi<=20){
            java.lang.StringBuilder sonuc = new java.lang.StringBuilder();
            sonuc.append(sayi).append("! = ");
            int faktoriyel=1;

            for (int i = 1; i <=sayi ; i++) {
                faktoriyel*=i;
                sonuc.append(i);
                if (i!=sayi){
                    sonuc.append(" * ");
                }
            }
            sonuc.append(" = ").append(faktoriyel);
            System.out.println(sonuc);
        }else {
            System.out.println("Geçersiz bir değer girdiniz. Sayı, 20'den küçük veya eşit olmalı.");
        }

    }
}
