// Calculator.java
public class Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) { return (b != 0) ? a / b : Double.NaN; }
    
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) sum += num;
        return sum;
    }
    
    public double mean(double[] array) {
        return sumArray(array) / array.length;
    }
    
    public double variance(double[] array) {
        double mean = mean(array);
        double sum = 0;
        for (double num : array) sum += Math.pow(num - mean, 2);
        return sum / array.length;
    }
    
    public double standardDeviation(double[] array) {
        return Math.sqrt(variance(array));
    }
}