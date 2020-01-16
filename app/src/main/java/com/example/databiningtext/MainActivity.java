package com.example.databiningtext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;

import android.os.Bundle;

import com.example.databiningtext.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ObservableGood good;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        good = new ObservableGood(new ObservableField<String>("jerry"),new ObservableField<String>("beta"),new ObservableFloat(90));
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setGood(good);
        binding.setListener(new Listener());
    }
    public class Listener {
        public void changePrice() {
            good.getDetails().set("beta" + new Random().nextInt(100));
            good.getPrices().set(new Random().nextInt(100));
        }
        public void changeName() {
            good.getName().set("jerry" + new Random().nextInt(100));
            good.getDetails().set("beta" + new Random().nextInt(100));
        }
    }
}
