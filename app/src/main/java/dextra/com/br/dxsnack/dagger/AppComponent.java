package dextra.com.br.dxsnack.dagger;

import javax.inject.Singleton;

import dagger.Component;
import dextra.com.br.dxsnack.ui.cart.CartActivity;
import dextra.com.br.dxsnack.ui.cart.CartPresenterImpl;
import dextra.com.br.dxsnack.ui.promo.PromoActivity;
import dextra.com.br.dxsnack.ui.promo.PromoPresenterImpl;
import dextra.com.br.dxsnack.ui.menu.MenuActivity;
import dextra.com.br.dxsnack.ui.menu.MenuPresenterImpl;
import dextra.com.br.dxsnack.ui.snack.SnackActivity;
import dextra.com.br.dxsnack.ui.snack.SnackPresenterImpl;

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(MenuActivity target);
    void inject(SnackActivity target);
    void inject(PromoActivity target);
    void inject(CartActivity target);
    void inject(MenuPresenterImpl target);
    void inject(SnackPresenterImpl target);
    void inject(PromoPresenterImpl target);
    void inject(CartPresenterImpl target);
}
