package lab4;

import java.util.List;

public class Sentence implements Component {
    private final List<Component> components;

    // Конструктор, який приймає список компонентів
    public Sentence(List<Component> components) {
        this.components = components;
    }

    // Метод для отримання списку компонентів
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Component component : components) {
            builder.append(component.toString());
        }
        return builder.toString();
    }
}
