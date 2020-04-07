package com.example.c0766552_ex.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c0766552_ex.R;
import com.example.c0766552_ex.model.CanadaAttraction;

public class AttractionDetailsActivity extends AppCompatActivity {

    private TextView txtId;
    private TextView txtName;
    private TextView txtAdd;
    private TextView txtCity;
    private TextView txtProvince;
    private TextView txtDesc;
    private ImageView imgP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Attraction Details");

        CanadaAttraction tempObj = (CanadaAttraction) getIntent().getSerializableExtra("places");

        txtId = findViewById(R.id.textView1);
        txtName = findViewById(R.id.textView2);
        txtAdd = findViewById(R.id.textView3);
        txtCity = findViewById(R.id.textView4);
        txtProvince = findViewById(R.id.textView5);
        txtDesc = findViewById(R.id.textView6);
        imgP = findViewById(R.id.imageView1);

        txtId.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        txtId.setTextSize(20);
        txtId.setText("Place Id : " + tempObj.getPlaceId());

        txtName.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        txtName.setTextSize(20);
        txtName.setText("Place Name : " + tempObj.getPlaceName());

        txtAdd.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        txtAdd.setTextSize(20);
        txtAdd.setText("Address : "+ tempObj.getAddress());

        txtCity.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        txtCity.setTextSize(20);
        txtCity.setText("City : " + tempObj.getCity());

        txtProvince.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        txtProvince.setTextSize(20);
        txtProvince.setText("Province : " + tempObj.getProvince());

        txtDesc.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        txtDesc.setTextSize(20);
        txtDesc.setText("Description : " + tempObj.getDescription());

        imgP.setImageResource(tempObj.getImagePlace());
    }
}
