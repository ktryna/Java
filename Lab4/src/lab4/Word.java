package lab4;

import java.util.List;

public class Word implements Component{
    private List<Letter> letters;

    public Word(List<Letter> letters) {
        this.letters = letters;
    }

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.toString());
        }
        return word.toString();
    }
}

