package guru.qa;

public class CodeRun {
    public static void main(String[] args) {
        Article article = new Article();

        article.setId(33);
        article.setName("Test");
        article.setBody("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");

        System.out.println(article.getId());
        System.out.println(article.getName());
        System.out.println(article.getBody());

        Review review = new Review();

        review.setRate(5);
        review.setComment("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        review.setPublished();

        System.out.println(review.getRate());
        System.out.println(review.getComment());
        System.out.println(review.isPublished());
    }
}
