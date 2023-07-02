package practice05.s01_polymorphism;

public class Medya {
    private String dosyaAdi;

    public Medya(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
        System.out.println(this.dosyaAdi+ " adina obje olusturuldu.");


    }

    public void  oynat(){
        System.out.println("Dosya oynatiliyor.");

    }
    public void durdur(){
        System.out.println("Dosya durduruluyor.");
    }

    public String getDosyaAdi() {
        return dosyaAdi;
    }

    public void setDosyaAdi(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }


    @Override
    public String toString() {
        return "dosyaAdi\t= " + dosyaAdi ;
    }
}
