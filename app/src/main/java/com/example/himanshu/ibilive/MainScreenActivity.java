package com.example.himanshu.ibilive;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fragment.DiscoverAndMyPostFragment;
import fragment.MapFragment;
import fragment.MyNetworkFragment;
import fragment.RequestsFragment;

/**
 * main activity
 */
public class MainScreenActivity extends AppCompatActivity {

    private TextView tvDiscover, tvMap, tvMyNetwork, tvRequest, tvMyPosts, tvCustomText, tvCustomImage1, tvCustomImage2;
    private ImageView ivBackButton;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        initialization();
        final ViewPager vpPager = (ViewPager) findViewById(R.id.vp_pager);
        vpPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tvDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                tvDiscover.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                tvMap.setBackgroundResource(R.color.colorPrimaryDark); tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                tvCustomText.setText("Discover");
                tvCustomImage1.setBackground(getDrawable(R.drawable.grid_view));
                tvCustomImage2.setBackground(getDrawable(R.drawable.sorti));
                tvCustomImage1.setVisibility(View.VISIBLE);
                tvCustomImage2.setVisibility(View.VISIBLE);
                vpPager.setCurrentItem(0);
            }
        });
        tvMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                tvMap.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark); tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                tvCustomImage1.setVisibility(View.GONE);
                tvCustomImage2.setVisibility(View.GONE);
                tvCustomText.setText("Map Request");
                vpPager.setCurrentItem(1);
            }
        });
        tvMyPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                tvMyPosts.setBackgroundResource(R.color.colorPrimary); tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                tvMap.setBackgroundResource(R.color.colorPrimaryDark); tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                tvCustomText.setText("My Posts");
                tvCustomImage1.setVisibility(View.VISIBLE);
                tvCustomImage2.setVisibility(View.INVISIBLE);
                tvCustomImage1.setBackground(getDrawable(R.drawable.post_filter_icon));
                vpPager.setCurrentItem(2);
            }
        });
        tvRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                tvRequest.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                tvMap.setBackgroundResource(R.color.colorPrimaryDark);
                tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                tvCustomText.setText("New Requests");
                tvCustomImage1.setVisibility(View.GONE);
                tvCustomImage2.setVisibility(View.GONE);
                vpPager.setCurrentItem(3);
            }
        });
        tvMyNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                tvMyNetwork.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                tvMap.setBackgroundResource(R.color.colorPrimaryDark);
                tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                tvCustomImage1.setVisibility(View.GONE);
                tvCustomImage2.setVisibility(View.GONE);
                tvCustomText.setText("My Network");
                vpPager.setCurrentItem(4);
            }
        });
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(final int position) {
                switch (position) {
                    case 0:
                        tvDiscover.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMap.setBackgroundResource(R.color.colorPrimaryDark);
                        tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                        tvCustomText.setText("Discover");
                        tvCustomImage1.setBackground(getDrawable(R.drawable.grid_view));
                        tvCustomImage2.setBackground(getDrawable(R.drawable.sorti));
                        tvCustomImage1.setVisibility(View.VISIBLE);
                        tvCustomImage2.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        tvMap.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                        tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                        tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                        tvCustomImage1.setVisibility(View.GONE);
                        tvCustomImage2.setVisibility(View.GONE);
                        tvCustomText.setText("Map Request");
                        break;
                    case 2:
                        tvMyPosts.setBackgroundResource(R.color.colorPrimary); tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMap.setBackgroundResource(R.color.colorPrimaryDark);
                        tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                        tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                        tvCustomText.setText("My Posts");
                        tvCustomImage1.setVisibility(View.VISIBLE);
                        tvCustomImage2.setVisibility(View.INVISIBLE);
                        tvCustomImage1.setBackground(getDrawable(R.drawable.post_filter_icon));
                        break;
                    case 3:
                        tvRequest.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMap.setBackgroundResource(R.color.colorPrimaryDark);
                        tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                        tvCustomText.setText("New Requests");
                        tvCustomImage1.setVisibility(View.GONE);
                        tvCustomImage2.setVisibility(View.GONE);
                        break;
                    case 4:
                        tvMyNetwork.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMap.setBackgroundResource(R.color.colorPrimaryDark);
                        tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                        tvDiscover.setBackgroundResource(R.color.colorPrimaryDark);
                        tvCustomImage1.setVisibility(View.GONE);
                        tvCustomImage2.setVisibility(View.GONE);
                        tvCustomText.setText("My Network");
                        break;
                    default:
                        tvDiscover.setBackgroundResource(R.color.colorPrimary); tvMyPosts.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMap.setBackgroundResource(R.color.colorPrimaryDark);
                        tvRequest.setBackgroundResource(R.color.colorPrimaryDark);
                        tvMyNetwork.setBackgroundResource(R.color.colorPrimaryDark);
                        tvCustomText.setText("Discover");
                        tvCustomImage1.setBackground(getDrawable(R.drawable.grid_view));
                        tvCustomImage2.setBackground(getDrawable(R.drawable.sorti));
                        tvCustomImage1.setVisibility(View.VISIBLE);
                        tvCustomImage2.setVisibility(View.VISIBLE);
                }
            }
            @Override
            public void onPageScrollStateChanged(final int state) {
            }
        });
        ivBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });
    }

    /**
     * initiallization
     */
    public void initialization() {

        tvDiscover = (TextView) findViewById(R.id.tv_discover);
        tvMap = (TextView) findViewById(R.id.tv_map);
        tvMyPosts = (TextView) findViewById(R.id.tv_myposts);
        tvRequest = (TextView) findViewById(R.id.tv_requests);
        tvMyNetwork = (TextView) findViewById(R.id.tv_mynetwork);

        tvCustomText = (TextView) findViewById(R.id.tv_custom_text);
        tvCustomImage1 = (TextView) findViewById(R.id.tv_custom_textimage1);
        tvCustomImage2 = (TextView) findViewById(R.id.tv_custom_textimage2);

        ivBackButton = (ImageView) findViewById(R.id.iv_back_button);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    /**
     * view pager adapter inner class
     */
    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        /**
         * @param fm fm
         */
        public MyPagerAdapter(final FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(final int position) {
            switch (position) {
                case 0:
                    return new DiscoverAndMyPostFragment(0);
                case 1:
                    return new MapFragment();
                case 2:
                    return new DiscoverAndMyPostFragment(1);
                case 3:
                    return new RequestsFragment();
                case 4:
                    return new MyNetworkFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}