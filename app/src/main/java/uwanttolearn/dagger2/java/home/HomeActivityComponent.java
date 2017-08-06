package uwanttolearn.dagger2.java.home;

import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;

import dagger.Component;
import io.reactivex.disposables.Disposable;
import uwanttolearn.dagger2.java.home.adapter.HomeAdapter;
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;

/**
 * Created by waleed on 06/08/2017.
 */
@Component(modules = HomeActivityModule.class)
public interface HomeActivityComponent {

    RecyclerView.LayoutManager getLayoutManager();

}

