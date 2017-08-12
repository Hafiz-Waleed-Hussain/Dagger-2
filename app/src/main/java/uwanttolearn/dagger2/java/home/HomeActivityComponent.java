package uwanttolearn.dagger2.java.home;

import android.support.v7.widget.RecyclerView;

import dagger.Component;
import uwanttolearn.dagger2.java.home.adapter.HomeAdapter;
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;

/**
 * Created by waleed on 06/08/2017.
 */
@Component(modules = HomeActivityModule.class)
public interface HomeActivityComponent {

    void inject(HomeActivity homeActivity);
    
}

