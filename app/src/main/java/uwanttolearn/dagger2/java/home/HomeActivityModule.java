package uwanttolearn.dagger2.java.home;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by waleed on 06/08/2017.
 */
@Module
public class HomeActivityModule {

    private final Context context;

    public HomeActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    public RecyclerView.LayoutManager layoutManager(){
        return new LinearLayoutManager(context);
    }

}
