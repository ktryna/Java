import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixOperations {
    
    // Метод для обчислення матричного добутку
    public static int[][] multiplyMatrices(int[][] A, int[][] B) throws IllegalArgumentException {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        
        // Перевірка на коректність розмірів матриць для добутку
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Кількість стовпців матриці A повинна дорівнювати кількості рядків матриці B.");
        }
        
        int[][] C = new int[rowsA][colsB];
        
        // Множення матриць
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // Метод для обчислення суми найменших елементів кожного рядка
    public static int sumOfMinElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            int min = row[0];
            for (int elem : row) {
                if (elem < min) {
                    min = elem;
                }
            }
            sum += min;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть розмір матриці A (рядки та стовпці):");
            int rowsA = scanner.nextInt();
            int colsA = scanner.nextInt();
            System.out.println("Введіть розмір матриці B (рядки та стовпці):");
            int rowsB = scanner.nextInt();
            int colsB = scanner.nextInt();

            // Ініціалізація матриць
            int[][] A = new int[rowsA][colsA];
            int[][] B = new int[rowsB][colsB];

            // Введення елементів матриці A
            System.out.println("Введіть елементи матриці A:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }

            // Введення елементів матриці B
            System.out.println("Введіть елементи матриці B:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    B[i][j] = scanner.nextInt();
                }
            }

            // Обчислення матричного добутку
            int[][] C = multiplyMatrices(A, B);
            System.out.println("Результат матричного добутку C:");
            for (int[] row : C) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }

            // Обчислення суми найменших елементів
            int sum = sumOfMinElements(C);
            System.out.println("Сума найменших елементів кожного рядка матриці C: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Помилка введення: введіть коректні цілі числа.");
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Невідома помилка: " + e.getMessage());
        }
    }
}
