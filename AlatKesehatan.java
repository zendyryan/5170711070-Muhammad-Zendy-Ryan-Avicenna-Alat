package pbo12;

import pbo12.Alat;

public class AlatKesehatan extends Alat {
    public String jenis(){
        System.out.print("Jenis :");
        String j = at.next();
        return j;
    
    }
    public String manfaat(){
        System.out.print("Manfaat :");
        String mf = at.next();
        return mf;
    }
}
