// 12S24009 - Kezia Pasaribu
// 12S24049 - Rimanda Panjaitan

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargaBuku, totalHarga, minimumHarga, hargaAkhir;

        minimumHarga = 1000;
        hargaBuku = Double.parseDouble(input.nextLine());
        totalHarga = hargaBuku;
        minimumHarga = hargaBuku;
        while (hargaBuku != 0) {
            if (minimumHarga < hargaBuku) {
                minimumHarga = minimumHarga;
            } else {
                minimumHarga = hargaBuku;
            }
            hargaBuku = Double.parseDouble(input.nextLine());
            totalHarga = totalHarga + hargaBuku;
        }
        if (totalHarga >= 100) {
            hargaAkhir = totalHarga - minimumHarga;
        } else {
            hargaAkhir = totalHarga;
        }
        System.out.println(toFixed(hargaAkhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
