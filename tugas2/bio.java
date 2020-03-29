// mengimpor Scanner ke program
import java.util.Scanner;


public class bio {


    public static void main(String[] args) {

        // deklarasi variabel

        String nama, jurusan,fakultas, nim;


       // membuat scanner baru
 
       Scanner keyboard = new Scanner(System.in);



        // Tampilkan output ke user
 
  
  
        System.out.print("Nama: ");
 
       nama = keyboard.nextLine();

        System.out.print("Jurusan: ");

        jurusan = keyboard.nextLine();

        System.out.print("Fakultas: ");

        fakultas = keyboard.nextLine();

        System.out.print("Nim: ");
 
       nim = keyboard.nextLine();
}
}