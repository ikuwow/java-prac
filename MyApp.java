// Same class name as filename
public final class MyApp {

    // How to create main method:
    // public static void main(String[] args)
    public static final void main(String[] args) {
        String message = "Hello" + "\tworld\n"; // string is between double quotation
        char charactor = 'a'; // char is between single quotation
        int x = 10;
        long y = 4343L;
        double d = 333_222_444F;
        boolean b = true; // false
        System.out.println(message);

        arrays();
        referenceType();
        sayHi();
        sayHi("Ikuwow");
    }

    public static String sayHi(String name) {
        String message = "Hello, " + name;
        System.out.println(message);
        return message;
    }

    // overload
    public static void sayHi() {
        System.out.println("Hi");
    }

    public static void arrays() {
        /*
        int[] sales;
        sales = new int[3];
        sales[0] = 300;
        sales[1] = 200;
        sales[2] = 100;
        */
        int[] sales = {100, 200, 300};
        for (int i = 0; i < sales.length; i++) {
            System.out.println(sales[i]);
        }
        for (int sale : sales) {
            System.out.println(sale);
        }

    }

    public static void referenceType() {

        // integer
        int[] a = {80, 90, 100};
        int[] b = a; // reference substitution
        a[1] = 20;
        System.out.println(a[1]);
        System.out.println(b[1]);

        // string
        String c = "hogehoge";
        String d = c;
        d = "mogmog"; // another memory allocated
        System.out.println(c);
        System.out.println(d);
    }
}
