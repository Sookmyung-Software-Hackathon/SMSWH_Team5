package com.example.smswhapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MatchAgeActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    Button btn_up, btn_same, btn_down;

    private final BottomNavigationView.OnNavigationItemSelectedListener itemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch(item.getItemId()){
                case R.id.icon_kkanbu:
<<<<<<< HEAD
                    Intent intent1 = new Intent(MatchAgeActivity.this, KkanbuActivity.class);
                    startActivity(intent1);
                    overridePendingTransition(0, 0);
                    finish();
                    return true;
=======
                    //Intent intent1 = new Intent(MatchingStartActivity.this, MyKkanbuActivity.class);
                    //startActivity(intent1);
                    //overridePendingTransition(0, 0);
                    //finish();
                    break;
>>>>>>> 413673fc6feed5040ef516dbe59bb6934e03f50b
                case R.id.icon_me:
                    Intent intent2 = new Intent(MatchAgeActivity.this, MyInfoActivity.class);
                    startActivity(intent2);
                    overridePendingTransition(0, 0);
                    finish();
<<<<<<< HEAD
                    return true;
                default:
                    return true;
=======
                    break;
                default:
                    break;
>>>>>>> 413673fc6feed5040ef516dbe59bb6934e03f50b
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_age);

        @SuppressLint("ResourceType")
        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(itemSelectedListener);

        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("SMSWH");
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

        btn_up = findViewById(R.id.btn_up);
        btn_same = findViewById(R.id.btn_same);
        btn_down = findViewById(R.id.btn_down);

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("UserAccount").child(firebaseUser.getUid()).child("age").setValue(1);
                Intent i = new Intent(MatchAgeActivity.this, MatchInterestActivity.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        btn_same.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("UserAccount").child(firebaseUser.getUid()).child("age").setValue(2);
                Intent i = new Intent(MatchAgeActivity.this, MatchInterestActivity.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("UserAccount").child(firebaseUser.getUid()).child("age").setValue(3);
                Intent i = new Intent(MatchAgeActivity.this, MatchInterestActivity.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
    }
}