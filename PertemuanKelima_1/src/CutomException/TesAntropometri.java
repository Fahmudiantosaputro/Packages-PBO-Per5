/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CutomException;

/**
 *
 * @author mursi
 */
import java.util.Scanner;

// Custom Exception
class TinggiBadanTidakCukupException extends Exception {

    public TinggiBadanTidakCukupException(String pesan) {
        super(pesan);
    }
}

public class TesAntropometri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tinggi badan Calon Prajurit: ");
        int tinggi = input.nextInt();

        try {
            cekTinggiBadan(tinggi);
            System.out.println("Anda lolos tes Tinggi badan, untuk jadi Calon Prajurit TNI.");
        } catch (TinggiBadanTidakCukupException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // Method cek umur
    public static void cekTinggiBadan(int tinggi) throws TinggiBadanTidakCukupException {
        int batas = 170;
        if (tinggi < batas) {
            throw new TinggiBadanTidakCukupException("Tinggi Badan " + tinggi + "cm tidak cukup. Minimal Tinggi Badan, " + batas + "cm Untuk melanjutkan tes berikutnya.");
        }
    }
}
