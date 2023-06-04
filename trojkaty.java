class Trojkaty {
    /**
     * Główna funkcja programu.
     * @param {float} a - Długość pierwszego boku.
     * @param {float} b - Długość drugiegio boku.
     * @param {float} c - Długość trzeciego boku.
     */
    public static void jakiTrojkat(float a, float b, float c) {
        if (a == b && b == c) {
            System.out.println("Trójkąt równoboczny");
        } else if (a == b || a == c || b == c) {
            System.out.println("Trojkat rownoramienny");

        } else if (a * a + b * b == c * c || c * c + b * b == a * a || a * a + c * c == b * b) {
            System.out.println("Trojkat prostokatny");
        } else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Trojkat nie istnieje");
        } else {
            System.out.println("Zwykly, nudny trojkat");
        }
    }

    // Wyświetla ekran pomocy
    public static void pomoc() {
        System.out.println("Acme INC. (C) 2022");
        System.out.println("Program do rozpoznawania rodzaju trójkąta");
        System.out.println("Uruchom z trzema argumentami liczbowymi - długość boków trójkąta");
    }

    // Glowna funkcja
    public static void main(String... args) {
        if (args.length != 3) {
            pomoc();
            System.exit(1);
        }
        float a = Float.valueOf(args[0]);
        float b = Float.valueOf(args[1]);
        float c = Float.valueOf(args[2]);

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Długości boków trójkąta muszą być nieujemne!");
            System.exit(2);
        }

        jakiTrojkat(a, b, c);
    }
}
