/*
Паттерн Prototype. Существует набор статей в википедии.
Реализовать процесс раздачи статей по требованию для изменения,
сохраняя исходный вариант для возможного восстановления статьи в исходном виде
 */
package task_8;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArticlesContainer articlesContainerOriginal = new ArticlesContainer();
        articlesContainerOriginal.addArticle("article1");
        articlesContainerOriginal.addArticle("article2");
        articlesContainerOriginal.addArticle("article3");
        System.out.println(articlesContainerOriginal);

        ArticlesContainer articlesContainerClone = (ArticlesContainer) articlesContainerOriginal.clonePrototype();
        articlesContainerClone.changeArticle(0, "000000");
        articlesContainerClone.addArticle("NEW ARTICLE");
        articlesContainerClone.deleteArticle(0);
        System.out.println(articlesContainerOriginal);
        System.out.println(articlesContainerClone);

    }
}
