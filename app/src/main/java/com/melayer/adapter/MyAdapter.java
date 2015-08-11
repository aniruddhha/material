package com.melayer.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.melayer.material.R;
import com.melayer.model.RecyclerItem;

/**
 * Created by root on 8/10/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private RecyclerItem[] recyclerItems;
    private LayoutInflater inflater;

    public MyAdapter(Context context,RecyclerItem[] recyclerItems){

        this.recyclerItems = recyclerItems;
        inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = inflater.inflate(R.layout.recycler_item,null,false);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {

        myViewHolder.getImageViewIcon().setImageResource(recyclerItems[i].getImageId());
        myViewHolder.getTextViewInfo().setText(recyclerItems[i].getTextInfo());
    }

    @Override
    public int getItemCount() {
        return recyclerItems.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewIcon;
        private TextView textViewInfo;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageViewIcon);
            imageViewIcon.setImageResource(R.drawable.abc_btn_radio_material);

            textViewInfo = (TextView) itemView.findViewById(R.id.textViewInfo);
            textViewInfo.setText("Hello");
        }

        public ImageView getImageViewIcon() {
            return imageViewIcon;
        }

        public void setImageViewIcon(ImageView imageViewIcon) {
            this.imageViewIcon = imageViewIcon;
        }

        public TextView getTextViewInfo() {

            return textViewInfo;
        }

        public void setTextViewInfo(TextView textViewInfo)
        {
            this.textViewInfo = textViewInfo;
        }
    }
}
