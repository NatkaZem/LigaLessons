package lesson_3.homework;

public interface GsmModule {
    default void switchOnOrOfGsmModule(boolean a) {
        if (a) {
            System.out.println("Gsm модуль включен");
        } else System.out.println("Gsm модуль выключен");
    }
}
