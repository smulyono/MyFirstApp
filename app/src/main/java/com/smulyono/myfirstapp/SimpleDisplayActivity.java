package com.smulyono.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SimpleDisplayActivity extends ActionBarActivity {

    // Edittext Field
    // private <type> <id>
    private EditText etWords;
    private TextView tvLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // creates layout in memory
        setContentView(R.layout.activity_simple_display); // java associations with xml
        // find references into views in memory
        // need to cast View into Element type
        // <id> = (<type>) findViewById(R.id.<id>);
        etWords = (EditText)findViewById(R.id.etWords);
        tvLabel = (TextView)findViewById(R.id.tvLabel);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple_display, menu);
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

    // When button is clicked
    public void onSubmit(View view) {
        // get value from text field
        String fieldValue = etWords.getText().toString();
        // show value into text label (TextView)
        tvLabel.setText(fieldValue);
        // Show toast / notifications
        Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
    }
}
