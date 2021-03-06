package com.example.mad19bit0292;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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

public class Read extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance("https://mad19bit0292-4a203-default-rtdb.asia-southeast1.firebasedatabase.app/");
    public void reg(View v)
    {
        EditText f=(EditText) findViewById(R.id.n);
        String name=f.getText().toString();
        f=(EditText) findViewById(R.id.rn);
        String rgno=f.getText().toString();
        DatabaseReference myRef = database.getReference(name);
        myRef.setValue(rgno);
        Context context = getApplicationContext();
        CharSequence text = "Registered";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

    }

}