package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String userInput;
    String userOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        EditText outputText = findViewById(R.id.output);
        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInput = editText.getText().toString();
                System.out.println("user name: "+userInput);
                String message = userInput;
                String newmessage = "";
                char temp;
                for(int i=0;i<message.length();i++){
                    if(i%2==0){
                        temp = Character.toUpperCase(message.charAt(i));
                        System.out.print(temp);
                    }
                    else if(i%2!=0){
                        temp = Character.toLowerCase(message.charAt(i));
                        System.out.print(temp);
                    }
                    else{
                        temp = message.charAt(i);
                        System.out.print(temp);
                    }
                    newmessage+=temp;

                }
                System.out.println();
                System.out.println(newmessage);
                outputText.setText(newmessage);

            }

        });

    }
}