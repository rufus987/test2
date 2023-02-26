public class Plate {
    private int food;
    public Plate (int food){
        this.food = food;
    }
    Cat cat;
    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        }
    }
    public void info(){
        System.out.println("Plate: " + food);
    }
}
