package com.redrock.msi.student;

import android.text.Layout;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;

import java.util.HashMap;

/**
 * Created by MSI on 2015/12/12.
 */
public class ViewHolder {
    //private HashMap<Integer,View>maps;
    private SparseArray<View> views;      //存放以后需要的View
    private View mConvertView;

    public ViewHolder() {
    }

    public ViewHolder getViewHolder(View convertView.int LayoutId) {
        views = new SparseArray<>();
        LayoutInflater.from(context).inflate(layoutId, null);
        mConvertView.setTag(this);
    }
        public static ViewHolder getViewHolder(Context context.View convertView, int Lay){
            if (convertView == null) {
                return new ViewHolder();
            } else {
                return (ViewHolder) convertView.getTag();
            }
        }

    public <T extends View> T getView(int RID) {
        View view=views.get(RID);
        if(view==null) {
            view = mConvertView.findViewById(RID);
            views.put(RID, view);
        }
        return  (T) view;
    }

  }

/* ViewHolder viewHolder =ViewHolder.getViewHolder();
TextView textView=viewHolder.getView(R.id.tv);
 */