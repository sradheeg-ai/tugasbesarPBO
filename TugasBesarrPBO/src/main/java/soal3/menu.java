package soal3;

public class menu {
    String kodeMenu;
    String namaMenu;
    double harga;
    String kategori;

    // Constructor tanpa parameter
    public menu() {
        this.kodeMenu = "M000";
        this.namaMenu = "Menu Umum";
        this.harga = 0;
        this.kategori = "Umum";
    }

    // Constructor dengan parameter
    public menu(String kodeMenu, String namaMenu,
                double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }

    public void tampilMenu() {
        System.out.println("Kode     : " + kodeMenu);
        System.out.println("Nama     : " + namaMenu);
        System.out.printf("Harga    : Rp%.0f%n", harga);
        System.out.println("Kategori : " + kategori);
    }
}