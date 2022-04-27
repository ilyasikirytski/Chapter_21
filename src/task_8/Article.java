package task_8;

public class Article {
    public String article;

    public Article(String article) {
        this.article = article;
    }

    public void append(String appendString) {
        this.article = appendString + this.article;
    }

    public void changeArticle(String newArticle) {
        this.article = newArticle;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article='" + article + '\'' +
                '}';
    }
}
