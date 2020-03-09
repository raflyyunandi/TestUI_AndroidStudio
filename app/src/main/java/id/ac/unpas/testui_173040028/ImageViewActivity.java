package id.ac.unpas.testui_173040028;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
    }

    public void loadGithub(View v){
        String url = "@drawable/github";
        int imageResource = getResources().getIdentifier(url, null, getPackageName());
        ImageView im = (ImageView) findViewById(R.id.imgView);
        Drawable res = getResources().getDrawable(imageResource);
        im.setImageDrawable(res);
    }

    public void loadCodepen(View v){
        String url = "@drawable/codepen";
        int imageResource = getResources().getIdentifier(url, null, getPackageName());
        ImageView im = (ImageView) findViewById(R.id.imgView);
        Drawable res = getResources().getDrawable(imageResource);
        im.setImageDrawable(res);
    }
}
