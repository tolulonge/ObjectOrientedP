public class Engine {
    private String name;
    private int maxSpeed;
    private boolean isRunning;

    public Engine(String name, int maxSpeed, boolean isRunning) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.isRunning = isRunning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void start(){
        System.out.println("Engine is running");
    }
}
