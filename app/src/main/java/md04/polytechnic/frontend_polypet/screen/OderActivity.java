package md04.polytechnic.frontend_polypet.screen;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import md04.polytechnic.frontend_polypet.R;
import md04.polytechnic.frontend_polypet.adapter.OderAdapter;
import md04.polytechnic.frontend_polypet.databinding.ActivityOderBinding;

public class OderActivity extends AppCompatActivity {
    private ActivityOderBinding binding;
    private OderAdapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}