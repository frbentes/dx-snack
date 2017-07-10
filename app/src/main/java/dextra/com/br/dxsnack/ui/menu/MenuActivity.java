package dextra.com.br.dxsnack.ui.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.app.DxSnackApplication;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ((DxSnackApplication) getApplication()).getAppComponent().inject(this);
    }

}
