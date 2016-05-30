package in.ahmedraza.tiwaco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    public void clickButton(View view){

        EditText enteredText = (EditText) findViewById(R.id.editText);
        TextView updatedText = (TextView) findViewById(R.id.message);

        if (enteredText.getText().toString().trim().length()>0){

            //int a = Integer.parseInt(enteredText.getText().toString());
            //int multiply = a*30;
            updatedText.setText("You have entered !" +enteredText.getText().toString());
            updatedText.setPadding(0,20,0,20 );

           // Toast.makeText(MainActivity.this,"You have entered " + enteredText.getText().toString(), Toast.LENGTH_SHORT ).show();

        }
        else {
            Toast.makeText(MainActivity.this,"Please Enter number of hours", Toast.LENGTH_SHORT ).show();

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
