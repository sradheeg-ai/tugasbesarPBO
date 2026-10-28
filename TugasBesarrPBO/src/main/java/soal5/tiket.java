package soal5;

public class tiket {
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public tiket(String kodeTiket, String namaFilm,
                 String jenisTiket, double hargaTiket,
                 int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotal() {
        return hargaTiket * jumlahTiket;
    }

    public void tampilData() {
        System.out.println("Kode Tiket : " + kodeTiket);
        System.out.println("Film       : " + namaFilm);
        System.out.println("Jenis Tiket: " + jenisTiket);
        System.out.printf(
            "Harga      : Rp%.0f%n", hargaTiket
        );
        System.out.println("Jumlah     : " + jumlahTiket);
        System.out.printf(
            "Total      : Rp%.0f%n", hitungTotal()
        );
        System.out.println("======================");
    }
}