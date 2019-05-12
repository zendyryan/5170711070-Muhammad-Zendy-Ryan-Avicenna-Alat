package pbo12;

import java.util.Scanner;

public class Pbo12 {

    static Scanner ta = new Scanner(System.in);
    static double hb, d;
    static String Alat, m, wj, wr, f, j, mf;
    static Alat alat = new Alat();
    static AlatMandi am = new AlatMandi();
    static AlatTulis al = new AlatTulis();
    static AlatKesehatan ak = new AlatKesehatan();

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("1. Alat Mandi");
        System.out.println("2. Alat Tulis");
        System.out.println("3. Alat Kesehatan");
        System.out.print("Meminta pilihan :");
        int in = x.nextInt();
        String nm;
        switch (in) {
            case 1:
                System.out.println("1. Alat Mandi");
                System.out.print("Masukan Nama :");
                nm = ta.next();
                m = am.merk();
                hb = am.hargaBeli();
                wr = am.warna();
                wj = am.wujud();
                System.out.println("---------------------");
                System.out.println("Nama : " + nm);
                System.out.println("harga beli : " + hb);
                System.out.println("merk alat : " + m);
                System.out.println("warna : " + wr);
                System.out.println("wujud : " + wj);
                break;
            case 2:
                System.out.println("2. Alat Tulis");
                System.out.print("Masukan Nama :");
                String nama = ta.next();
                System.out.print("Masukan Dimensi :");
                double p = ta.nextDouble();double l = ta.nextDouble();
                m = al.merk();
                hb = al.hargaBeli();
                f = al.fungsi();
                System.out.println("---------------------");
                System.out.println("Nama : " + nama);
                System.out.println("harga beli : " + hb);
                System.out.println("merk alat : " + m);
                System.out.println("Fungsi = " +f);
                d = al.dimensi(d, p, l);
                break;
            case 3:
                System.out.println("3. Alat Kesehatan");
                System.out.print("Masukan Nama :");
                nm = ta.next();
                m = ak.merk();
                hb = ak.hargaBeli();
                j = ak.jenis();
                mf = ak.manfaat();
                System.out.println("---------------------");
                System.out.println("Nama : " + nm);
                System.out.println("harga beli : " + hb);
                System.out.println("merk alat : " + m);
                System.out.println("Jenis : " + j);
                System.out.println("Manfaat : " + mf);
                break;
                
        }

    }

}
