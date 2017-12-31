package uwanttolearn.dagger2.java.app;

import dagger.Component;
import uwanttolearn.dagger2.java.home.HomeActivityModule;
import uwanttolearn.dagger2.java.home.HomeSubComponent;

/**
 * Created by waleed on 31/12/2017.
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    HomeSubComponent plus(HomeActivityModule homeActivityModule);
}
