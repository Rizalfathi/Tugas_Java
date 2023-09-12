public class Kalkulator {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 5;

        int hasilTambah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;
        double hasilBagi = (double) angka1 / angka2;

        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
}