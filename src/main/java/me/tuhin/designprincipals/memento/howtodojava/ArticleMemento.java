package me.tuhin.designprincipals.memento.howtodojava;

import lombok.Getter;

@Getter
public final class ArticleMemento
{
    private final long id;
    private final String title;
    private final String content;

    public ArticleMemento(long id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }

}
