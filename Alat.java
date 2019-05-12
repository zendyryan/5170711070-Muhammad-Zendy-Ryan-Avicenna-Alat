package pbo12;

import java.util.Scanner;

public class Alat {
   Scanner at = new Scanner(System.in);
   public double hargaBeli (){
       System.out.print("Harga :");
       double hb = at.nextDouble();
       return hb;
   }
   public String merk (){
       System.out.print("Merk :");
       String m = at.next();
       return m;
   }
}
