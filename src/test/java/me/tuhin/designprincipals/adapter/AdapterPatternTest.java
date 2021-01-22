package me.tuhin.designprincipals.adapter;

import me.tuhin.designprincipals.adapter.exercise.EmailClient;
import me.tuhin.designprincipals.adapter.exercise.Gmail.GmailClient;
import me.tuhin.designprincipals.adapter.exercise.GmailAdapter;
import me.tuhin.designprincipals.adapter.mosh.CaramelFilter;
import me.tuhin.designprincipals.adapter.mosh.Image;
import me.tuhin.designprincipals.adapter.mosh.ImageView;
import me.tuhin.designprincipals.adapter.mosh.VividFilter;
import me.tuhin.designprincipals.adapter.mosh.filters.Caramel;
import me.tuhin.designprincipals.adapter.telusko.AssignmentWork;
import me.tuhin.designprincipals.adapter.telusko.PenAdapter;
import org.junit.jupiter.api.Test;

class AdapterPatternTest {
    @Test
    void adapterPatternMosh() {
        Image image = new Image();
        ImageView view = new ImageView(image);
        view.apply(new VividFilter());
        //adapter
        view.apply(new CaramelFilter(new Caramel()));
    }

    @Test
    void adapterPatternMoshExercise() {
        EmailClient emailClient = new EmailClient();
        emailClient.addEmailProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }

    @Test
    void adapterPatternTelusko() {
        PenAdapter penAdapter = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork(penAdapter);
        assignmentWork.writeAssignment("Bla Bla Bla");
    }
}
