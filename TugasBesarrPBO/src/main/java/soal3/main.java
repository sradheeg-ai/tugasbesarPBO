package soal3;

public class main {
    public static void main(String[] args) {
        // Object menggunakan constructor berparameter
        menu menu1 = new menu(
            "MQ1", "Nasi Goreng", 18000, "Makanan"
        );

        menu1.tampilMenu();

        int jumlah = 2;
        System.out.println("Jumlah   : " + jumlah);
        System.out.printf(
            "Total    : Rp%.0f%n",
            menu1.hitungHarga(jumlah)
        );

        System.out.println("----------------------");

        // Object menggunakan constructor tanpa parameter
        menu menu2 = new menu();
        menu2.tampilMenu();
    }
}