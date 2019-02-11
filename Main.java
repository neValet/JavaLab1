package helicopter;

public class Main {

    public static void main(String[] args) {
        Helicopter first = new Helicopter();
        Helicopter second = new Helicopter(8, "Second", 420, 6);
        Helicopter third = new Helicopter(20,"Third", 320, 12, 4500, 3, 325);

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());

        second.printProducingCountry();
        Helicopter.printStaticProducingCountry();

    }
}
