package lambdaTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaCtesi2 {
    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek", "greyfurt", "nar",
                "mandalina", "armut", "elma", "keciboynuzu", "elma"));

        ilkHarfeVeyac(meyve);
        System.out.println("\n/////////////////");
        basinaSonunaYildiz(meyve);
        System.out.println("\n/////////////////");
        eHarfiOlanlar(meyve);
        System.out.println("\n/////////////////");
        lHarfiniSil(meyve);
        System.out.println("\n/////////////////");
        karakterSayisinaGoreKucuktenBuyugeLambdaExp(meyve);
        System.out.println("\n/////////////////");
        karakterSayisinaGoreBuyuktenKucugeLambdaExp(meyve);
        System.out.println("\n/////////////////");
        karakterSayisinaGoreBuyuktenKucugeMethodRef(meyve);

    }

    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari,
    // Method References ile aralarında bosluk bırakarak yazdıralım
    public static void ilkHarfeVeyac(List<String> meyve) {
        meyve.stream().filter(t -> t.startsWith("e") || t.startsWith("c")).forEach(Utils::print);
    }

    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void basinaSonunaYildiz(List<String> meyve) {
        meyve.stream().map(t -> "*" + t + "*").forEach(Utils::print);
    }

    // SORU3 : List elemanlarının icinde 'e' harfi olanları yazdırın
    public static void eHarfiOlanlar(List<String> meyve) {
        meyve.stream().filter(t -> t.contains("e")).forEach(Utils::print);
    }

    // SORU4 : List elemanlarındaki 'l' harflerini silip yazdırınız
    public static void lHarfiniSil(List<String> meyve) {
        meyve.stream().map(t -> t.replace("l", "")).forEach(Utils::print);
    }

    // SORU5 : List elemanlarini, Lambda Expression kullanarak
    // karakter sayisina göre kucukten buyuge dogru sıralayarak yazdırınız
    public static void karakterSayisinaGoreKucuktenBuyugeLambdaExp(List<String> meyve) {
        meyve.stream().sorted(Comparator.comparing(t -> t.length())).forEach(Utils::print);
    }

    // SORU5.1 : List elemanlarini, Lambda Expression kullanarak
    // karakter sayisina göre buyukten kucuge dogru sıralayarak yazdırınız
    public static void karakterSayisinaGoreBuyuktenKucugeLambdaExp(List<String> meyve) {
        meyve.stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).forEach(Utils::print);
    }

    // SORU6 : List elemanlarini, Method References kullanarak
    // karakter sayisina göre buyukten kucuge dogru sıralayarak yazdırınız
    public static void karakterSayisinaGoreBuyuktenKucugeMethodRef(List<String> meyve) {
        meyve.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::print);
    }

}