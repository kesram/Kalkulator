public class Calculator {
    int a;
    int b;

    public int add(int a, int b){
        int i = a + b;
        return i;
    }
    public int subtract(int a, int b) {
        int i = a - b;
        return i;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,6));
    }
}
