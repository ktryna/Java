package lab4;

public class PunctuationMark implements Component{
    private char mark;

    public PunctuationMark(char mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return Character.toString(mark);
    }
}

