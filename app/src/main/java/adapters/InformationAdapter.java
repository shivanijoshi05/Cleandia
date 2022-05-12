package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cleandia.R;

import java.util.ArrayList;

import models.InformationModel;

public class InformationAdapter extends RecyclerView.Adapter<InformationAdapter.viewHolder> {
    ArrayList<InformationModel> list ;
    Context context;

    public InformationAdapter(ArrayList<InformationModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.sample_information, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final InformationModel model = list.get(position);
        holder.waste_name.setText(model.getWasteName());
        holder.waste_image.setImageResource(model.getImageId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView waste_name;
        ImageView waste_image;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            waste_name = itemView.findViewById(R.id.waste_name);
            waste_image = itemView.findViewById(R.id.waste_image);
        }
    }
}


