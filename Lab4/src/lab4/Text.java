package lab4;

import java.util.List;

public class Text {
    private List<Sentence> sentences;

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Sentence sentence : sentences) {
            text.append(sentence.toString()).append(" ");
        }
        return text.toString().trim();
    }
}

