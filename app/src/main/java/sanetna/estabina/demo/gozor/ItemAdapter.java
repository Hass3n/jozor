package sanetna.estabina.demo.gozor;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.viewHolder> {

  ArrayList<Data> data;

    public ItemAdapter(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recylce_item,viewGroup,false);
      return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
    Data item=data.get(i);
    viewHolder.title_txt.setText(item.getTitle());
    viewHolder.name_txt.setText(item.getName());



    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class  viewHolder extends RecyclerView.ViewHolder

    {

        TextView title_txt,name_txt;

        public viewHolder(View view)
        {
            super(view);
             title_txt=view.findViewById(R.id.t1);
            name_txt=view.findViewById(R.id.t2);

        }


    }
}
