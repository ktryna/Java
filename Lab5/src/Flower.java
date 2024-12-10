class Flower {
    String name;
    double length;
    int freshness;
    double price;

    // Конструктор для ініціалізації квітки
    public Flower(String name, double length, int freshness, double price) {
        this.name = name;
        this.length = length;
        this.freshness = freshness;
        this.price = price;
    }

    // Метод для перевірки, чи підходить довжина квітки до заданого діапазону
    public boolean isInLengthRange(double minLength, double maxLength) {
        return length >= minLength && length <= maxLength;
    }

    @Override
    public String toString() {
        return "Flower: " + name + ", Length: " + length + " cm, Freshness: " + freshness + ", Price: " + price;
    }
}