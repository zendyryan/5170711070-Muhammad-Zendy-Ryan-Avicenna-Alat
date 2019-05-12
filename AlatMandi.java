package pbo12;
import pbo12.Alat;
public class AlatMandi extends Alat {
   public String wujud(){
        System.out.print("Wujud :");
        String wj = at.next();
    return wj;
   }
    public String warna(){
        System.out.print("Warna :");
        String wr = at.next();
        return wr;
    }
}
