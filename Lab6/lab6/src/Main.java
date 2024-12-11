import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів квіток з інформацією про їхню назву, ціну, кількість та вагу
        Flower orchid = new Flower("Orchid", 10.0, 2, 1.4);
        Flower tulip = new Flower("Tulip", 4.0, 3, 1.1);
        Flower rose = new Flower("Rose", 5.0, 2, 1.2);
        Flower lily = new Flower("Lily", 6.0, 1, 1.5);

        // Створення FlowerSet, який містить набір доступних квіток
        FlowerSet flowerSet = new FlowerSet();
        flowerSet.add(orchid);  // Додавання орхідеї до набору
        flowerSet.add(tulip);   // Додавання тюльпана до набору
        flowerSet.add(rose);    // Додавання троянди до набору
        flowerSet.add(lily);    // Додавання лілії до набору

        // Створення об'єкта букета, до якого будуть додаватися квітки
        Bouquet bouquet = new Bouquet();

        // Створення сканера для отримання вводу від користувача
        Scanner scanner = new Scanner(System.in);
        String continueAdding = null;  // Змінна для визначення, чи користувач хоче додавати ще квітки

        // Привітання користувача та виведення доступних квіток
        System.out.println("Welcome to the Flower Bouquet Creator!");
        System.out.println("Available flowers:");
        for (Flower flower : flowerSet.getFlowers()) {  // Перебір всіх квіток у FlowerSet
            System.out.println(flower);  // Виведення інформації про кожну квітку
        }

        // Додавання квіток до букета
        do {
            System.out.println("\nChoose a flower to add to the bouquet:");  // Запит на вибір квітки
            String flowerName = scanner.nextLine().toLowerCase();  // Вводиться назва квітки користувачем (все в нижньому регістрі)

            // Перевірка, чи існує квітка з введеним ім'ям
            Flower chosenFlower = null;
            for (Flower flower : flowerSet.getFlowers()) {  // Перебір всіх квіток у FlowerSet
                if (flower.getName().toLowerCase().equals(flowerName)) {  // Порівняння введеного імені квітки з доступними
                    chosenFlower = flower;  // Якщо знайдено, зберігаємо обрану квітку
                    break;
                }
            }

            // Якщо квітка не знайдена, вивести повідомлення про помилку
            if (chosenFlower == null) {
                System.out.println("Flower not found. Please choose a valid flower.");
                continue;  // Пропустити поточну ітерацію і запитати ще раз
            }

            // Запит на введення кількості квіток, яку користувач хоче додати
            System.out.println("How many " + chosenFlower.getName() + "(s) do you want to add?");
            int quantity = Integer.parseInt(scanner.nextLine());  // Отримання кількості від користувача

            // Додавання вибраної квітки з вказаною кількістю до букета
            bouquet.addFlower(chosenFlower, quantity);
            System.out.println(quantity + " " + chosenFlower.getName() + "(s) added to the bouquet.");

            // Запит на додавання ще квітки
            System.out.println("\nWould you like to add another flower? (yes/no)");
            continueAdding = scanner.nextLine().toLowerCase();  // Введення відповіді від користувача

        } while (continueAdding.equals("yes"));  // Якщо користувач хоче додати ще квітку, цикл повторюється

        // Виведення вмісту букета
        System.out.println("\nYour bouquet contains:");
        System.out.println(bouquet);  // Виведення інформації про всі квітки в букеті

        // Виведення загального розміру букета (кількість квіток)
        System.out.println("Size of the bouquet: " + bouquet.size());

        // Закриття сканера після завершення вводу
        scanner.close();
    }
}
