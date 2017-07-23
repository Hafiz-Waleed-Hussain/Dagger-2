package uwanttolearn.dagger2.java.app;

import android.app.Application;

import com.bumptech.glide.Glide;

import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;
import uwanttolearn.dagger2.java.repositories.github.GitHubServiceGenerator;

/**
 * Created by waleed on 22/07/2017.
 */

public class App extends Application {

    private static App app;

    private GitHubRepository gitHubRepository;
    private Glide glide;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        gitHubRepository = GitHubRepository.getInstance(GitHubServiceGenerator.gitHubService("https://api.github.com"));
        glide = Glide.get(this);
    }


    public static App getApp() {
        return app;
    }

    public GitHubRepository getGitHubRepository() {
        return gitHubRepository;
    }

    public Glide getGlide() {
        return glide;
    }
}
