package uwanttolearn.dagger2.java.home;

import dagger.Component;
import dagger.Subcomponent;
import uwanttolearn.dagger2.java.app.AppComponent;

/**
 * Created by waleed on 31/12/2017.
 */
@Subcomponent(modules = HomeActivityModule.class)
public interface HomeSubComponent {
    void inject(HomeActivity homeActivity);
}
