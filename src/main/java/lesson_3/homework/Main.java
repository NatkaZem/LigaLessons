package lesson_3.homework;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        for (Object element : storage.getStorage()) {
            System.out.println(element);
        }
    }
}