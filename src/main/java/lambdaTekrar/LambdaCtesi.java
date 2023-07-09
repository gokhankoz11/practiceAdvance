package lambdaTekrar;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaCtesi {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
        ciftVePozoitifLambdaExp(number);
        System.out.println("\n/////////////");
        ciftVePozitifMethod(number);
        System.out.println("\n/////////////");
        kareTekrarsiz(number);
        System.out.println("\n/////////////");
        buyuktenKucuge(number);
        System.out.println("\n/////////////");
        pozitifKupBirler(number);
        System.out.println("\n/////////////");
        methodRefToplama(number);
        System.out.println("\n/////////////");
        toplamiLambdaExp(number);
        System.out.println("\n/////////////");
        pozitifElemanLambdExp(number);
        System.out.println("\n/////////////");
        System.out.println(ciftElemanKareSiralama(number));

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozoitifLambdaExp(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifMethod(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(Utils::print);
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareTekrarsiz(List<Integer> sayi) {
        sayi.stream().distinct().map(t -> t * t).forEach(Utils::print);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyuktenKucuge(List<Integer> sayi) {
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::print);
    }

    // SORU6 : List elemanlarının pozitif olanlarının,
    // kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirler(List<Integer> sayi) {
        sayi.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).forEach(Utils::print);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void methodRefToplama(List<Integer> sayi) {
        Optional<Integer> sonuc = sayi.stream().reduce(Math::addExact);
        System.out.print(sonuc);
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamiLambdaExp(List<Integer> sayi) {
        int sonuc1 = sayi.stream().reduce(0, (t, u) -> t + u);
        System.out.print(sonuc1);
    }

    //SORU9 : Listin pozitif elemanlarının,
    // carpımını Lambda Expression ile return ederek yazdırın
    public static void pozitifElemanLambdExp(List<Integer> sayi) {
        int sonuc2 = sayi.stream().filter(t -> t > 0).reduce(1, (t, u) -> t * u);
        System.out.print(sonuc2);
    }

    //SORU10 : Listin cift elemanlarının, karelerini,
// kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElemanKareSiralama(List<Integer> sayi) {
        List<Integer> liste = sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted().collect(Collectors.toList());
        return liste;
    }

}
