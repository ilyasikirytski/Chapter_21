package task_8;

public class Article {
    public String article;

    public Article(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article='" + article + '\'' +
                '}';
    }
}
