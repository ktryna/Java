import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення об'єктів квіток
        Flower rose = new Flower("Rose", 30.0, 2, 5.0); // Троянда
        Flower tulip = new Flower("Tulip", 40.0, 1, 4.0); // Тюльпан
        Flower lily = new Flower("Lily", 45.0, 3, 6.0); // Лілія

        // Запит діапазону довжини стебел
        System.out.print("Enter the minimum stem length (cm): ");
        double minLength = scanner.nextDouble();
        System.out.print("Enter the maximum stem length (cm): ");
        double maxLength = scanner.nextDouble();

        // Перевірка, які квітки підходять під діапазон
        System.out.println("\nFlowers in the selected length range:");
        ArrayList<Flower> availableFlowers = new ArrayList<>();
        if (rose.isInLengthRange(minLength, maxLength)) {
            availableFlowers.add(rose);
            System.out.println(rose);
        }
        if (tulip.isInLengthRange(minLength, maxLength)) {
            availableFlowers.add(tulip);
            System.out.println(tulip);
        }
        if (lily.isInLengthRange(minLength, maxLength)) {
            availableFlowers.add(lily);
            System.out.println(lily);
        }

        // Створення букета
        Bouquet bouquet = new Bouquet();

        // Запит кількості для кожної квітки, яка підходить до діапазону
        for (Flower flower : availableFlowers) {
            System.out.print("How many " + flower.name + "s would you like to add? ");
            int count = scanner.nextInt();
            bouquet.addFlower(flower, count);
        }

        // Запит, чи хоче користувач додати листівку
        System.out.print("\nWould you like to add a greeting card (yes/no)? ");
        String cardAnswer = scanner.next();
        if (cardAnswer.equalsIgnoreCase("yes")) {
            bouquet.addFlower(new Flower("Greeting Card", 0, 0, 2.0), 1); // Додаємо листівку
        }

        // Виведення вмісту букета та загальної вартості
        bouquet.displayBouquet();
    }
}