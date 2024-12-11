public class Flower {
    // Поля класу, які зберігають характеристики квітки
    private String name;      // Назва квітки
    private double price;     // Ціна квітки
    private int pcs;          // Кількість квіток
    private double weight;    // Вага квітки

    // Конструктор для ініціалізації об'єкта Flower
    public Flower(String name, double price, int pcs, double weight) {
        this.name = name;      // Присвоюємо назву квітки
        this.price = price;    // Присвоюємо ціну квітки
        this.pcs = pcs;        // Присвоюємо кількість квіток
        this.weight = weight;  // Присвоюємо вагу квітки
    }

    // Геттер для отримання назви квітки
    public String getName() {
        return name;  // Повертає назву квітки
    }

    // Геттер для отримання ціни квітки
    public double getPrice() {
        return price;  // Повертає ціну квітки
    }

    // Геттер для отримання кількості квіток
    public int getPcs() {
        return pcs;  // Повертає кількість квіток
    }

    // Геттер для отримання ваги квітки
    public double getWeight() {
        return weight;  // Повертає вагу квітки
    }

    // Сеттер для зміни кількості квіток
    public void setPcs(int pcs) {
        this.pcs = pcs;  // Оновлює кількість квіток
    }

    // Перевизначений метод toString для зручного виведення інформації про квітку
    @Override
    public String toString() {
        return name + " (" + price + ", " + pcs + " pcs, " + weight + " kg)";
        // Повертає рядок з інформацією про квітку в зручному форматі
    }

    // Перевизначений метод equals для порівняння квіток
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Якщо два об'єкти однакові (посилання на один і той самий об'єкт)
        if (obj == null || getClass() != obj.getClass()) return false;  // Якщо об'єкт порівняння порожній або має інший клас
        Flower flower = (Flower) obj;  // Приведення об'єкта до типу Flower
        return name.equals(flower.name);  // Порівнюємо лише назви квіток
    }

    // Перевизначений метод hashCode для правильного використання об'єктів Flower у колекціях, таких як HashSet
    @Override
    public int hashCode() {
        return name.hashCode();  // Генерує hash-код на основі назви квітки
    }
}
