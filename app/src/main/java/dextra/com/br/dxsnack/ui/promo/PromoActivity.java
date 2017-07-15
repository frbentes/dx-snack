package dextra.com.br.dxsnack.ui.promo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.app.DxFeedbackView;
import dextra.com.br.dxsnack.app.DxSnackApplication;
import dextra.com.br.dxsnack.model.Promo;

public class PromoActivity extends AppCompatActivity implements PromoView {

    @Inject
    PromoPresenter presenter;

    @BindView(R.id.tb_promo)
    Toolbar toolbar;

    @BindView(R.id.rv_promos)
    RecyclerView rvPromos;

    @BindView(R.id.fv_promo)
    DxFeedbackView feedbackView;

    @BindView(R.id.pb_promo)
    ProgressBar progressBar;

    private PromoAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        ((DxSnackApplication) getApplication()).getAppComponent().inject(this);

        setupToolbar();
        setupRecyclerView();

        this.presenter.setView(this);
        this.presenter.getPromos();
    }

    private void setupToolbar() {
        this.setSupportActionBar(this.toolbar);
        if (getSupportActionBar() == null) {
            return;
        }
        this.getSupportActionBar().setDisplayShowTitleEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(false);
        this.setTitle(getString(R.string.activity_title_promo));
    }

    private void setupRecyclerView() {
        this.adapter = new PromoAdapter();
        final LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        this.rvPromos.setLayoutManager(llm);
        this.rvPromos.setAdapter(adapter);
    }

    @Override
    public void loadPromos(List<Promo> promos) {

    }

    @Override
    public void showLoading() {
        this.progressBar.setVisibility(View.VISIBLE);
        this.feedbackView.setVisibility(View.GONE);
        this.rvPromos.setVisibility(View.GONE);
    }

    @Override
    public void hideLoading() {
        this.progressBar.setVisibility(View.GONE);
    }

}
