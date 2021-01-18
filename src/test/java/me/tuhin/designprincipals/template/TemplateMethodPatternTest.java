package me.tuhin.designprincipals.template;

import lombok.var;
import me.tuhin.designprincipals.template.exercise.ChatWindow;
import me.tuhin.designprincipals.template.exercise.ToolWindow;
import me.tuhin.designprincipals.template.howtodoinjava.ConcreteWallHouse;
import me.tuhin.designprincipals.template.howtodoinjava.GlassWallHouse;
import me.tuhin.designprincipals.template.howtodoinjava.House;
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
    }

    @Test
    void templateMethodPatternMoshExercise() {
        var toolWindow = new ToolWindow();
        var chatWindow = new ChatWindow();
        chatWindow.close();
        System.out.println();
        toolWindow.close();
    }

    @Test
    void templateMethodPatternHowToDoInJava() {
        System.out.println("Going to build Concrete Wall House");

        House house = new ConcreteWallHouse();
        house.buildhouse();

        System.out.println("Concrete Wall House constructed successfully");

        System.out.println("********************");

        System.out.println("Going to build Glass Wall House");

        house = new GlassWallHouse();
        house.buildhouse();

        System.out.println("Glass Wall House constructed successfully");
    }

}
