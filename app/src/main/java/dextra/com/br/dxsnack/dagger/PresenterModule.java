package dextra.com.br.dxsnack.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dextra.com.br.dxsnack.ui.cart.CartPresenter;
import dextra.com.br.dxsnack.ui.cart.CartPresenterImpl;
import dextra.com.br.dxsnack.ui.promo.PromoPresenter;
import dextra.com.br.dxsnack.ui.promo.PromoPresenterImpl;
import dextra.com.br.dxsnack.ui.menu.MenuPresenter;
import dextra.com.br.dxsnack.ui.menu.MenuPresenterImpl;
import dextra.com.br.dxsnack.ui.snack.SnackPresenter;
import dextra.com.br.dxsnack.ui.snack.SnackPresenterImpl;

@Module
public class PresenterModule {

    @Provides
    @Singleton
    MenuPresenter provideMenuPresenter(Context context) {
        return new MenuPresenterImpl(context);
    }

    @Provides
    @Singleton
    SnackPresenter provideSnackPresenter(Context context) {
        return new SnackPresenterImpl(context);
    }

    @Provides
    @Singleton
    PromoPresenter providePromoPresenter(Context context) {
        return new PromoPresenterImpl(context);
    }

    @Provides
    @Singleton
    CartPresenter provideNoticePresenter(Context context) {
        return new CartPresenterImpl(context);
    }

}
