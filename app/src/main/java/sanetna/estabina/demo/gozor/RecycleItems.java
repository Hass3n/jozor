package sanetna.estabina.demo.gozor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleItems extends AppCompatActivity {
    LinearLayoutManager linearLayout;
    AdapItem adapter;
    public  static  int data_share=0;
   public static ArrayList<DataItem>dataItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_items);

        RecyclerView recyclerView=findViewById(R.id.recycle_item);
        adapter=new AdapItem(dataItems);
        linearLayout=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayout);
        adapter.setOnItemClick(new AdapItem.OnItemClick() {
            @Override
            public void onItemclick(DataItem dataItem, int postion) {

                if(data_share==1)
                {
                    startActivity(new Intent(RecycleItems.this,comp_desc.class));
                }
                if(data_share==4)
                {
                    startActivity(new Intent(RecycleItems.this,descActivity.class));
                }

            }
        });

    }

    public  static void setData(String name,String location,String phone)
    {
       dataItems=new ArrayList<>();

        for (int i=0;i<10;i++) {
            dataItems.add(new DataItem(name,location,phone));
        }
    }


}
