class Calculator {
        public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class methodoverloding1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(10, 20));             
 System.out.println(calc.add(10.5, 20.5));      
      System.out.println(calc.add("Hello, ", "World!"));   
   }
}
