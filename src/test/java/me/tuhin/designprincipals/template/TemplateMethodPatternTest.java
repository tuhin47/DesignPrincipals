package me.tuhin.designprincipals.template;

import lombok.var;
import me.tuhin.designprincipals.template.mosh.TransferMoneyTask;
import org.junit.jupiter.api.Test;

class TemplateMethodPatternTest {

    @Test
    void templateMethodPatternMosh() {
        var task = new TransferMoneyTask();
        task.execute();
    }

}
