package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimi {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1985, 03, 15);
        BireyselMusteri bm = new BireyselMusteri(
                "Ali",
                123456,
                2000,
                "123456",
                dogumTarihi);
        System.out.println(bm.toString());
        bm.paraCekme(2000);
        KurumsalMusteri km=new KurumsalMusteri(
                "As",123,30000,
                "546","as1");

        System.out.println(km.toString());
        km.paraYatirma(5000);

    }
}
