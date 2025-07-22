package leetcode;

public class Problem {
    private int id;
    private String title;
    private String difficulty;
    private String status;
    private String notes;

    public Problem(int id, String title, String difficulty, String status, String notes) {
        this.id = id;
        this.title = title;
        this.difficulty = difficulty;
        this.status = status;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }
}
