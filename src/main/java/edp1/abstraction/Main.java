package edp1.abstraction;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Main, v 0.1 2019-07-03 07:32 by Dwi Setiyono
 */
public class Main {

    public static void main(String[] args) {
        Bebek bebek = new Bebek();
        Kucing kucing = new Kucing();

        bebek.bicara();
        kucing.bicara();
        kucing.bernafas();
    }
}

abstract class Animal {

    public abstract void bicara();

    public void bernafas() {
        System.out.println("Animal bernafas");
    }

}

class Bebek extends Animal {

    public void bicara() {
        System.out.println("Quack.. Quack..");
    }

}

class Kucing extends Animal {

    public void bicara() {
        System.out.println("miaawww..");
    }

}
