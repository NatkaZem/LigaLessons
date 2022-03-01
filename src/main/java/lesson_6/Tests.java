package lesson_6;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Tests {
    public static void main(String[] args) {
        System.out.println();
        test_1();
        System.out.println();
        System.out.println();
        test_2();
        System.out.println();
        System.out.println();
        test_3();
        System.out.println();
        System.out.println();
        test_4();
        System.out.println();
        System.out.println();
        test_5();
        System.out.println();
        System.out.println();
        test_6();
        System.out.println();
        System.out.println();
        test_8();
        System.out.println();
        System.out.println();
    }

    /**
     * Получить List чисел в виде текстовых элементов
     */
    public static void test_1() {
        List<Integer> integerList = getIntList();
        integerList.stream()
                .map(integer -> getStringList().get(integer - 1))
                .forEach(item -> System.out.print(item + " "));
    }

    /**
     * Отсортировать список по убыванию
     */
    public static void test_2() {
        List<Integer> integerList = getIntList();
        integerList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(item -> System.out.print(item + " "));
    }

    /**
     * Получить одну строку текста. Каждый элемент должен начинаться с текста "Number - ".
     * Элементы должны разделяться запятой и пробелом.
     * В начале итоговой строки должен быть текст "Number list: "
     * В конце итоговой строки должен быть текст "end of list.".
     */
    public static void test_3() {
        List<String> stringList = getStringList();
        List<String> list1 = stringList.stream()
                .map(item -> "Number - " + item)
                .collect(Collectors.toList());

        System.out.print("Number list: " + list1 + ", end of list.");
    }

    /**
     * Получить мапу со значениями, ключи которых больше трех и меньше девяти
     */
    public static void test_4() {
        Map<Integer, String> map = getMap();
        map.entrySet().stream()
                .filter(integerStringEntry -> integerStringEntry.getKey() > 3 && integerStringEntry.getKey() < 9)
                .forEach(integerStringEntry -> System.out.print(integerStringEntry + " "));
    }

    /**
     * Перемешать все элементы в мапе.
     * Пример результата:
     * Элемент 1: ключ - 5, значение "five"
     * Элемент 2: ключ - 7, значение "seven"
     * Элемент 3: ключ - 2, значение "two"
     * и так далее.
     */
    public static void test_5() {
        Map<Integer, String> map = getMap();
        AtomicInteger count = new AtomicInteger();
        new HashSet<>(map.entrySet())
                .forEach(item -> System.out.println("Элемент " + getIntList().get(count.getAndIncrement()) + ": ключ - " + item.getKey() + ", значение " + item.getValue()));
    }

    /**
     * Установить во всех элементах isDisplayed = true, и оставить в списке только элементы с value NULL.
     */
    public static void test_6() {
        List<WebElement> elements = getElements();
        elements.stream()
                .peek(webElement -> webElement.setDisplayed(true))
                .filter(webElement -> webElement.getValue() == null)
                .forEach(System.out::println);
    }

    /**
     * Инвертировать isDisplayed параметр каждого элемента и отсортировать список по типу элемента
     * со следующим приоритетом:
     * 1. TEXT
     * 2. INPUT_FIELD
     * 3. CHECKBOX
     * 4. BUTTON
     * 5. RADIO_BUTTON
     * 6. IMAGE
     */
    public void test_7() {
        List<WebElement> elements = getElements();
    }

    /**
     * Создать мапу:
     * ключ - текст
     * значение - тип элемента
     */
    public static void test_8() {
        List<WebElement> elements = getElements();
        elements.stream()
                .collect(Collectors.toMap(WebElement::getText, WebElement::getType, (oldValue, newValue) -> newValue))
                .forEach((key, value) -> System.out.println(key + " - " + value));
    }

    /**
     * Получить список элементов, у которых текст или значение оканчивается на число от 500 и более.
     * И отсортировать по увеличению сначала элементы с текстом, а затем по убыванию элементы со значением.
     */
    public void test_9() {
        List<WebElement> elements = getElements();
    }

    public static Map<Integer, String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        return map;
    }

    public static List<String> getStringList() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        return list;
    }

    public static List<Integer> getIntList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }

    public static List<WebElement> getElements() {
        List<WebElement> result = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            result.add(new WebElement());
        }
        return result;
    }
}
