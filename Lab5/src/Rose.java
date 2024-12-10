// Клас для троянд, наслідує Flower
class Rose extends Flower {
    // Конструктор для троянди
    public Rose(double stemLength, int freshness) {
        // Вказуємо фіксовану ціну для троянди
        super("Rose", stemLength, freshness, 5.0); // Ціна для троянди 5.0
    }
}