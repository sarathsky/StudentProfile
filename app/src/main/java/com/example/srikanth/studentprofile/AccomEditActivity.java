package com.example.srikanth.studentprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class AccomEditActivity extends AppCompatActivity {

    public static EditText accomOrgan,accomPos,accomFromyear,accomToyear;
    public int cardCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accom_edit);

        accomOrgan = (EditText) findViewById(R.id.accom_organ_edittext);
        accomPos = (EditText) findViewById(R.id.accom_pos_edittext);
        accomFromyear = (EditText) findViewById(R.id.accom_fromyear_edittext);
        accomToyear = (EditText) findViewById(R.id.accom_toyear_edittext);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.accom_save_action,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.accom_save_action_button){
            //grabbing the details entered in the fields into cardview.
            Toast.makeText(this,"Saved.",Toast.LENGTH_SHORT).show();
            AccomDetailArray.makeAccomCard();
            startActivity(new Intent(AccomEditActivity.this,MainActivity.class));

        }
        return super.onOptionsItemSelected(item);
    }
}
