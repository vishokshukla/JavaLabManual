//Java Program to add two complex numbers

import java.util.Scanner;

class ComplexNumber {
    double real;
    double img;
    ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }
    public static ComplexNumber addComplex(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0,0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first complex number : ");
        ComplexNumber c1 = new ComplexNumber(scanner.nextFloat(), scanner.nextFloat());
        System.out.print("Enter second complex number : ");
        ComplexNumber c2 = new ComplexNumber(scanner.nextFloat(), scanner.nextFloat());
        ComplexNumber temp = ComplexNumber.addComplex(c1,c2);
        System.out.print("The sum of complex numbers  "+c1.real+" + "+c1.img+"i  and  "+c2.real+" + "+c2.img+"i  is : ");
        System.out.print(temp.real+" + "+temp.img+"i");
    }
}
