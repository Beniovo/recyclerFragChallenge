package com.example.recyclerfragchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked {

    Button btCarInfo, btOInfo;

    ImageView ivCarMake;
    TextView tvOContact, tvOwnerNameinFrag, tvCarModelinFrag;
   listFrag listFrag;
   detailsFrag detailsFrag;
   carIconFrag carIconFrag;
   buttonsFrag buttonsFrag;



    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCarInfo = findViewById(R.id.btCarInfo);
        btOInfo = findViewById(R.id.btOInfo);

        ivCarMake = findViewById(R.id.ivCarMake);
        tvOContact = findViewById(R.id.tvOnumber);
        tvOwnerNameinFrag = findViewById(R.id.tvOwnerNameinFrag);
        tvCarModelinFrag = findViewById(R.id.tvModelinFrag);



        fragmentManager = this.getSupportFragmentManager();


        listFrag = (listFrag)fragmentManager.findFragmentById(R.id.listFrag);
        detailsFrag = (detailsFrag)fragmentManager.findFragmentById(R.id.detailsFrag);
        buttonsFrag = (buttonsFrag)fragmentManager.findFragmentById(R.id.buttonsFrag);
        carIconFrag = (carIconFrag)fragmentManager.findFragmentById(R.id.carIconFrag);

        fragmentManager.beginTransaction()
                        .show(listFrag)
                        .show(buttonsFrag)
                        .show(detailsFrag)
                        .hide(carIconFrag)
                        .commit();


        btCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction()
                        .hide(detailsFrag)
                        .show(carIconFrag)
                        .commit();



            }
        });
         btOInfo.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 fragmentManager.beginTransaction()
                         .show(detailsFrag)
                         .hide(carIconFrag)
                         .commit();

             }
         });


         onItemClicked(0);


    }

    @Override
    public void onItemClicked(int index) {
        tvOContact.setText(ApplicationClass.cars.get(index).getCarOwnerCont());
        tvCarModelinFrag.setText(ApplicationClass.cars.get(index).getCarModel());
        tvOwnerNameinFrag.setText(ApplicationClass.cars.get(index).getCarOwner());
        if(ApplicationClass.cars.get(index).getCarMake().equals("Nissan")){
            ivCarMake.setImageResource(R.drawable.nissan);
        }
        else if(ApplicationClass.cars.get(index).getCarMake().equals("Mercedes")) {
            ivCarMake.setImageResource(R.drawable.mercedes);
        }
        else if(ApplicationClass.cars.get(index).getCarMake().equals("Volkswagen")) {
            ivCarMake.setImageResource(R.drawable.volkswagen);
        }

    }
}
