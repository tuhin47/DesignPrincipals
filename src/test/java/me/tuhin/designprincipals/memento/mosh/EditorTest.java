package me.tuhin.designprincipals.memento.mosh;

import lombok.var;
import org.junit.jupiter.api.Test;

public class EditorTest {
    @Test
    public void testMementoMosh() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}
