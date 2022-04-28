/*
Паттерн Prototype. Существует набор статей в википедии.
Реализовать процесс раздачи статей по требованию для изменения,
сохраняя исходный вариант для возможного восстановления статьи в исходном виде
 */
package task_8;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArticlesContainer articlesContainerOriginal = new ArticlesContainer();
        articlesContainerOriginal.addArticle(new Article("article1"));
        articlesContainerOriginal.addArticle(new Article("article2"));
        articlesContainerOriginal.addArticle(new Article("article3"));
        System.out.println(articlesContainerOriginal);

        ArticlesContainer articlesContainerClone = (ArticlesContainer) articlesContainerOriginal.clonePrototype();
        articlesContainerClone.changeArticle(0, "000000");
        System.out.println(articlesContainerClone);

        System.out.println(articlesContainerOriginal);

    }
}
