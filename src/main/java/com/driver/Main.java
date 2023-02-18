package com.driver;

public class Main {
     class Product {
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with signature public int product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with signature public double product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
    public static void main(String[] args) {

        Product p = new Main().new Product();


        int result1 = p.product(2, 3);
        System.out.println(result1); // Output: 6

        int result2 = p.product(2, 3, 4);
        System.out.println(result2); // Output: 24

        double result3 = p.product(2.5, 3.5);
        System.out.println(result3); // Output: 8.75
    }
}