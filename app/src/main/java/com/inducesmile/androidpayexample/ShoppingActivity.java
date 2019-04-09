package com.inducesmile.androidpayexample;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.inducesmile.androidpayexample.adapters.ShopRecyclerViewAdapter;
import com.inducesmile.androidpayexample.entities.ProductObject;
import com.inducesmile.androidpayexample.helpers.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ShoppingActivity extends AppCompatActivity {

    private static final String TAG = ShoppingActivity.class.getSimpleName();

    private RecyclerView shoppingRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        shoppingRecyclerView = (RecyclerView)findViewById(R.id.product_list);
        GridLayoutManager mGrid = new GridLayoutManager(ShoppingActivity.this, 2);
        shoppingRecyclerView.setLayoutManager(mGrid);
        shoppingRecyclerView.setHasFixedSize(true);
        shoppingRecyclerView.addItemDecoration(new SpacesItemDecoration(2, 12, false));

        ShopRecyclerViewAdapter shopAdapter = new ShopRecyclerViewAdapter(ShoppingActivity.this, getAllProductsOnSale());
        shoppingRecyclerView.setAdapter(shopAdapter);
    }


    private List<ProductObject> getAllProductsOnSale(){
        List<ProductObject> products = new ArrayList<ProductObject>();
        products.add(new ProductObject(1, "Almarai Milk", R.drawable.milk, "Name: Almarai Fresh Milk Full Fat 2Ltr\n" +
                "Nutritional Information \n" +
                "(per 100g serving)\n" +
                "Energy\t58 Kcal\t240kJ\n" +
                "Fat\t3.1 g\t\n" +
                "Protein\t3.1 g\t\n" +
                "Carbohydrate: 4.7 g\t\n" +
                "Calcium:100 mg\t\n" +
                "Vitamin A:\t2000 I.U./litre\t\n" +
                "Vitamin D3: 400 I.U./litre", 20, 240, "white"));

        products.add(new ProductObject(2, "Lusine Sliced Bread White 600g", R.drawable.bread, "LUSINE SNDWH BREAD SLICE.PACK", 4, 600, "white"));

        products.add(new ProductObject(3, "Garnier Ultra Doux Nourishing Shampoo ", R.drawable.shampoo, "Garnier Ultra Doux Nourishing Shampoo with Avocado Oil & Shea Butter 400 ml", 16, 400, "yellow"));

        return products;
    }
}
