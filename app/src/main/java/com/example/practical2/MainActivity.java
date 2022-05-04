package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {

    User newUser = new User(
            "JINESE",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            1,
            false
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set User name
        TextView userName = (TextView)findViewById(R.id.userName);
        userName.setText(newUser.name);

        //Set User description
        TextView userDesc = (TextView)findViewById(R.id.userDesc);
        userDesc.setText(newUser.description);

        Button followBtn = findViewById(R.id.follow);

        followBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Button clickFollowBtn = findViewById(R.id.follow);

                if (!newUser.followed){
                    clickFollowBtn.setText("Unfollow");
                    newUser.followed = true;
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
                else{
                    clickFollowBtn.setText("Follow");
                    newUser.followed = false;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

}