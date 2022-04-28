package task_8;

import java.util.ArrayList;
import java.util.List;

public class ArticlesContainer implements Prototype {
    public List<Article> articles;

    public ArticlesContainer() {
        articles = new ArrayList<>();
    }

    public ArticlesContainer(List<Article> articles) {
        this.articles = articles;
    }

    public void addArticle(Article article) {
        this.articles.add(article);
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
