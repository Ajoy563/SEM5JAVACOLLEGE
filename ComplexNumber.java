// WAP in java that defines complex numbers consisting of real and imaginary numbers. Define suitable methods to add, subtract, multiply two complex numbers and also write a method to find the mod of a complex number. Use static methods and display the results of calculation.
import java.util.*;
public class ComplexNumber {
    public static void main(String args[]) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, -3);

        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("\nSecond Complex Number: ");
        c2.display();

        Complex sum = Complex.add(c1, c2);
        System.out.print("\nSum: ");
        sum.display();

        Complex diff = Complex.subtract(c1, c2);
        System.out.print("\nDifference: ");
        diff.display();

        Complex product = Complex.multiply(c1, c2);
        System.out.print("\nProduct: ");
        product.display();

        double mod1 = Complex.modulus(c1);
        double mod2 = Complex.modulus(c2);
        System.out.printf("\nModulus of first complex number: %.2f", mod1);
        System.out.printf("\nModulus of second complex number: %.2f\n", mod2);
    }
}
class Complex {
    double real;
    double imag;
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }
    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imag - c2.imag);
    }
    public static Complex multiply(Complex c1 , Complex c2) {
        double realpart = c1.real * c2.real - c1.imag * c2.imag;
        double imagpart = c1.real * c2.imag + c1.imag * c2.real;
        return new Complex(realpart, imagpart);
    }
    public static double modulus(Complex c) {
        return Math.sqrt(c.real * c.real + c.imag * c.imag);
    }
    public void display() {
        System.out.printf(real +" + " + imag + " i");
    }
}
