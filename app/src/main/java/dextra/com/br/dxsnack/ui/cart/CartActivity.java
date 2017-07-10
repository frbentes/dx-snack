package dextra.com.br.dxsnack.ui.cart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.app.DxSnackApplication;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ((DxSnackApplication) getApplication()).getAppComponent().inject(this);
    }

}
