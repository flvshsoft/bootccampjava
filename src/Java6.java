public class Java6 {

   public static void main(String[] args) {
    System.out.println("#1 Hello");
    hello();
    hello2("#3 Budi");
    hello2("#4 Cica");
    hello2("#5 Danur");
   }

   static void hello(){
    System.out.println("#2 Hello World");
   }

   static void hello2(String nama){
    System.out.println("Hello "+nama);
   }
}