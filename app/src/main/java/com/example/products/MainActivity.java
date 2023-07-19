package com.example.products;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");
EditText productID,productName,productQty,productPrice;
Button addProducts;
    Product product = new Product();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productID = findViewById(R.id.productId);
        productName = findViewById(R.id.productName);
        productQty = findViewById(R.id.productQty);
        productPrice = findViewById(R.id.productPrice);

        addProducts = findViewById(R.id.AddProducts);


        addProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adding();
            }
        });
    }

    private void adding() {
        product.setProductName(productName.getText().toString());
        product.setProductPrice(Integer.parseInt(productPrice.getText().toString()));
        product.setProductQty(Integer.parseInt(productQty.getText().toString()));
        product.setProductPrice(Integer.parseInt(productPrice.getText().toString()));


    }

}