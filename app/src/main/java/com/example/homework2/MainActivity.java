package com.example.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
   public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case R.id.item1 :
                Intent intent1 = new Intent(this, Item1Activity.class);
                startActivity(intent1);
                return true;
           case R.id.item2:
               Intent intent2 = new Intent(this, Item2Activity.class);
               startActivity(intent2);
                return true;
           case R.id.item3:
               Intent intent3 = new Intent(this, Item3Activity.class);
               startActivity(intent3);
               return true;
       }
        return super.onOptionsItemSelected(item);
    }
}
