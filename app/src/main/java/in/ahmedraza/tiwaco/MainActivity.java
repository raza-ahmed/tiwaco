package in.ahmedraza.tiwaco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    public void clickButton(View view){
        
        EditText enteredText = (EditText) findViewById(R.id.editText);

        Log.i("MainActivity", enteredText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
