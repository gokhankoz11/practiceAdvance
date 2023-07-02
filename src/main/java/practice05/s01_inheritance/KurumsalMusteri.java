package practice05.s01_inheritance;

public class KurumsalMusteri extends Musteri {
    String vergiNo;
    String sirketAdi;

    public KurumsalMusteri(String musteriAdi, int musteriNo, double hesapBakiyesi, String vergiNo, String sirketAdi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
        this.vergiNo = vergiNo;
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        return "KurumsalMusteri:" +
                super.toString()+
                "\n\t Vergi No: " + vergiNo +
                "\n\t sirket Adi:" + sirketAdi;
    }
}
