package lesson_3.homework;

public class OfficeEquipment extends Category implements Element {
    private int weight;
    private String material;
    private String producingСountry;

    public OfficeEquipment(String iconDescription, String name, int weight, String material, String producingСountry) {
        super(iconDescription, name);
        this.weight = weight;
        this.material = material;
        this.producingСountry = producingСountry;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getProducingСountry() {
        return producingСountry;
    }

    public void setProducingСountry(String producingСountry) {
        this.producingСountry = producingСountry;
    }

    @Override
    public String toString() {
        return "Характеристики офисной техники:" +
                " категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", вес " + weight + " g " +
                ", материал '" + material + '\'' +
                ", страна-производитель '" + producingСountry + '\'';
    }

    @Override
    public String getType() {
        return "Использование принтера как ксерокса и сканера";
    }

    @Override
    public void click() {
        System.out.println("Запустили сканирование документа");
    }
}
