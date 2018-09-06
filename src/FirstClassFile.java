

public class FirstClassFile {
    public static void main(String[] args) {

        Cat barsik = Cat.burnCat("Barsik", 6, "red", false);
        System.out.println(barsik.name + " " + barsik.age);
        barsik.eat("meat");

        int x = Calculator.calc(5, 4);
        System.out.println(x);
        City Berlin = new City("Berlin");
        City Madrid = new City ("Madrid", 5000000);
        City Tomsk = new City ("Tomsk", 700000, false);
        City Moscow = new City ("Moscow", 20000000, true, true);


        Moscow.info();
        Berlin.info();
        Madrid.info();
        Tomsk.info();

    }
}

