package sanetna.estabina.demo.gozor;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class item extends AppCompatActivity {
  TabLayout tabLayout;
 int[] tabIcons = {
            R.drawable.tabimage
         ,R.drawable.tabimage
         ,R.drawable.tabimage
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add Fragments to adapter one by one
        adapter.addFragment(new oneFragment(),"شركات");
        adapter.addFragment(new secondFragment(),"تجار");
        adapter.addFragment(new thirdFragment(),"عملاء");
        viewPager.setAdapter(adapter);

         tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

          tabLayout.getTabAt(0).setIcon(tabIcons[0]);
          tabLayout.getTabAt(1).setIcon(tabIcons[1]);
          tabLayout.getTabAt(2).setIcon(tabIcons[2]);

       // setupTabIcons();
    }

    // Adapter for the viewpager using FragmentPagerAdapter
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);

        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
   /* private void setupTabIcons() {
        tabLayout.addTab(tabLayout.newTab().setText("شركات"));
        tabLayout.addTab(tabLayout.newTab().setText("تجار"));
        tabLayout.addTab(tabLayout.newTab().setText("مزارعين"));
       // tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


    }*/

}
