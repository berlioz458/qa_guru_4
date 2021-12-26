package guru.qa;

public class Review {
    private int rate;
    private String comment;
    private boolean published;

    public Review(int rate, String comment) {
        this.rate = rate;
        this.comment = comment;
    }

    public String getReviewInfo(){
        return "{ rate: " + this.rate + ", comment: " + this.comment + ", published: " + this.published + " }";
    }

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
