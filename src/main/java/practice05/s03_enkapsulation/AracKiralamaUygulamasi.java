package practice05.s03_enkapsulation;

public class AracKiralamaUygulamasi {
    public static void main(String[] args) {
        Arac araba=new Arac("Honda","Civic","Benzinli",500);
        System.out.println(araba);

        araba.setGunlukKiraUcreti(600);
        System.out.println(araba);
        System.out.println(araba.getMarka());


    }
}
