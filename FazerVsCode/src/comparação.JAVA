public class Comparacao {

    public static boolean igual() {
        int a = 10;
        int b = 20;
        return a == b; // false
    }

    public static boolean diferente() {
        int a = 10;
        int b = 20;
        return a != b; // true
    }

    public static boolean maiorQue() {
        int a = 10;
        int b = 20;
        return a > b; // false
    }

    public static boolean menorQue() {
        int a = 10;
        int b = 20;
        return a < b; // true
    }

    public static boolean maiorOuIgual() {
        int a = 10;
        int b = 10;
        return a >= b; // true
    }

    public static boolean menorOuIgual() {
        int a = 15;
        int b = 10;
        return a <= b; // false
    }

    public static void main(String[] args) {
        Comparacao op = new Comparacao();
        System.out.println("10 == 20? " + op.igual());
        System.out.println("10 != 20? " + op.diferente());
        System.out.println("10 > 20? " + op.maiorQue());
        System.out.println("10 < 20? " + op.menorQue());
        System.out.println("10 >= 10? " + op.maiorOuIgual());
        System.out.println("15 <= 10? " + op.menorOuIgual());
    }
}