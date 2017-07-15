package dextra.com.br.dxsnack.ui.cart;

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
import dextra.com.br.dxsnack.model.Order;

public class CartActivity extends AppCompatActivity implements CartView {

    @Inject
    CartPresenter presenter;

    @BindView(R.id.tb_cart)
    Toolbar toolbar;

    @BindView(R.id.rv_orders)
    RecyclerView rvOrders;

    @BindView(R.id.fv_cart)
    DxFeedbackView feedbackView;

    @BindView(R.id.pb_cart)
    ProgressBar progressBar;

    private CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ((DxSnackApplication) getApplication()).getAppComponent().inject(this);

        setupToolbar();
        setupRecyclerView();

        this.presenter.setView(this);
        this.presenter.getOrders();
    }

    private void setupToolbar() {
        this.setSupportActionBar(this.toolbar);
        if (getSupportActionBar() == null) {
            return;
        }
        this.getSupportActionBar().setDisplayShowTitleEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(false);
        this.setTitle(getString(R.string.activity_title_cart));
    }

    private void setupRecyclerView() {
        this.adapter = new CartAdapter();
        final LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        this.rvOrders.setLayoutManager(llm);
        this.rvOrders.setAdapter(adapter);
    }

    @Override
    public void loadOrders(List<Order> orders) {

    }

    @Override
    public void showLoading() {
        this.progressBar.setVisibility(View.VISIBLE);
        this.feedbackView.setVisibility(View.GONE);
        this.rvOrders.setVisibility(View.GONE);
    }

    @Override
    public void hideLoading() {
        this.progressBar.setVisibility(View.GONE);
    }

}
