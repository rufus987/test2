public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;
    private static int catCount;
    public Cat (String name, boolean satiety, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        catCount++;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        setSatiety(true);
    }
    public void isSatiety(){
        System.out.println("Satiety " + satiety);
    }
}
