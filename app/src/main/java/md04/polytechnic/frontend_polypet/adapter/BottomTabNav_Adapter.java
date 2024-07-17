package md04.polytechnic.frontend_polypet.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import md04.polytechnic.frontend_polypet.fragment.FavouriteFragment;
import md04.polytechnic.frontend_polypet.fragment.HomeFragment;
import md04.polytechnic.frontend_polypet.fragment.MangeFragment;
import md04.polytechnic.frontend_polypet.fragment.ProfileFragment;

public class BottomTabNav_Adapter extends FragmentStateAdapter {
    public BottomTabNav_Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new FavouriteFragment();
            case 2:
                return new MangeFragment();
            default:
                return new ProfileFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

