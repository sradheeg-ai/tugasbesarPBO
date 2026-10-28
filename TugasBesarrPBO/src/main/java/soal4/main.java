package soal4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<pemeriksaan> daftar =
            new ArrayList<>();

        daftar.add(new pemeriksaan(
            "P001", "Andi", "Dr. Siti", 150000
        ));

        daftar.add(new pemeriksaan(
            "P002", "Budi", "Dr. Rina", 200000
        ));

        daftar.add(new pemeriksaan(
            "P003", "Citra", "Dr. Siti", 175000
        ));

        double totalSemua = 0;

        for (pemeriksaan p : daftar) {
            p.tampilData();
            totalSemua += p.hitungTotal();
        }

        System.out.printf(
            "Total seluruh biaya pemeriksaan: Rp%.0f%n",
            totalSemua
        );
    }
}