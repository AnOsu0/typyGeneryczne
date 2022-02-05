package lesson;

public class Tester2 {
    public static void main(String[] args) {
     print5Times(5);
     print5Times("Ania");

    }

    private static <T> void print5Times(T t) {
        for (int i = 0; i < 5; i++) {
            System.out.println(t);
        }
    }


}
