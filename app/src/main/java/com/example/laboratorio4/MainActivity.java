package com.example.laboratorio4;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.laboratorio4.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void ranaClick(View view){
        Toast.makeText(this,"Rana Dorada", Toast.LENGTH_SHORT).show();
    }
    public void tigreClick(View view){
        Toast.makeText(this,"Tigre de Bengala", Toast.LENGTH_SHORT).show();
    }
    public void pandaClick(View view){
        Toast.makeText(this,"Panda", Toast.LENGTH_SHORT).show();
    }
}