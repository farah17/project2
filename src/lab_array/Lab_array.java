
package lab_array;
import java.util.Scanner;
public class Lab_array {

 public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     String[]namaBulan ={"Januari","Februari","Mac","April","Mei","Jun","Julai","Ogos","September","Oktober","November","Desember"};
     System.out.println("NAMA-NAMA BULAN DALAM KALENDAR");
     System.out.print("Masukkan bulan kelahiran anda(1 hingga 12):");
     int bilBulan =input.nextInt();
     
     System.out.println("Bulan "+bilBulan+" adalah bulan "+namaBulan[bilBulan-1]);
     
   
    }
    
}
