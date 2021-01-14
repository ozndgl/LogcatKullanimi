package com.example.logcatkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String baslik = "LogCat Kullanimi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Log.d(baslik,"Log.d Debug için kullanılır.Method çalıştımı. Döngüye girdimi.İf çalıştımı. Mavi renkte çıktı verir");

        Log.e(baslik,"Log.e Hata oluşan yer için. Kırmızı Renkte çıktı verir");

        Log.w(baslik,"Log.w Uyarı(Warnings) .Turuncu renk çıktı verir");

        Log.i("baslik", "Log.i Bilgilendirme amaçlı.Yeşil renk çıktı verir");
    }
}