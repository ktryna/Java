import java.util.HashSet;
import java.util.Set;

public class FlowerSet {
    // Колекція для зберігання квіток (використовується HashSet для унікальності елементів)
    private Set<Flower> flowers;

    // Конструктор, що ініціалізує порожній набір квіток
    public FlowerSet() {
        flowers = new HashSet<>();  // Використовуємо HashSet для зберігання квіток без повторів
    }

    // Метод для додавання квітки до набору
    public void add(Flower flower) {
        flowers.add(flower);  // Додає квітку до набора
    }

    // Метод для перевірки, чи є певна квітка в наборі
    public boolean contains(Flower flower) {
        return flowers.contains(flower);  // Перевіряє наявність квітки в наборі
    }

    // Метод для отримання всіх квіток з набору
    public Set<Flower> getFlowers() {
        return flowers;  // Повертає набір квіток
    }
}
