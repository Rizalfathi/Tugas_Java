class LatihanInputanGelas {
    public static void main(String[] args) {

        String a = "susu";
        String b = "kopi";

        System.out.println("sebelum pertukaran");
        System.out.println("gelas satu = susu");
        System.out.println("gelas dua = kopi");

        String temp = a;
        a = b;
        b = temp;

        System.out.println("Setelah menukar isi gelas:");
        System.out.println("gelas satu = " + a);
        System.out.println("gelas dua = " + b);
    }
}