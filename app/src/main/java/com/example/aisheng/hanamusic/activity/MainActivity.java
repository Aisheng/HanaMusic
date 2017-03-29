package com.example.aisheng.hanamusic.activity;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.aisheng.hanamusic.R;
import com.example.aisheng.hanamusic.adapter.MenuItemAdapter;
import com.example.aisheng.hanamusic.handler.HandlerUtil;
import com.example.aisheng.hanamusic.service.MusicPlayer;
import com.example.aisheng.hanamusic.widget.SplashScreen;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ActionBar ab;
    private ImageView barnet, barmusic, barfriends, search;
    private ArrayList<ImageView> tabs = new ArrayList<>();
    private DrawerLayout drawerLayout;
    private ListView mLvLeftMenu;
    private long time = 0;
    private SplashScreen splashScreen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        splashScreen = new SplashScreen(this);
        splashScreen.show(R.drawable.art_login_bg,
                SplashScreen.SLIDE_LEFT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.color.background_material_light_1);


        barnet = (ImageView) findViewById(R.id.bar_net);
        barmusic = (ImageView) findViewById(R.id.bar_music);
        barfriends = (ImageView) findViewById(R.id.bar_friends);
        search = (ImageView) findViewById(R.id.bar_search);
        barmusic = (ImageView) findViewById(R.id.bar_music);
        drawerLayout = (DrawerLayout) findViewById(R.id.fd);
        mLvLeftMenu = (ListView) findViewById(R.id.id_lv_left_menu);

        setToolBar();
        setUpDrawer();
        HandlerUtil.getInstance(this).postDelayed(new Runnable() {
            @Override
            public void run() {
                splashScreen.removeSplashScreen();
            }
        }, 3000);
    }


    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setTitle("");
    }

    private void setUpDrawer() {
        LayoutInflater inflater = LayoutInflater.from(this);
        mLvLeftMenu.addHeaderView(inflater.inflate(R.layout.nav_header_main, mLvLeftMenu, false));
        mLvLeftMenu.setAdapter(new MenuItemAdapter(this));
        mLvLeftMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        drawerLayout.closeDrawers();
                        break;
                    case 2:
//                        CardPickerDialog dialog = new CardPickerDialog();
//                        dialog.setClickListener(MainActivity.this);
//                        dialog.show(getSupportFragmentManager(), "theme");
//                        drawerLayout.closeDrawers();

                        break;
                    case 3:
//                        TimingFragment fragment3 = new TimingFragment();
//                        fragment3.show(getSupportFragmentManager(), "timing");
//                        drawerLayout.closeDrawers();

                        break;
                    case 4:
//                        BitSetFragment bfragment = new BitSetFragment();
//                        bfragment.show(getSupportFragmentManager(), "bitset");
//                        drawerLayout.closeDrawers();

                        break;
                    case 5:
//                        if (MusicPlayer.isPlaying()) {
//                            MusicPlayer.playOrPause();
//                        }
//                        unbindService();
//                        finish();
//                        drawerLayout.closeDrawers();

                }
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle item selection
        switch (item.getItemId()) {
            case android.R.id.home: //Menu icon
                drawerLayout.openDrawer(Gravity.LEFT);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * 双击返回桌面
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - time > 1000)) {
                Toast.makeText(this, "再按一次返回桌面", Toast.LENGTH_SHORT).show();
                time = System.currentTimeMillis();
            } else {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
            }
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }

    }
}
