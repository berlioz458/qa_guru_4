package guru.qa;

public class Article {
    private static int counter;
    private final int id;
    private String name;
    private String body;

    public Article(String name, String body) {
        this.name = name;
        this.body = body;
        counter = counter + 1;
        this.id = counter;
    }

    public String getArticleInfo() {
        return "{ id: " + this.id + " name: " + this.name + ", body: " +  this.body + " }";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getCounter() {
        return counter;
    }
}
