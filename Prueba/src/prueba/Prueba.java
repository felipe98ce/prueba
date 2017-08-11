package prueba;

public class Prueba {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(b + "# for");
            b = b + 1;
            a=0;
            while (a < 100) {
                System.out.println("Hola mundo");
                a = a + 1;
            }
        }
    }
}
