package Calculator;

import static java.lang.Math.*;

public class Calculator {

    public double getAdd(double num1, double num2) {
        return num1 + num2;
    }

    public double getSub(double num1, double num2){
        return num1 - num2;
    }

    public double getMul(double num1, double num2){
        return num1 * num2;
    }

    public double getDiv(double num1, double num2){
        return num1 / num2;
    }

    public double getSqrRt(double num1){
        return sqrt(num1);
    }

    public double getPowerOf(double num1, int num2){
        return pow(num1, num2);
    }

    public double getSin(double num1){
        return sin(num1);
    }

    public double getSinh(double num1){
        return sinh(num1);
    }

    public double getCos(double num1){
        return cos(num1);
    }

    public double getCosh(double num1){
        return cosh(num1);
    }

    public double getTan(double num1){
        return tan(num1);
    }

    public double getTanh(double num1) {
        return tanh(num1);
    }

    public double getASin(double num1) {
        return asin(num1);
    }

    public double getACos(double num1) {
        return acos(num1);
    }

    public double getATan(double num1) {
        return atan(num1);
    }
}
