package me.tuhin.designprincipals.memento.howtodojava;

import org.junit.jupiter.api.Test;

public class ArticleMementoTest {

    @Test
    public void mementoPattern() {
        Article article = new Article(1, "My Article");
        article.setContent("ABC");      //original content
        System.out.println(article);

        ArticleMemento memento = article.createMemento();   //created immutable memento

        article.setContent("123");      //changed content
        System.out.println(article);

        article.restore(memento);       //UNDO change
        System.out.println(article);    //original content
    }

}
