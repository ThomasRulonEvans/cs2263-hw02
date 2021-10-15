package edu.isu.cs.cs2263;

/**
 * @author Thomas Evans
 * @version v2.0.0
 */
public class Course {
    /**
     * initial vars
     */
    private int number;
    private String subject;
    private String title;

    /**
     * Setters / getters
     */
    public  void Course(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return subject + " " + number + " " + title;
    }

}
