package id.ac.unpas.testui_173040028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    final String [] listOptionStart = {"1. TextView", "2. ImageView", "3. Button", "4.Spinner", "5.ProgressBar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOptionStart ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, TextViewActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ImageViewActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, ButtonActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, ProgressbarActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
        super.onStart();
    }
}
