public class Java7 {

   public static void main(String[] args) {
      if(true){
         System.out.println("#1 Oke");
      }

      if(false){
         System.out.println("Not Oke");
      }

      // Materi untuk pengecekan pakah kondisi terpenuhi
      Integer angka = 15;
      if(angka > 10){
         System.out.println("#2 Benar");
      }

      // Materi if else untuk percabangan kondisi benar salah
      angka = 15;
      if(angka > 10){
         System.out.println("#3 Benar");
      }else{
         System.out.println("#3 Salah");
      }

      // #4 Materi pengecekan angka satuan dan puluhan
      angka = 50;
      if((angka >= 0) && (angka < 10)){
         System.out.println("#4 Bilangan Satuan");
      }else if((angka >= 10) && (angka < 100)){
         System.out.println("#4 Bilangan Puluhan");
      }
   }

   // # Latihan
   // # Buatlah program untuk merubah nilai angka ke nilai huruf
   // # 80 - 100  = A
   // # 70 - 79   = B
   // # 60 - 69   = C
   // # 50 - 59   = D
   // # 0  < 50   = E

}