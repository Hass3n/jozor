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

;import java.util.ArrayList;


public class oneFragment extends Fragment {

View view;
 Button btn1,btn2,btn3;

    public oneFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_one, container, false);
        btn1=view.findViewById(R.id.comp1);    //١-١١-٢٠١٩
        btn2=view.findViewById(R.id.comp2);
        btn3=view.findViewById(R.id.comp3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecycleItems.setData("شركة الفتح","ملوي المنيا","٠١١١٠١٩١١١٩");
                RecycleItems.data_share=1;
                startActivity(new Intent(getContext(),RecycleItems.class));// ح
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecycleItems.setData("شركة النور","مغاغة المنيا","٠١١١٠١٩١١٩٩");
               // RecycleItems.data_share=2;
                startActivity(new Intent(getContext(),RecycleItems.class)); // ح
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecycleItems.setData("شركة المجد"," اسيوط","٠١١١٠١٩١١٩٠");
               // RecycleItems.data_share=3;
                startActivity(new Intent(getContext(),RecycleItems.class));// ح
            }
        });


        return  view;
    }


}
