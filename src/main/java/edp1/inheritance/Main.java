package edp1.inheritance;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Main, v 0.1 2019-07-03 08:13 by Dwi Setiyono
 */
public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nama = "Binatang Abstrak";
        animal1.mengeluarkanSuara();

        Kucing kucing1 = new Kucing();
        kucing1.nama = "Kitten";
        kucing1.mengeluarkanSuara();

        Animal animal2 = new Kucing();
        animal2.nama = "Mew";

    }
}

class Animal {

    public String nama;

    public int umur;

    public void makan() {
        System.out.println("Sedang Makan");
    }

    public void mengeluarkanSuara() {
        System.out.println("Sedang Bersuara");
    }
}

class Kucing extends Animal {

    @Override
    public void mengeluarkanSuara() {
        System.out.println("Meong");
    }
}