package soal1;

public class main {
    public static void main(String[] args) {
        buku buku1 = new buku(
            "B001", "Pemrograman Java",
            "Andi", 85000
        );

        buku buku2 = new buku(
            "B002", "Dasar OOP",
            "Budi", 75000
        );

        buku1.tampilData();
        buku2.tampilData();
    }
}