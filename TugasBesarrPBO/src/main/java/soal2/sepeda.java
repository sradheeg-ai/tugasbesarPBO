package soal2;

public class sepeda {
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    public sepeda(String kodeSepeda, String jenisSepeda,
                  int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    public void tampilData() {
        System.out.println("Kode Sepeda : " + kodeSepeda);
        System.out.println("Jenis Sepeda: " + jenisSepeda);
        System.out.println("Lama Sewa   : " + lamaSewa + " jam");
        System.out.printf("Harga/Jam   : Rp%.0f%n", hargaPerJam);
        System.out.printf("Total Biaya : Rp%.0f%n", hitungBiaya());
        System.out.println("----------------------");
    }
}