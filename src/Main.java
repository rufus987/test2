public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик",false, 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.isSatiety();
        cat.eat(plate);
        plate.info();
        cat.isSatiety();
        cat.eat(plate);
        plate.info();
        cat.isSatiety();
    }
}