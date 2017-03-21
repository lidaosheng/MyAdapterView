package com.lifei.myadapterview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LVActivity extends AppCompatActivity {
    //打算列表显示的信息
    String[] show = new String[]{"吃什么啊","喝什么啊","赶紧睡觉","出去玩吧"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv);
        ListView listView = (ListView)findViewById(R.id.list2);
        //布局文件中没有提供数组，这里需要使用adapter来提供
        //将数组包装成ArrayAdapter
        //第一个参数：Context,它代表访问整个Android应用的接口
        //第二个参数：一个资源ID，该组件将作为ArrayAdapter的列表项组件
        //第三个参数：该数组或list为多个列表提供数据，有多少个元素，就会生成多少个列表项
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.array_item,show);
        //然后为ListView设置Adapter
        listView.setAdapter(adapter1);

//        listView = getListView();
//        setListAdapter(new ArrayAdapter<String>(this,));

    }
}
