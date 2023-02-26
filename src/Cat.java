public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;
    public Cat (String name, boolean satiety, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p){
        p.decreaseFood(appetite);
        satiety = true;
    }
    public void isSatiety(){
        System.out.println("Satiety " + satiety);
    }
}
