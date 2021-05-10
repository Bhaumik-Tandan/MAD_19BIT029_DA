package com.example.mad19bit0292;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.re);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation((LinearLayoutManager.VERTICAL));
        recyclerView.setLayoutManager(layoutManager);
        final List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new
                ModelClass(R.drawable.ic_launcher_background,"Prof. Sumit Yadav","Associate Professor Grade 1\nSchool of Information Technology"));
                modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Dr. ABDUL GAFFAR H","Assistant Professor Sr. Grade 2\nSchool of Bio Sciences"));
                        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Ms. ADLA PADMA","Assistant Professor (Junior)\nSchool of Information Technology"));
                                modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Dr. ANANDAVEL K","Associate Professor Grade 1\nSchool of Mechanical Engineering"));
                                        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Ms. ANJALI","Assistant Professor (Junior)\nSchool of Advanced Sciences"));
                                                modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Dr. ARUNKUMAR PALANIAPPAN","Assistant Professor\nCentre Molecular Theranostics"));
                                                        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Dr. BALAJI BALAKRISHNAN",	"Assistant Professor Grade 1\nSchool of Bio Sciences"));
                                                                modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Dr. CHELLATAMILAN T","Associate Professor Grade 1\nSchool of Information Technology"));
                                                                        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Dr. DHANABAL R",	"Assistant Professor Sr. Grade 1\nSchool of Electronics Engineering"));
        final Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT) {
                                        @Override
                                        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull
                                                RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                                            return false;}
            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)
            {
                modelClassList.remove(viewHolder.getAdapterPosition());
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity2.this,"Removed"+viewHolder.getAdapterPosition(),Toast.LENGTH_SHORT).show();
            }
        }).attachToRecyclerView(recyclerView);
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull
                    RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;}
            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)
            {
                modelClassList.remove(viewHolder.getAdapterPosition());
                adapter.notifyDataSetChanged();
                Toast.makeText(MainActivity2.this,"Archived"+viewHolder.getAdapterPosition(),Toast.LENGTH_SHORT).show();
            }
        }).attachToRecyclerView(recyclerView);
    }
}