package com.wizlearn.farid.birthdayibrahimcrd;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.wizlearn.farid.birthdayibrahimcrd.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }




    public void goToPage2(View view)
    {
        Intent intent = new Intent(this, MainActivityTwo.class);

        //EditText eTxt = (EditText)findViewById(R.id.eTxtMsg);
        //String msg = eTxt.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,"hello");

        startActivity(intent);
    }

    public void goToPage3(View view)
    {
        Intent intent = new Intent(this, LinearLayoutDemo.class);



        startActivity(intent);
    }

    public  void goToPage4(View view)
    {

            Intent intent = new Intent(this, SlidingDrawers.class);
            startActivity(intent);

    }

    public void  goToBirthdayCard(View view)
    {
        Intent intent = new Intent(this, BirthdayCard.class);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_settings) {
            return true;
        }

        Intent intent;


        switch (item.getItemId())
        {
            case R.id.menuCard:
                intent = new Intent(this, BirthdayCard.class);
                startActivity(intent);
                return true;
            case R.id.menuLinear:
                intent = new Intent(this, LinearLayoutDemo.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }


        //return super.onOptionsItemSelected(item);
    }
}
