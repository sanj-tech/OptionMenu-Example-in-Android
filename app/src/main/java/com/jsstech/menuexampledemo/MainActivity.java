package com.jsstech.menuexampledemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.item_menu,menu);

        //  getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this,"Beaten Coffiee",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item2:
                Toast.makeText(this,"Rose Lassi",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this,"Punjabi Lassi",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this,"Mango Lassi",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item5:
                Toast.makeText(this,"More",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item6:
                Toast.makeText(this,"PineApple Juice",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item7:
                Toast.makeText(this,"Strawberry milkShake",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item8:
                Toast.makeText(this,"Saffron milkShake",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item9:
                Toast.makeText(this,"search is clicked",Toast.LENGTH_SHORT).show();
                break;



        }
        return true;
    }
}
