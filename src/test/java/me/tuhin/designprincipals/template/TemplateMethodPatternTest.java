package me.tuhin.designprincipals.template;

import lombok.var;
import me.tuhin.designprincipals.template.exercise.ChatWindow;
import me.tuhin.designprincipals.template.exercise.ToolWindow;
import me.tuhin.designprincipals.template.mosh.TransferMoneyTask;
import me.tuhin.designprincipals.template.mosh.WithdrawMoneyTask;
import org.junit.jupiter.api.Test;

class TemplateMethodPatternTest {

    @Test
    void templateMethodPatternMosh() {
        var task = new TransferMoneyTask();
        var withdraw = new WithdrawMoneyTask();
        withdraw.execute();
        System.out.println();
        task.execute();
        System.out.println();
        //exercise
        var toolWindow = new ToolWindow();
        var chatWindow = new ChatWindow();
        chatWindow.close();
        System.out.println();
        toolWindow.close();
    }

}
