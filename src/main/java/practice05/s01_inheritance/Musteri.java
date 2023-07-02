package practice05.s01_inheritance;

public class Musteri {
    String musteriAdi;
    int musteriNo;

    double hesapBakiyesi;

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }
    public  void  paraYatirma(double para){
        hesapBakiyesi+=para;
        System.out.println("Hesabiniza "+para+" TL eklendi.");
        System.out.println("Hesap bakiyeniz: "+hesapBakiyesi+" TL dir.");
    }

    public void paraCekme(double para) {
        if (hesapBakiyesi >= 0) {
            hesapBakiyesi -= para;
            System.out.println("Hesabinizda " + para + "TL cekilmistir.");
        } else {
            System.out.println("Hesap bakiyeniz yeterli degildir.");
            System.out.println("Hesabinizda " + hesapBakiyesi + "Tl bulunmaktadir.");
        }
    }

    @Override
    public String toString() {
        return
                "\n\t Musteri Adi: " + musteriAdi  +
                "\n\t musteriNo: " + musteriNo +
                "\n\t hesapBakiyesi:" + hesapBakiyesi;
    }
}