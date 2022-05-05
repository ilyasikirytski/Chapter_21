package tasks.task_8;

import java.util.ArrayList;
import java.util.List;

public class ArticlesContainer implements Prototype {
    private final List<Article> articles;

    public ArticlesContainer() {
        articles = new ArrayList<>();
    }

    public ArticlesContainer(List<Article> articles) {
        this.articles = articles;
    }

    public void addArticle(String article) {
        this.articles.add(new Article(article));
    }

    public void deleteArticle(int indexOfArticle) {
        this.articles.remove(indexOfArticle);
    }

    public void changeArticle(int indexOfArticle, String newArticle) {
        this.articles.set(indexOfArticle, new Article(newArticle));
    }

    public Object clonePrototype() {
        return new ArticlesContainer(new ArrayList<>(this.articles));
    }

    @Override
    public String toString() {
        return "ArticlesContainer{" +
                "articles=" + articles +
                '}';
    }
}
