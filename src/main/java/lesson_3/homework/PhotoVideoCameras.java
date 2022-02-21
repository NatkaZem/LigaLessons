package lesson_3.homework;

public class PhotoVideoCameras extends Category implements Element, GsmModule {
    private String photoResolution;
    private float weight;

    public PhotoVideoCameras(String iconDescription, String name, String photoResolution, float weight) {
        super(iconDescription, name);
        this.photoResolution = photoResolution;
        this.weight = weight;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public String getPhotoResolution() {
        return photoResolution;
    }

    public void setPhotoResolution(String photoResolution) {
        this.photoResolution = photoResolution;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Характеристики камеры:" +
                " категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", разрешение фото '" + photoResolution + '\'' +
                ", вес " + weight + " g " + '\'';
    }

    @Override
    public String getType() {
        return "Возможность ночной съёмки";
    }

    @Override
    public void click() {
        System.out.println("Включить/выключить режим ночной съёмки");
    }
}
