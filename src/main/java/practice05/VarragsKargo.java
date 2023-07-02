package practice05;

import java.text.DecimalFormat;

public class VarragsKargo {
     /*
        Bir kargo şirketi, gönderilen paketlerin toplam ağırlığını hesaplayan bir metot yazmanızı istiyor.
        Metot, paketlerin ağırlıklarını almalıdır. Paketlerin toplam ağırlığını döndüren ve
        hiç paket gönderilmediğinde 0 döndüren bir metot yazın.
    */
     public static void main(String[] args) {
        double toplam= toplamAgirlikHesapla(1.5,2.4,3.8,5.7);

         String yeni="0.00";
         DecimalFormat a=new DecimalFormat(yeni);
         String yeniToplam=a.format(toplam);
         System.out.println(yeniToplam);
     }

    private static double toplamAgirlikHesapla(double...paketler) {
         double toplamAgirlik=0;
        for (double agirlik:paketler) {
            toplamAgirlik+=agirlik;
        }
        return toplamAgirlik;
    }
}
