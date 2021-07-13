package com.pramodkarki.quizwithme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.pramodkarki.quizwithme.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        ArrayList<CategoryModel> categories = new ArrayList<CategoryModel>();
        categories.add(new CategoryModel("", "Mathematics", ""));
        categories.add(new CategoryModel("", "Science", "https://th.bing.com/th/id/OIP.U7C27fr4P0o9ap54Xj0fNwHaD2?pid=ImgDet&rs=1"));
        categories.add(new CategoryModel("", "Computer", "https://th.bing.com/th/id/OIP.U7C27fr4P0o9ap54Xj0fNwHaD2?pid=ImgDet&rs=1"));
        categories.add(new CategoryModel("", "Language", ""));
        categories.add(new CategoryModel("", "Puzzle", "https://th.bing.com/th/id/OIP.U7C27fr4P0o9ap54Xj0fNwHaD2?pid=ImgDet&rs=1"));
        categories.add(new CategoryModel("", "Gaming", "https://th.bing.com/th/id/OIP.uGVqHLeVsiBB1SblBfH95gHaEK?w=274&h=180&c=7&o=5&dpr=1.5&pid=1.7"));

        CategoryAdapter adapter = new CategoryAdapter(this, categories);
        binding.categoryList.setLayoutManager(new GridLayoutManager(this, 2));
        binding.categoryList.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.wallet) {
            Toast.makeText(MainActivity.this, "Wallet is clicked!!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}