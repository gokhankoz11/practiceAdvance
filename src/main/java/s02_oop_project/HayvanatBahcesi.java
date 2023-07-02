package s02_oop_project;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
    private static List<Hayvan> hayvanlar = new ArrayList<>();
    private static List<Ziyaretci> ziyaretciler = new ArrayList<>();

    public static void hayvanEkle(Hayvan hayvan) {
        hayvanlar.add(hayvan);
    }

    public static void ziyaretciEkle(Ziyaretci ziyaretci) {
        ziyaretciler.add(ziyaretci);
    }

    public void ziyaretciListele(){
        System.out.println("ZIYARETCI LİSTESİ:");
        System.out.println("_________________________");
        for (Ziyaretci ziyaretci : ziyaretciler){
            System.out.println("Ad: " + ziyaretci.getAd());
            System.out.println("Yaş: " + ziyaretci.getYas());
            System.out.println("Tür: " + ziyaretci.getCinsiyet());
            System.out.println("_________________________");
        }
    }
    public void hayvanTablo() {
        System.out.println("HAYVAN TABLOSU:");
        System.out.println("_________________________");
        System.out.printf("%-10s %-10s %-10s %n", "Ad", "Yaş", "Tür");
        System.out.println("_________________________");
        for (Hayvan hayvan : hayvanlar) {
            System.out.printf("%-10s %-10s %-10s %n", hayvan.getAd(), hayvan.getYas(), hayvan.getTur());
        }
        System.out.println("_________________________");
    }


}
