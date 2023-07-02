package practice05.s01_inheritance;

import java.time.LocalDate;

public class BireyselMusteri extends Musteri {
    String tcKimlikNo;
    LocalDate dogumTarihi;

    public BireyselMusteri(String musteriAdi, int musteriNo, double hesapBakiyesi,  String tcKimlikNo,LocalDate dogumTarihi ) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
        this.tcKimlikNo=tcKimlikNo;
        this.dogumTarihi=dogumTarihi;
    }

    @Override
    public String toString() {
        return "Bireysel Musteriler:" +
                super.toString() +
                "\n\t TC No: "+tcKimlikNo +
                "\n\t dogumTarihi=" + dogumTarihi;
    }
}
