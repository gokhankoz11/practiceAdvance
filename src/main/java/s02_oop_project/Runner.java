package s02_oop_project;

public class Runner {
    public static void main(String[] args) {
        HayvanatBahcesi hb = new HayvanatBahcesi();
        HayvanatBahcesi hba = new HayvanatBahcesi();
        Aslan simba = new Aslan("Simba", 8, "Aslan");
        Aslan mamba = new Aslan("Mamba", 5, "Aslan");
        HayvanatBahcesi hb1 = new HayvanatBahcesi();

        hb.hayvanTablo();
       hb1.ziyaretciListele();


    }
}
