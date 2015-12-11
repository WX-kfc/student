package com.redrock.msi.student;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MSI on 2015/12/10.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
        private int resourceId;

        public ItemAdapter(Context context, int resource, List<Item> objects) {
            super(context, resource, objects);
            resourceId = resource;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Item item = getItem(position);
            View view;
            ViewHodler viewHodler;
            if(convertView==null){
                view=LayoutInflater.from(getContext()).inflate(resourceId,null);
                viewHodler=new ViewHodler();
                viewHodler.imageView=(ImageView)view.findViewById(R.id.iv_item);
                viewHodler.textView=(TextView)view.findViewById(R.id.tv_item);
                view.setTag(viewHodler);//将viewHolder存储在view中
            }else {
                view=convertView;
                viewHodler=(ViewHodler)view.getTag();//重新获取ViewHolder
            }
            viewHodler.imageView.setImageResource(item.getImageId());
            viewHodler.textView.setText(item.getText());
            return view;
        }

    }

    class  ViewHodler {
        ImageView imageView;
        TextView textView;


    }
