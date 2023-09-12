class LogicalTest {
    public static void main(String[] args) {

        String a = "teh";
        String b = "kopi";

        String temp = a;
        a = b;
        b = temp;

        System.out.println("Setelah menukar isi gelas:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}