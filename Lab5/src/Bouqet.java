import java.util.*;

class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<>();
    private double totalPrice;

    // Додаємо квітки до букета
    public void addFlower(Flower flower, int count) {
        for (int i = 0; i < count; i++) {
            flowers.add(flower);
            totalPrice += flower.price; // Додаємо ціну квітки до загальної вартості
        }
    }

    // Метод для виведення вмісту букета
    public void displayBouquet() {
        System.out.println("\nYour bouquet:");
        System.out.println("Bouquet contains:");
        for (Flower flower : flowers) {
            System.out.println(flower); // Виводимо кожну квітку з ціною
        }
        System.out.println("Total price: " + totalPrice); // Виводимо загальну вартість
    }
}
