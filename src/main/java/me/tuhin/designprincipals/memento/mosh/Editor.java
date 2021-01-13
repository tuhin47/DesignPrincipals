package me.tuhin.designprincipals.memento.mosh;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }
    public void restore(EditorState editorState) {
        content = editorState.getContent();
    }
}
