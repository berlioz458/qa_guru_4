package guru.qa;

public class CodeRun {
    public static void main(String[] args) {
        Article article1 = new Article("Test1", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Article article2 = new Article("Test2", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Article article3 = new Article("Test3", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");


        System.out.println(article1.getArticleInfo());
        System.out.println(article2.getArticleInfo());
        System.out.println(article3.getArticleInfo());

        Review review1 = new Review(5, "Lorem Ipsum");
        review1.setPublished();
        Review review2 = new Review(3, "Bad review");

        System.out.println(review1.getReviewInfo());
        System.out.println(review2.getReviewInfo());
    }
}
