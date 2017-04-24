package com.example.android.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Coffee extends AppCompatActivity {

    int qty = (0);
    int price = (0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        /**
         *
         *Create an object(moreButton) of a class(Button) referring to an id(R.id.more_button).
         * The id is referring to the '+' button in the XML file.
         */
        Button moreButton = (Button) findViewById(R.id.more_button);

        /**
         *
         *Create an object(lessButton) of a class(Button) referring to an id(R.id.less_button).
         * The id is referring to the 'less' button in the XML file.
         */
        Button lessButton = (Button) findViewById(R.id.less_button);

        /**
         * Set the more and less buttons to perform the following functions on the screen:
         * 1. Display a popup text for a short time.
         * 2. Change the display result of the text view.
         */
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, "Increment the quantity", Toast.LENGTH_SHORT).show();
                increment(1);
            }
        });

        lessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, "decrement the quantity", Toast.LENGTH_SHORT).show();
                decrement(1);
            }
        });


        /**
         *
         *Create an object(payButton) of a class(Button) referring to an id(R.id.pay_button).
         * The id is referring to the 'pay' button in the XML file.
         */

        Button payButton = (Button) findViewById(R.id.pay_button);

        /**
         * Set the add and minus buttons to perform the following functions on the screen:
         * 1. Display a popup text for a short time.
         * 2. Change the display result of the text view to 4
         */

        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Coffee.this, "Thank You For Your Patronage", Toast.LENGTH_SHORT).show();
                pay(10);
            }
        });

    }

    public void increment(int num) {
        TextView quantity = (TextView) findViewById(R.id.txt_quantity);
        qty = qty + num;
        quantity.setText("" + qty);
    }

    public void decrement(int num) {
        TextView quantity = (TextView) findViewById(R.id.txt_quantity);
        qty = qty - num;
        quantity.setText("" + qty);
    }

    public void pay(int amount) {
        TextView quantity = (TextView) findViewById(R.id.txt_pay);
        price = qty * amount;
        quantity.setText("" + price);
    }

}