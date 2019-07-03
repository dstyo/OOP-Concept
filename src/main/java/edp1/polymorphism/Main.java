package edp1.polymorphism;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Main, v 0.1 2019-07-03 07:49 by Dwi Setiyono
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Balok());
        System.out.println(new PersegiPanjang());
        System.out.println(new BangunDatar());
        System.out.println(new Object());
    }

}

class Balok extends PersegiPanjang {

    public String toString() {
        return "Mempunyai sisi panjang, lebar dan tinggi";
    }
}

class PersegiPanjang extends BangunDatar {

    public String toString() {
        return "Mempunyai sisi panjang dan lebar";
    }
}

class BangunDatar extends Object {

    public String toString() {
        return "Mempunyai berbagai bentuk";
    }
}