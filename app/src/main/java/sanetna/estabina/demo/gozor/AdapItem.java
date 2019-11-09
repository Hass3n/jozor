package sanetna.estabina.demo.gozor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class AdapItem extends RecyclerView.Adapter<AdapItem.ViewHolder>  {

    ArrayList<DataItem> data;
    OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public AdapItem(ArrayList<DataItem> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item,viewGroup,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        final DataItem item= data.get(i);
        viewHolder.tx1.setText(item.getName());
        viewHolder.tx2.setText(item.getLoaction());
        viewHolder.tx3.setText(item.getPhone());
        if (onItemClick!=null)
        {
            viewHolder.parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClick.onItemclick(item,i);
                }
            });

        }


    }


    public int getItemCount() {
        return (data == null) ? 0 : data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView tx1,tx2,tx3;
        View parent;

        ViewHolder(View view){
            super(view);
            tx1=view.findViewById(R.id.n2);
            tx2=view.findViewById(R.id.n4);
            tx3=view.findViewById(R.id.n6);
            parent=view;


        }
    }

     public  interface OnItemClick{

        void  onItemclick(DataItem dataItem,int postion);


     }


}
