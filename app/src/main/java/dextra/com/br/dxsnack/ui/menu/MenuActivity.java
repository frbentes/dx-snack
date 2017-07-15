package dextra.com.br.dxsnack.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.app.DxFeedbackView;
import dextra.com.br.dxsnack.app.DxSnackApplication;
import dextra.com.br.dxsnack.model.Snack;
import dextra.com.br.dxsnack.ui.cart.CartActivity;
import dextra.com.br.dxsnack.ui.promo.PromoActivity;

public class MenuActivity extends AppCompatActivity implements MenuView {

    @Inject
    MenuPresenter presenter;

    @BindView(R.id.tb_menu)
    Toolbar toolbar;

    @BindView(R.id.rv_snacks)
    RecyclerView rvSnacks;

    @BindView(R.id.drw_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.nv_menu)
    NavigationView navigationView;

    @BindView(R.id.fv_menu)
    DxFeedbackView feedbackView;

    @BindView(R.id.pb_menu)
    ProgressBar progressBar;

    private ActionBarDrawerToggle drawerToggle;
    private MenuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ((DxSnackApplication) getApplication()).getAppComponent().inject(this);

        ButterKnife.bind(this);

        setupToolbar();
        setupDrawer();
        setupRecyclerView();

        this.presenter.setView(this);
        this.presenter.getSnacks();
    }

    private void setupToolbar() {
        this.setSupportActionBar(this.toolbar);
        if (getSupportActionBar() == null) {
            return;
        }
        this.getSupportActionBar().setDisplayShowTitleEnabled(true);
        //this.getSupportActionBar().setHomeButtonEnabled(true);
        this.getSupportActionBar().setHomeAsUpIndicator(R.drawable.selector_drawer);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle(getString(R.string.activity_title_menu));
    }

    private void setupDrawer() {
        this.drawerToggle = setupDrawerToggle();
        this.drawerLayout.addDrawerListener(drawerToggle);
        this.drawerToggle.syncState();
        this.navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open,
                R.string.drawer_close);
    }

    private void selectDrawerItem(final MenuItem menuItem) {
        menuItem.setChecked(true);
        this.drawerLayout.closeDrawers();
        switch (menuItem.getItemId()) {
            case R.id.drawer_home_item:
                // Nothing to do
                break;
            case R.id.drawer_promo_item:
                showPromoActivity();
                break;
            case R.id.drawer_cart_item:
                showCartActivity();
                break;
        }
    }

    private void showPromoActivity() {
        Intent intent = new Intent(this, PromoActivity.class);
        startActivity(intent);
    }

    private void showCartActivity() {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }

    private void setupRecyclerView() {
        this.adapter = new MenuAdapter();
        final LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        this.rvSnacks.setLayoutManager(llm);
        this.rvSnacks.setAdapter(adapter);
    }

    @Override
    public void loadSnacks(List<Snack> snacks) {

    }

    @Override
    public void showLoading() {
        this.progressBar.setVisibility(View.VISIBLE);
        this.feedbackView.setVisibility(View.GONE);
        this.rvSnacks.setVisibility(View.GONE);
    }

    @Override
    public void hideLoading() {
        this.progressBar.setVisibility(View.GONE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        switch (item.getItemId()) {
            case android.R.id.home:
                openDrawer();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        this.drawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            closeDrawer();
            return;
        }
        super.onBackPressed();
    }

    protected void openDrawer() {
        this.drawerLayout.openDrawer(GravityCompat.START);
    }

    protected void closeDrawer() {
        this.drawerLayout.closeDrawer(GravityCompat.START);
    }

}
