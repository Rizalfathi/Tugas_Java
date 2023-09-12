public class Barang {
    private String nama;
    private double harga;

    // Constructor
    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Getter for harga
    public double getHarga() {
        return harga;
    }

    // Setter for harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public static void main(String[] args) {
        // Membuat objek barang
        Barang barang1 = new Barang("Buku", 15.000);
        Barang barang2 = new Barang("Pensil", 3.000);

        // Menampilkan informasi barang
        System.out.println("Barang 1: " + barang1.getNama() + " - Harga: rupiah" + barang1.getHarga());
        System.out.println("Barang 2: " + barang2.getNama() + " - Harga: rupiah" + barang2.getHarga());
    }
}