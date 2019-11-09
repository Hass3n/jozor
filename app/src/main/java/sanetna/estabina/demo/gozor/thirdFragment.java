package sanetna.estabina.demo.gozor;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class thirdFragment extends Fragment {
    LinearLayoutManager linearLayout;
    ItemAdapter adapter;
   ArrayList<Data> data;
    View view;
    public thirdFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_third, container, false);

        RecyclerView recyclerView=view.findViewById(R.id.recycle);
        add_data();
        adapter=new ItemAdapter(data);
        linearLayout=new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        return  view;
    }
    // add Data
    public void  add_data()
    {
        data=new ArrayList<>();
        for (int i=0;i<10;i++) {
            data.add(new Data("القمج", "يظهر القمح في فصل الصيف ويعد من اهم اعمدة الاتصاد المصري", "",0));
           // data.add(new Data("ال", "يظهر القمح في فصل الصيف ويعد من اهم اعمدة الاتصاد المصري", "",0));

        }

    }
}
