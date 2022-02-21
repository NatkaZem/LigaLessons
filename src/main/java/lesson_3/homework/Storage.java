package lesson_3.homework;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Category> categories  = new ArrayList();

    static {
        categories.add(new Computers("Компьютер", "HP", "IntelCore-i5", 480, 16));
        categories.add(new Computers("Компьютер", "Asus", "IntelCore-i7", 240, 8, "Gforce-1060"));
        categories.add(new Smartphones("Смартфоны", "Samsung", 5000, 6.6f, 4, "Android"));
        categories.add(new Smartphones("Смартфоны", "Apple", 6000, 6.6f, 4, "OS", "есть NFC"));
        categories.add(new TVSets("Телевизор", "Витязь", 50, 3));
        categories.add(new TVSets("Телевизор", "LG", 70, 3, "есть SmartTV"));
        categories.add(new Tablets("Планшет", "Xiaomy", 3000, 7, 1, "Android"));
        categories.add(new Tablets("Планшет", "Huawei", 3000, 8, 1, "Android", "есть GPS"));
        categories.add(new SmartWatches("Смартчасы", "KREZ Bluez", 170, 45, 1.44f));
        categories.add(new SmartWatches("Смартчасы", "Apple", 309, 32, 1.57f, "есть навигация"));
        categories.add(new PhotoVideoCameras("Фото и видеокамеры", "Rekam DVC-360", "5616x3744", 186));
        categories.add(new PhotoVideoCameras("Фото и видеокамеры", "Panasonic HC-V760", "1920х1080", 350));
        categories.add(new Laptops("Ноутбук", "Asus L210MA-GJ243T", "Intel Celeron", 256, 4, "есть видеокарта", "Windows"));
        categories.add(new Laptops("Ноутбук", "Lenovo IdeaPad 3", "Intel Pentium Gold", 512, 8, "есть видеокарта", "Windows"));
        categories.add(new AccessoriesForSmartphones("Аксессуары для смартфонов", "Держатель для телефона", "черный", "пластик"));
        categories.add(new AccessoriesForSmartphones("Аксессуары для смартфонов", "Защитное стекло", "прозрачный", "силикон"));
        categories.add(new Headphones("Наушники", "Defender Twins 638", "внутриканальные", "Китай"));
        categories.add(new Headphones("Наушники", "Audeze LCD-MX4", "полноразмерные", "США"));
        categories.add(new OfficeEquipment("Офисное оборудование", "Принтер E478", 784, "пластик", "Китай"));
        categories.add(new OfficeEquipment("Офисное оборудование", "МФУ Струйное", 3420, "пластик", "Китай"));
        categories.add(new CleverHomeAndSecurity("Умный дом и безопасность", "Умная лампочка Яндекс YNDX-00010", "белый", 190, "Китай", "Светодиодная"));
        categories.add(new CleverHomeAndSecurity("Умный дом и безопасность", "Камера видеонаблюдения IP 3S-IPC-Q200L", "бeлый", 220, "Китай", 1296));
        categories.add(new GamesAndConsols("Игры и консоли", "Геймпад Dendy", "серый", "Китай"));
        categories.add(new GamesAndConsols("Игры и консоли", "Игровая приставка THE HOMESTORE", "черный", "Китай"));
    }

    public List getStorage() {
        return categories;
    }
}
