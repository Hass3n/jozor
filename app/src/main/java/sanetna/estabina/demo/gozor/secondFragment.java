package sanetna.estabina.demo.gozor;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class secondFragment extends Fragment {
    View view;
    Button btn1,btn2,btn3;

    public secondFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_second, container, false);
        btn1=view.findViewById(R.id.tag1);
        btn2=view.findViewById(R.id.tag2);
        btn3=view.findViewById(R.id.tag3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecycleItems.setData("محمد احمد","ملوي المنيا","٠١١١٠١٩١١١٩");

                startActivity(new Intent(getContext(),RecycleItems.class)); // ح
                RecycleItems.data_share=4;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecycleItems.setData("حسن احمد","مغاغة المنيا","٠١١١٠١٩١١١٩");
               // RecycleItems.data_share=5;
                startActivity(new Intent(getContext(),RecycleItems.class)); // ح
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecycleItems.setData(" عيس محمد"," اسيوط","٠١١١٠١٩١١١٩");
              //  RecycleItems.data_share=6;
                startActivity(new Intent(getContext(),RecycleItems.class));
                // ح
            }
        });

        return view;
    }
}
