package com.example.aisheng.hanamusic.activity;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.aisheng.hanamusic.R;
import com.example.aisheng.hanamusic.adapter.MenuItemAdapter;
import com.example.aisheng.hanamusic.service.MusicPlayer;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ActionBar ab;
    private ImageView barnet, barmusic, barfriends, search;
    private ArrayList<ImageView> tabs = new ArrayList<>();
    private DrawerLayout drawerLayout;
    private ListView mLvLeftMenu;
    private long time = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.color.background_material_light_1);


        drawerLayout = (DrawerLayout) findViewById(R.id.fd);
        mLvLeftMenu = (ListView) findViewById(R.id.id_lv_left_menu);

        setUpDrawer();
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
}
