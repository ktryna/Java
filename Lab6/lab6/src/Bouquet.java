import java.util.LinkedList;
import java.util.List;

public class Bouquet {
    // Список елементів букета (кожен елемент містить квітку і кількість)
    private List<BouquetItem> bouquetItems;

    // Конструктор, що ініціалізує порожній список для зберігання елементів букета
    public Bouquet() {
        bouquetItems = new LinkedList<>();  // Використовуємо LinkedList для зберігання елементів букета
    }

    // Метод для додавання квітки до букета
    public void addFlower(Flower flower, int quantity) {
        // Перевіряємо, чи квітка вже є в букеті
        for (BouquetItem item : bouquetItems) {
            if (item.getFlower().equals(flower)) {  // Якщо квітка вже є в букеті
                item.setQuantity(item.getQuantity() + quantity);  // Збільшуємо її кількість
                return;
            }
        }
        // Якщо квітка ще не додана до букета, додаємо її
        bouquetItems.add(new BouquetItem(flower, quantity));
    }

    // Метод для отримання всіх елементів букета
    public List<BouquetItem> getBouquetItems() {
        return bouquetItems;  // Повертає список елементів букета
    }

    // Метод для отримання розміру букета (кількість елементів в букеті)
    public int size() {
        return bouquetItems.size();  // Повертає кількість елементів (квіток) у букеті
    }

    // Перевизначення методу toString для коректного виведення інформації про букет
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bouquet contains:\n");
        // Перебір всіх елементів букета і додавання їх в рядок
        for (BouquetItem item : bouquetItems) {
            sb.append(item.getFlower().getName() + " (" + item.getQuantity() + " pcs)\n");
        }
        return sb.toString();  // Повертає рядок з інформацією про букет
    }
}
