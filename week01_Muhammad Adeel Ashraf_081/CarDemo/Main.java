public class Main {
    public static void main(String[] args) {
         Car cA = new Car();
         Car cB = new Car();
         
         cA.setDetails("Toyota","-Supra","Black","High",true,90,"RWD");
         cA.show();
         cA.startEngine();
         cA.stopEngine();
         cA.drift();

         System.out.println();

         cB.setDetails("Toyota", "-Corolla", "White", "Low", false, 0, "FWD");
         cB.show();
         cB.startEngine();
         cB.stopEngine();
         cB.drift();
    }
}
