public class Plate {
    private int food;
    public Plate (int food){
        this.food = food;
    }

    public void decreaseFood(int n, boolean m) {
        if (food >= n) {
            food -= n;
            m = true;
        }
    }
    public void info(){
        System.out.println("Plate: " + food);
    }
}
