import java.sql.Array;

public class Java72 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        System.out.println();

        Integer batas = 3;
        for (int i = 0; i < batas; i++) {
            System.out.println("Hello "+i);
        }
        System.out.println();

        String[] siswa = {"Ade", "Budi", "Cica"};
        System.out.println(siswa[0]);
        System.out.println();

        for (int i = 0; i < siswa.length; i++) {
            System.out.println(siswa[i]);
        }

        String[] mobil = {"Avanza", "Pajero", "Xpander"};
    }

    // # Latihan 1
    // # Buatkan ouputan menjadi seperti dibawah :
    // # 1. Hello Bootcamp
    // # 2. Hello Bootcamp
    // # 3. Hello Bootcamp

    // # Latihan 2
    // # Buatkan ouputan menjadi seperti dibawah, tanpa merubah variabel array mobil
    // # 1. Mobil Avanza
    // # 2. Mobil Pajero
    // # 3. Mobil Xpander
}
