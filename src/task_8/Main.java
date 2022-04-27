/*
Паттерн Prototype. Существует набор статей в википедии.
Реализовать процесс раздачи статей по требованию для изменения,
сохраняя исходный вариант для возможного восстановления статьи в исходном виде
 */
package task_8;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArticlesContainer articlesContainerOriginal = new ArticlesContainer();
        articlesContainerOriginal.addArticle(new Article("article1"));
        articlesContainerOriginal.addArticle(new Article("article2"));
        articlesContainerOriginal.addArticle(new Article("article3"));
        System.out.println(articlesContainerOriginal);

        //почему не могу взаимодействовать через articlesContainerClone ??
        // (прим.articlesContainerClone.changeArticle(0,"000000"); -> тогда меняется и оригинал.
        // что нужно сделать для того, что бы это было возможно?
        ArticlesContainer articlesContainerClone = (ArticlesContainer) articlesContainerOriginal.clonePrototype();
//        articlesContainerClone.changeArticle(0,"000000");
        List<Article> articles = articlesContainerClone.getArticles();
        articles.add(new Article("COPY"));
        articles.remove(articles.get(0));
        articles.remove(0);
        System.out.println(articlesContainerClone);

        System.out.println(articlesContainerOriginal);

    }
}
