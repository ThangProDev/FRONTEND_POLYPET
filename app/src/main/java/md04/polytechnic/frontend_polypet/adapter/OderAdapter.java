package md04.polytechnic.frontend_polypet.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import md04.polytechnic.frontend_polypet.fragment.ConfirmFragment;
import md04.polytechnic.frontend_polypet.fragment.DestroyFragment;
import md04.polytechnic.frontend_polypet.fragment.FinishFragment;
import md04.polytechnic.frontend_polypet.fragment.ShippingFragment;
import md04.polytechnic.frontend_polypet.fragment.WaitFragment;

public class OderAdapter extends FragmentStateAdapter {
    public OderAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ConfirmFragment();
            case 1:
                return new WaitFragment();
            case 2:
                return new ShippingFragment();
            case 3:
                return new FinishFragment();
            default:
                return new DestroyFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
