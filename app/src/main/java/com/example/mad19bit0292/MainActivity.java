package com.example.mad19bit0292;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance("https://mad19bit0292-4a203-default-rtdb.asia-southeast1.firebasedatabase.app/");
    public void red(View v)
    {
        Intent i=new Intent(this,Na.class);
        startActivity(i);
    }

    public void wr(View v)
    {
        Intent i=new Intent(this,Read.class);
        startActivity(i);
    }
    public void cf(View v)
    {
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}