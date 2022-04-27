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

    public List<Article> getArticles() {
        return articles;
    }

    public void changeArticle(int indexOfArticle, String newArticle) {
        this.articles.get(indexOfArticle).changeArticle(newArticle);
    }

    public Object clonePrototype() {
        List<Article> articles = new ArrayList<>(this.articles);
        return new ArticlesContainer(articles);
    }

    @Override
    public String toString() {
        return "ArticlesContainer{" +
                "articles=" + articles +
                '}';
    }
}
