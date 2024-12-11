public class BouquetItem {
    // Поля класу, які зберігають інформацію про окрему квітку в букеті
    private Flower flower;     // Об'єкт класу Flower, що представляє конкретну квітку
    private int quantity;      // Кількість цієї квітки в букеті

    // Конструктор для ініціалізації об'єкта BouquetItem
    public BouquetItem(Flower flower, int quantity) {
        this.flower = flower;    // Присвоюємо квітку
        this.quantity = quantity; // Присвоюємо кількість квіток
    }

    // Геттер для отримання квітки
    public Flower getFlower() {
        return flower; // Повертає об'єкт Flower, що представляє цю квітку
    }

    // Геттер для отримання кількості квіток
    public int getQuantity() {
        return quantity; // Повертає кількість квіток
    }

    // Сеттер для зміни кількості квіток
    public void setQuantity(int quantity) {
        this.quantity = quantity; // Оновлює кількість квіток
    }
}
