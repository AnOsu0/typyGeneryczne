package example1;

public class Test {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(8, "Mariusz");
        Pair<Double, String> pair2 = new Pair<>(2.7,"Ania");
        Pair<Integer,Double> pair3 = new Pair<>(1,3.4);
        Pair.PrintInfo(pair1);
        Pair.PrintInfo(pair2);
        Pair.PrintInfo(pair3);
    }
}
