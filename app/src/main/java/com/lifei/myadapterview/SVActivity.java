package com.lifei.myadapterview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SVActivity extends AppCompatActivity {
    private String[] names = new String[]{
      "虎头","弄玉","李清照","李白"
    };
    private String[] descs = new String[]{
      "可爱的小孩","一个擅长音乐的女孩","一个擅长文学的女孩","浪漫主义诗人"
    };
    private int[] imageIds = new int[]{
            R.drawable.tiger,R.drawable.nongyu,R.drawable.qingzhao,R.drawable.libai
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sv);
        //创建一个list集合，集合的元素是Map
        List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            //将每个对象（包含姓名，简介，照片），封装到一个Map中作为一个整体
            //Map作为list的一个元素
            Map<String,Object> listItem = new HashMap<String,Object>();
            listItem.put("header",imageIds[i]);
            listItem.put("personName",names[i]);
            listItem.put("desc",descs[i]);
            listItems.add(listItem);
        }
        //将数据 封装成一个 SimpleAdapter对象
        //第二个参数应该是：List<?extents Map<String,?>>类型的集合对象，list中每个Map生成一个列表项
        //第三个参数指定一个界面布局的ID，作为列表项组件
        //第四个参数应该是一个String[]类型的参数，该参数决定提取Map<String,?>对象中的哪些key对应的value来生成列表项
        //第五个参数应该是一个int[]类型的参数，该参数决定填充哪些组件
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,R.layout.simple_item,
                new String[]{"personName","header","desc"},
                new int[]{R.id.username,R.id.header,R.id.desc});
        ListView list = (ListView)findViewById(R.id.myList);
        list.setAdapter(simpleAdapter);
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //第position项选中时激发该事件
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SVActivity.this,"第"+position+"行 被选中了",Toast.LENGTH_LONG).show();
                System.out.print("sssss");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //添加点击事件
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SVActivity.this,"第"+position+"行 被点击了",Toast.LENGTH_LONG).show();
            }
        });

    }
}
