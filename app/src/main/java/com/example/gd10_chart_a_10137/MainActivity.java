package com.example.gd10_chart_a_10137;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.gd10_chart_a_10137.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //view binding digunakan utnuk mengurangi boilerplate code
    // findViewById() dan untuk memberikan scoped id
    // untuk komponen pada layout yang dibind
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setup view binding agar bisa mendapat refrensi ke layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // setup navigation
        NavHostFragment navHostFragment =
                (NavHostFragment)getSupportFragmentManager()
                        .findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigation,
                navController);
    }
}
