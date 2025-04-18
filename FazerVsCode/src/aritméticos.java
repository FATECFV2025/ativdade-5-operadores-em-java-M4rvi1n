public class OperadoresAritmeticos {

// as quatro operações aritméticas com a utilização de operadores
  public  int Adicao() {
    int a = 20;
    int b = 20;
    return a + b;
  }

  public int subtracao() {
    int a = 20;
    int b = 10;
    return a - b;
  }

  public  int multiplicacao() {
    int a = 10;
    int b = 10;
    return a * b
  }

  public int divisao() {
    int a = 8;
    int b = 4;
    return  8 / 4;
  }
  public static void main(String[] args) {
      System.out.println("Soma " + somar());
      System.out.println("Subtração  " + subtrair());
      System.out.println("Multiplicação = " + multiplicar());
      System.out.println("Divisão  " + dividir());
      
  }
}