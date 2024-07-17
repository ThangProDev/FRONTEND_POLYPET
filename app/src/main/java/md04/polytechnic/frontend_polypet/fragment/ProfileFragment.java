package md04.polytechnic.frontend_polypet.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import md04.polytechnic.frontend_polypet.R;
import md04.polytechnic.frontend_polypet.screen.AccountActivity;
import md04.polytechnic.frontend_polypet.screen.AddressActivity;
import md04.polytechnic.frontend_polypet.screen.CartActivity;
import md04.polytechnic.frontend_polypet.screen.OderActivity;


public class ProfileFragment extends Fragment {
    TextView tv_taikhoan_baomat, tv_diachi;
    LinearLayout btn_Confirm, btn_Waiting, btn_Shipping,btnRate, ln_oder;
    ImageView btn_Cart;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        tv_taikhoan_baomat = view.findViewById(R.id.tv_taikhoan_baomat);
        tv_diachi = view.findViewById(R.id.tv_diachi);
        ln_oder = view.findViewById(R.id.ln_oder);
        btn_Cart = view.findViewById(R.id.btn_Cart);
        btn_Confirm = view.findViewById(R.id.btn_Confirm);
        btn_Waiting = view.findViewById(R.id.btn_Waiting);
        btn_Shipping = view.findViewById(R.id.btn_Shipping);
        btnRate = view.findViewById(R.id.btnRate);

        tv_taikhoan_baomat.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), AccountActivity.class);
            startActivity(intent);
        });
        tv_diachi.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), AddressActivity.class);
            startActivity(intent);
        });
        ln_oder.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), OderActivity.class);
            startActivity(intent);
        });
        btn_Cart.setOnClickListener(view1 -> {
            Intent intent = new Intent(requireContext(), CartActivity.class);
            startActivity(intent);
        });
        return view;
    }

}
