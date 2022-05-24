package com.example.quizz_app.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quizz_app.R;

import java.util.List;

public class HomeAdapter extends BaseAdapter  {
    private List<HomeViewModel> cat_List;


    public HomeAdapter(List<HomeViewModel> cat_List) {
        this.cat_List = cat_List;
    }

    @Override
    public int getCount() {
        return cat_List.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myview;
        if (convertView==null){
            myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item_layout,parent, false);
        }else {
            myview=convertView;
        }

        TextView catName= myview.findViewById(R.id.catName);
        TextView catOfTest= myview.findViewById(R.id.noOftest);
        catName.setText(cat_List.get(position).getName());
        catOfTest.setText( String.valueOf(cat_List.get(position).getNoOfTests())+  "  Tests");


        return myview;
    }
}
