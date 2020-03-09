package id.ac.unpas.testui_173040028;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
    }
    public void helloSAB(View v){
        TextView textHelloSAB = (TextView) findViewById(R.id.textHello);
        textHelloSAB.setText("Hello SAB");
    }

    public void helloWorld(View v){
        TextView textHelloWorld = (TextView) findViewById(R.id.textHello);
        textHelloWorld.setText("Hello World");
    }
}
