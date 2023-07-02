package practice05;

public class VarragsRestaurant {
     /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde 0 döndüren bir metot yazın.
    */
     public static void main(String[] args) {
      double toplam=toplamYemekSepeti("Corba","12.50","Salata","4.50","Pide","9.50");
         System.out.println("Toplam fiyat = " + toplam + " TL'dir.");

     }

    public static double toplamYemekSepeti(String...yemekler) {
        double toplamFiyat=0;
         System.out.println("...HARIKALAR DIYARI Lokantasina hosgeldiniz...");
        System.out.println("___________________________________");

        for (int i = 0; i <yemekler.length ; i+=2) {
            String yemek=yemekler[i];
            double yemekFiyati=Double.parseDouble(yemekler[i+1]);
            toplamFiyat+=yemekFiyati;
            System.out.println(yemek + " = " + yemekFiyati + " TL");
        }
        System.out.println("_______________________________");
        return toplamFiyat;
    }
}
