public class Calculator {

    // Attributes
    private String model;
    private String colour;
    private String type;
    private boolean stateOn;
    private double num1;
    private double num2;

    // Default constructor
    public Calculator() {
        this.model = "";
        this.colour = "";
        this.type = "";
        this.stateOn = false;
        this.num1 = 0;
        this.num2 = 0;
    }

    // Parameterized constructor
   public Calculator(double num1, double num2){
      this.num1 = num1;
      this.num2 = num2;
   }

    // Setter
    public void setDetails(String model, String colour, String type, boolean stateOn, double num1, double num2) {
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.stateOn = stateOn;
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter
    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    // Behaviours
    public double add(double num1, double num2) {
        if(this.stateOn){
        return num1 + num2;
        }
        else{
            System.out.println("Please turn on the calculator first");
            return 0;
        }
    }

    public double subtract(double num1, double num2) {
        if(this.stateOn){
        return num1 - num2;
        }
        else{
            System.out.println("Please turn on the calculator first");
            return 0;
        }
    }
    

    public double divide(double num1, double num2) {
        if(this.stateOn){
        if (num2 == 0) {
            System.out.println("Number cannot be divided by zero");
            return 0;
        } else {
            return num1 / num2;
        }
        }
        else{
            System.out.println("Please turn on the calculator first");
            return 0;
        }
    }

    public double multiply(double num1, double num2) {
        if(this.stateOn){
        return num1 * num2;
         }
        else{
            System.out.println("Please turn on the calculator first");
            return 0;
        }
    }

    public double modulus(double num1, double num2) {
        if(this.stateOn){
        if (num2 == 0) {
            System.out.println("Number cannot be divided by zero");
            return 0;
        } else {
            return num1 % num2;
        }
        }
        else{
            System.out.println("Please turn on the calculator first");
            return 0;
        }
    }

    public double power(double num1, int num2) {
        if(this.stateOn){
        double res = 1;
        for (int i = 0; i < num2; i++) {
            res *= num1;
        }
        return res;
        }
        else{
            System.out.println("Please turn on the calculator first");
            return 0;
        }
    }

    // Show Method
    public void show() {
        System.out.println("Model   :" + this.model);
        System.out.println("Colour  :" + this.colour);
        System.out.println("Type    :" + this.type);
        System.out.println("StateOn :" + this.stateOn);
        System.out.println("Num1    :" + this.num1);
        System.out.println("Num2    :" + this.num2);
    }
}