package md04.polytechnic.frontend_polypet.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import md04.polytechnic.frontend_polypet.fragment.notificationFrangment.MyFragment;
import md04.polytechnic.frontend_polypet.fragment.notificationFrangment.PolypetFragment;

public class NotificationPagerAdapter extends FragmentPagerAdapter {
    public NotificationPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MyFragment();
            case 1:
                return new PolypetFragment();
            default:
                return new MyFragment();
        }
    }

    @Override
    public int getCount() {
        return 2; // Number of tabs
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Thông báo của tôi";
            case 1:
                return "Thông báo POLYPET";
            default:
                return null;
        }
    }
}

