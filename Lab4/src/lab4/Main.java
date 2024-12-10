package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення тексту
        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();

        // Введення літератур, що мають бути на початку та в кінці підрядка
        System.out.println("Введіть початкову та кінцеву літери підрядка:");
        char startLetter = scanner.next().charAt(0);
        char endLetter = scanner.next().charAt(0);

        // Розбиваємо текст на речення
        String[] rawSentences = inputText.split("(?<=[.!?])\\s+");
        List<String> modifiedSentences = new ArrayList<>();

        // Обробка кожного речення
        for (String rawSentence : rawSentences) {
            // Видаляємо найбільший підрядок між заданими літерами
            String modifiedSentence = removeSubstring(rawSentence, startLetter, endLetter);
            modifiedSentences.add(modifiedSentence);
        }

        // Виведення результату
        System.out.println("Текст після модифікації:");
        for (String sentence : modifiedSentences) {
            System.out.println(sentence);
        }
    }

    // Метод для видалення найбільшого підрядка, що починається та закінчується заданими літерами
    private static String removeSubstring(String sentence, char startLetter, char endLetter) {
        int startIndex = -1;
        int endIndex = -1;
        int maxLength = 0;

        // Знаходимо підрядок найбільшої довжини, що починається та закінчується заданими літерами
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == startLetter) {
                for (int j = i + 1; j < sentence.length(); j++) {
                    if (sentence.charAt(j) == endLetter) {
                        // Зберігаємо індекси, якщо довжина підрядка більше за попередній
                        if (j - i > maxLength) {
                            startIndex = i;
                            endIndex = j;
                            maxLength = j - i;
                        }
                    }
                }
            }
        }

        // Якщо знайдено підрядок, видаляємо його
        if (startIndex != -1 && endIndex != -1) {
            // Перевіряємо, чи є пробіли навколо видаленого підрядка, щоб не порушити структуру
            String before = sentence.substring(0, startIndex).trim();
            String after = sentence.substring(endIndex + 1).trim();

            // Повертаємо текст без цього підрядка, зберігаючи пробіли між словами
            if (!before.isEmpty() && !after.isEmpty()) {
                return before + " " + after;
            } else if (!before.isEmpty()) {
                return before;
            } else {
                return after;
            }
        }

        return sentence; // Повертаємо речення без змін, якщо підрядок не знайдено
    }
}
