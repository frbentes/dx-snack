package dextra.com.br.dxsnack.app;

import android.app.Application;

import dextra.com.br.dxsnack.dagger.AppComponent;
import dextra.com.br.dxsnack.dagger.DaggerAppComponent;

public class DxSnackApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        this.appComponent = initDagger();
    }

    protected AppComponent initDagger() {
        return DaggerAppComponent.builder().build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
