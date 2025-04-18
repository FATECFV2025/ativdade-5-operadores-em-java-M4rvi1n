public class Logicos {
//Identificação de valor falso ou verdadeiro com operdores lógicos
   public boolean and() {
       int a = -150;
       int b = 120;
       return (a > b) && (b < 70);
   }

   public boolean or() {
       int a = 88;
       int b = 45;
       return (a < b) || (b > 100);
   }

   public boolean not() {
       boolean verificacao = true;
       return !verificacao;
   }

   public static void main(String[] args) {
       Logicos op = new Logicos();

       System.out.println("And: " + op.and());
       System.out.println("Or: " + op.or());
       System.out.println("Not: " + op.not());
   }
   //Os essenciais AND, OR e NOT.
}