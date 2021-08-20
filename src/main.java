public class main {
    public static void main(String[] args) {
        Cat musya = new Cat("Musya", 15);
        Plate plate = new Plate(10);

        plate.info();
        musya.eat(plate);

        plate.info();
    }
}
