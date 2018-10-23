package tudien_ver2;

public class Word {

    private String wordTarget;
    private String wordExplain;
    // getter

    public String getWordTarget() {
        return wordTarget;
    }

    public String getWordExplain() {
        return wordExplain;
    }
    
    // setter

    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }
 

    // constructor
    public Word(String wordTarget, String wordExplain) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
    }

    public Word() {}

}
