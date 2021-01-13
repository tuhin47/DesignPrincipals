package me.tuhin.designprincipals.memento.mosh;

import lombok.Getter;

@Getter
public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }
}
