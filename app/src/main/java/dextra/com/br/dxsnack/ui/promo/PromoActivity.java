package dextra.com.br.dxsnack.ui.promo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.app.DxSnackApplication;

public class PromoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        ((DxSnackApplication) getApplication()).getAppComponent().inject(this);
    }

}
