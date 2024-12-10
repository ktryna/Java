// Клас для лілій, наслідує Flower
class Lily extends Flower {
    // Конструктор для лілії, додаємо ціна за замовчуванням
    public Lily(double stemLength, int freshness) {
        // Передаємо всі параметри в конструктор Flower, ціна для лілії за замовчуванням 6.0
        super("Lily", stemLength, freshness, 6.0);
    }
}
