package pbo12;

import pbo12.Alat;

public class AlatTulis extends Alat{
    public String fungsi (){
        System.out.print("Fungsi :");
        String f = at.next();
        return f;
    }
    public double dimensi (double d,double p,double l){
        System.out.print("Dimensi: "+p+" "+l);
        return d;
    }
}
