public class Atribuicao {

  public static int exemploSoma() {
      int x = 10;
      x += 5; // 10 + 5 = 15
      return x;
  }

  public static int exemploSubtracao() {
      int x = 20;
      x -= 8; // 20 - 8 = 12
      return x;
  }

  public static int exemploMultiplicacao() {
      int x = 3;
      x *= 4; // 3 * 4 = 12
      return x;
  }

  public static int exemploDivisao() {
      int x = 25;
      x /= 5; // 25 / 5 = 5
      return x;
  }

  public static void main(String[] args) {
    Atribuicao op = new Atribuicao();
      System.out.println("Resultado de x += 5: " + op.exemploSoma());
      System.out.println("Resultado de x -= 8: " + op.exemploSubtracao());
      System.out.println("Resultado de x *= 4: " + op.exemploMultiplicacao());
      System.out.println("Resultado de x /= 5: " + op.exemploDivisao());
  }
}