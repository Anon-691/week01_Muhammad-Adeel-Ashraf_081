public class Car {
    private String brand;
    private String model;
    private String colour;
    private String fuelLevel;
    private boolean stateOn;
    private int speed;
    private String wheel;

    // Default Constructor
    public Car() {
        this.brand = "";
        this.model = "";
        this.colour = "";
        this.fuelLevel = "";
        this.stateOn = false;
        this.speed = 0;
        this.wheel = "";
    }

    // Parameterized Constructor
    public Car(String brand, String model, String colour, String fuelLevel, boolean stateOn, int speed, String wheel) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.fuelLevel = fuelLevel;
        this.stateOn = stateOn;
        this.speed = speed;
        this.wheel = wheel;
    }

    // Setter 
    public void setDetails(String brand, String model, String colour, String fuelLevel, boolean stateOn, int speed, String wheel) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.fuelLevel = fuelLevel;
        this.stateOn = stateOn;
        this.speed = speed;
        this.wheel = wheel;
    }

    // Getter
    public String getBrand() {
        return this.brand;
    }

    public String getFuelLevel() {
        return this.fuelLevel;
    }

    public int getSpeed() {
        return this.speed;
    }

    // Methods/behaviours
    public void startEngine() {
        if (!this.stateOn) {
            this.stateOn=true;
            System.out.println("Engine is started.");
        } else {
            System.out.println("Engine is already on.");
        }
    }

    public void stopEngine() {
        if (this.stateOn && this.speed == 0) {
            this.stateOn = false; 
            System.out.println("Engine is stopped.");
        } else if (this.speed != 0) {
            System.out.println("Car is moving. Cannot stop the engine.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    public void drift() {
        if (this.stateOn && this.speed >= 50 && this.wheel.equals("RWD")) {
            System.out.println(this.brand + this.model +" can drift");
        } else {
            System.out.println(this.brand + this.model +" can not drift");
        }
    }

    // Show Method
    public void show() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Colour: " + this.colour);
        System.out.println("Fuel Level: " + this.fuelLevel);
        System.out.println("Engine On: " + this.stateOn);
        System.out.println("Speed: " + this.speed);
        System.out.println("Wheel: " + this.wheel);
        
}
}
