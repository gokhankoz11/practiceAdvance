package practice05.s01_polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {
        Medya medya=new Medya("Ses Dosyas.mp3");
        System.out.println("Medya "+medya);

        Medya medya1=new Medya("Ses Dosyasi 2.mp3");
        //System.out.println("Medya1 "+medya1);

        medya.setDosyaAdi(("Yalnizca Sitem.mp3"));
        System.out.println("Medya "+medya);
        System.out.println(medya.getDosyaAdi());
        SesDosyasi sd=new SesDosyasi("Yeni Dosya.mp3");
        sd.oynat();
    }

}
