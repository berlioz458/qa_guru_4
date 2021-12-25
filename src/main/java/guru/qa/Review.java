package guru.qa;

public class Review {
    private int rate = 0;
    private String comment = "";
    private boolean published = false;


    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished() {
        this.published = true;
    }
}
