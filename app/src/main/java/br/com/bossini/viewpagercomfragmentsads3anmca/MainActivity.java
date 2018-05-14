package br.com.bossini.viewpagercomfragmentsads3anmca;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    /**
     * Created by viniciu126 on 12/05/18.
     * RA: 816117960
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //busca na árvore depois de inflar
        viewPager = (ViewPager)
                findViewById(R.id.viewPager);
        //pega gerenciador de fragments
        FragmentManager fm =
                getSupportFragmentManager();
        //configura adapter do viewpager
        viewPager.setAdapter(new TabsAdapter(fm));
        //pega a action bar
        final ActionBar actionBar =
                getSupportActionBar();
        //modo de navegação será por abas
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //adiciona abas à action bar
        actionBar.addTab(actionBar.newTab().
                setText("Frag 1").
                setTabListener(new MyTabsListener(viewPager, 0)));
        actionBar.addTab(actionBar.newTab().
                setText("Frag 2").
                setTabListener(new MyTabsListener(viewPager, 1)));
        actionBar.addTab(actionBar.newTab().
                setText("Frag 3").
                setTabListener(new MyTabsListener(viewPager, 2)));
        //para tratar o evento swipe (deslizar)
        viewPager.setOnPageChangeListener(new
                                                  ViewPager.OnPageChangeListener() {
                                                      @Override
                                                      public void onPageScrolled(int position, float
                                                              positionOffset, int positionOffsetPixels) {

                                                      }

                                                      @Override
                                                      public void onPageSelected(int position) {
                                                          Toast.makeText(MainActivity.this, "chamou",
                                                                  Toast.LENGTH_SHORT).show();
                                                          actionBar.setSelectedNavigationItem(position);
                                                      }

                                                      @Override
                                                      public void onPageScrollStateChanged(int state) {

                                                      }
                                                  });
    }
}