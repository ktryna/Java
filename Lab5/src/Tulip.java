// Клас для тюльпанів, наслідує Flower
class Tulip extends Flower {
    // Конструктор для тюльпану
    public Tulip(double stemLength, int freshness) {
        // Вказуємо фіксовану ціну для тюльпану
        super("Tulip", stemLength, freshness, 4.0); // Ціна для тюльпану 4.0
    }
}
