import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=sc.nextDouble();

        System.out.println("Enter second number");
        double num2=sc.nextDouble();

        Calculator casio=new Calculator();
        Calculator citizen=new Calculator();
        
        casio.setDetails("fx-991es plus","silver","scientific",true,num1,num2);
        
        casio.show();
        System.out.println(casio.add(num1,num2));
        System.out.println(casio.subtract(num1,num2));
        System.out.println(casio.divide(num1, num2));
        System.out.println(casio.multiply(num1, num2));
        System.out.println(casio.modulus(num1, num2));
        System.out.println(casio.power(num1,(int) num2));
        System.out.println();

        citizen.setDetails("CX-123N","black","scientific",false,num1,num2);
        
        citizen.show();
        System.out.println(citizen.add(num1,num2));
        System.out.println(citizen.subtract(num1,num2));
        System.out.println(citizen.divide(num1, num2));
        System.out.println(citizen.multiply(num1, num2));
        System.out.println(citizen.modulus(num1, num2));
        System.out.println(citizen.power(num1,(int) num2));

        sc.close();
    }
}