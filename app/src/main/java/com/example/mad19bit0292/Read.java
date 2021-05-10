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
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                String value = dataSnapshot.getValue(String.class);
//                Log.d(name, "Value is: " + value);
//                f.setText(value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//                Log.w("Bhaumik Tandan", "Failed to read value.", error.toException());
//            }
//        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}