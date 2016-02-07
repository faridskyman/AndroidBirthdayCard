package com.wizlearn.farid.birthdayibrahimcrd;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.wizlearn.farid.birthdayibrahimcrd.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTxt = (TextView)findViewById(R.id.txtMsg);
        myTxt.setText("Muhammed Ibrahim Bin Farid, May you be a good boy always. " +
                "From Your Ayah and Ibu and your sister Ruzana " +
                "and your baby sister insyirah who all loves you very much. " +
                "Be a good boy always." +
                "Be A contributing member of society." +
                "Be kind and loyal to your family" +
                "Always Remember Allah." +
                "Dont ever miss your daily solat.");
        myTxt.setMovementMethod(new ScrollingMovementMethod());



        ///button go action

        Button btnGo = (Button)findViewById(R.id.btn_go);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Happy Birthday Ibrahim!!!", Toast.LENGTH_LONG).show();
            }
        });


        //button page 2 action

       

       /*
        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"go to page 2", Toast.LENGTH_LONG).show();
            }
        });
*/

    }




    public void goToPage2(View view)
    {
        Intent intent = new Intent(this, MainActivityTwo.class);

        EditText eTxt = (EditText)findViewById(R.id.eTxtMsg);
        String msg = eTxt.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,msg);

        startActivity(intent);
    }

    public void goToPage3(View view)
    {
        Intent intent = new Intent(this, LinearLayoutDemo.class);

        EditText eTxt = (EditText)findViewById(R.id.eTxtMsg);
        String msg = eTxt.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,msg);

        startActivity(intent);
    }

    public  void goToPage4(View view)
    {

            Intent intent = new Intent(this, SlidingDrawers.class);
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

        return super.onOptionsItemSelected(item);
    }
}
