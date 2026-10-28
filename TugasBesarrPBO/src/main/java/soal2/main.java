package soal2;

public class main {
    public static void main(String[] args) {
        sepeda sepeda1 = new sepeda(
            "S001", "Gunung", 3, 10000
        );

        sepeda sepeda2 = new sepeda(
            "S002", "Lipat", 5, 15000
        );

        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}