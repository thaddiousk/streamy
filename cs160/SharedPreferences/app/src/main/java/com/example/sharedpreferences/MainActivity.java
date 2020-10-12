package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences shared = this.getSharedPreferences("com.example.sharedpreferences", Context.MODE_PRIVATE);

        /*ArrayList<String> friends = new ArrayList<>();

        friends.add("Monica");
        friends.add("Chandler");

        try {
            shared.edit().putString("friends", ObjectSerializer.serialize(friends)).apply();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        ArrayList<String> check = new ArrayList<>();

        try {
            check = (ArrayList<String>) ObjectSerializer.deserialize(shared.getString("friends", ObjectSerializer.serialize(new ArrayList<String>())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.i("username", check.toString());
        /*shared.edit().putString("username", "rob").apply();

        String username = shared.getString("username", "");

        Log.i("username", username);*/
    }
}