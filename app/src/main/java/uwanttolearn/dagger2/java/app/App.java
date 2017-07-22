package uwanttolearn.dagger2.java.app;

import android.app.Application;

import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;
import uwanttolearn.dagger2.java.repositories.github.GitHubServiceGenerator;

/**
 * Created by waleed on 22/07/2017.
 */

public class App extends Application {

    private static App app;

    private GitHubRepository gitHubRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        gitHubRepository = GitHubRepository.getInstance(GitHubServiceGenerator.gitHubService("https://api.github.com"));
    }


    public static App getApp() {
        return app;
    }

    public GitHubRepository getGitHubRepository() {
        return gitHubRepository;
    }
}
