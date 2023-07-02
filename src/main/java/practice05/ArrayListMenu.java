package practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListMenu {

    /*
        Bir restoranın menüsüne eklenecek öğeleri kullanıcıdan alarak List'e ekleyin ve menüyü ekrana yazdırın.
    */
    public static void main(String[] args) {
        List<String> menu=new ArrayList<>();
        Scanner input =new Scanner(System.in);
        String secenek;
        do {
            System.out.println("Menuye eklemek istediginiz yemek: ");
            String yemek=input.nextLine();
            if (menu.contains(yemek)){
                System.out.println(yemek+" listede zaten var.Tekrar ekleyemezsiniz.");
            }else {
                menu.add(yemek);
            }
            System.out.println("Baska yemek eklemek istermisiniz? (E/H)");
            secenek= input.nextLine();
        }while (secenek.equalsIgnoreCase("E"));
        System.out.println("Menu: ");
        for (String yemek :menu){
            System.out.println("\t - "+ yemek);
        }
    }
}
