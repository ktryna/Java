import java.util.Scanner;

public class StringManipulation {

    // Метод для видалення найбільшого підрядка з тексту, що починається і закінчується заданими літерами
    public static String removeSubstring(String text, char startLetter, char endLetter) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Текст не може бути порожнім або null");
        }

        int startIndex = -1;
        int endIndex = -1;
        int maxLength = 0;

        // Пошук найбільшого підрядка, що починається на startLetter і закінчується на endLetter
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == startLetter) {
                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(j) == endLetter) {
                        int length = j - i + 1;
                        if (length > maxLength) {
                            maxLength = length;
                            startIndex = i;
                            endIndex = j;
                        }
                    }
                }
            }
        }

        // Якщо підрядок знайдений, видаляємо його
        if (startIndex != -1 && endIndex != -1) {
            return text.substring(0, startIndex) + text.substring(endIndex + 1);
        }

        // Якщо підрядка не знайдено, повертаємо текст без змін
        return text;
    }

    public static void main(String[] args) {
        // Створення сканера для введення даних користувачем
        Scanner scanner = new Scanner(System.in);

        // Запит користувача на введення тексту
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        // Запит користувача на введення літер для початку та кінця підрядка
        System.out.println("Введіть літеру, з якої починається підрядок для видалення:");
        char startLetter = scanner.next().charAt(0);

        System.out.println("Введіть літеру, якою закінчується підрядок для видалення:");
        char endLetter = scanner.next().charAt(0);

        // Виведення початкового тексту
        System.out.println("Початковий текст: " + text);

        try {
            // Викликаємо метод для обробки тексту
            String result = removeSubstring(text, startLetter, endLetter);
            System.out.println("Результат: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } finally {
            // Закриття сканера
            scanner.close();
        }
    }
}
