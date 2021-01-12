package me.tuhin.designprincipals.memento.howtodojava;

import lombok.Data;

@Data
public class Article
{
    private long id;
    private String title;
    private String content;

    public Article(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }

    //Setters and getters

    public ArticleMemento createMemento()
    {
        return new ArticleMemento(id, title, content);
    }

    public void restore(ArticleMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
    }
}
