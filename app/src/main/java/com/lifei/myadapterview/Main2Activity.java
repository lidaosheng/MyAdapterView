package com.lifei.myadapterview;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Main2Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] arr = {"猪八戒","孙悟空","牛魔王"};
        //将数组包装成ArrayAdapter
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.array_item,arr);
        //上一个是 ListView.setListAdapter()
        setListAdapter(adapter);
    }
}
