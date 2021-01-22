package me.tuhin.designprincipals.adapter.exercise;

import java.util.ArrayList;
import java.util.List;

public class EmailClient {
    private final List<EmailProvider> emailProviders = new ArrayList<>();

    public void addEmailProvider(EmailProvider provider) {
        emailProviders.add(provider);
    }

    public void downloadEmails() {
        for (EmailProvider provider : emailProviders) {
            provider.downloadEmails();
        }
    }
}
