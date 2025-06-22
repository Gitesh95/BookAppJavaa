package org.EBook.search;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private Button btnNext;
    private IntroAdapter adapter;
    private ArrayList<IntroItem> introItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        viewPager = findViewById(R.id.viewPager);
        btnNext = findViewById(R.id.btnNext);

        introItems = new ArrayList<>();
        introItems.add(new IntroItem("Read Books Anywhere", "Browse and read thousands of books", R.drawable.img));
        introItems.add(new IntroItem("Save Favorites", "Bookmark your favorite books easily", R.drawable.img));
        introItems.add(new IntroItem("Totally Free", "No fees. Enjoy unlimited reading", R.drawable.img));

        adapter = new IntroAdapter(introItems);
        viewPager.setAdapter(adapter);

        btnNext.setOnClickListener(v -> {
            if (viewPager.getCurrentItem() < introItems.size() - 1) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            } else {
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
