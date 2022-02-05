package lesson;

public class Terster {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();
        container.setArray(new Integer[] {5,10,15});
        container.printArray();
        Integer[] array = container.getArray();
        System.out.println(array[0] + array[2]);

        Container<String> strContainer = new Container<>();
        strContainer.setArray(new String[] {"Ania", "Kasia", "Basia"});
        strContainer.printArray();
    }
}
