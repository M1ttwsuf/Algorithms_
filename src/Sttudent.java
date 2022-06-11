public class Sttudent implements Comparable<Sttudent> {
    private String name;
    private int score;

    public Sttudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Sttudent o) {
        return Integer.compare(score, o.score);
    }
}
