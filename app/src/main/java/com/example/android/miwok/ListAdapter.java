package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<ItemModule>{


    public ListAdapter(@NonNull Context context,@NonNull List<ItemModule> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        ItemModule item = getItem(position);

        ImageView imageView = (ImageView) view.findViewById(R.id.listImageView);
        TextView nativeLanguage = (TextView) view.findViewById(R.id.nativeTextView);
        TextView miwok = (TextView) view.findViewById(R.id.miwokTextView);


        imageView.setImageResource(item.getImageId());
        nativeLanguage.setText(item.getNativeLanguage());
        miwok.setText(item.getMiwokLanguage());



        return view;





    }
}
