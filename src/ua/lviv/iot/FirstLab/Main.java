package ua.lviv.iot.FirstLab;

public class Main {

    public static void main(String[] args) {

        Combine combine1 = new Combine();
        Combine combine2 = new Combine(15000, 13.5f, 580);
        Combine combine3 = new Combine(10000, 12.4f, 500, "Red", "Oleg", 400);

        System.out.println(Combine.getCountryOfOrigin());

        System.out.println("Combine 1: ");
        System.out.println(combine1.toString());

        System.out.println("Combine 2: ");
        System.out.println(combine2.toString());

        System.out.println("Combine 3: ");
        System.out.println(combine3.toString());

    }

}
