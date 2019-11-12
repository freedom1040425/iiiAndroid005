package tw.org.iii.iiiandroid005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;  //宣告
    private  SimpleAdapter adapter;
    //private LinkedList linkedList;   //資料異動頻繁高，使用這個
    private LinkedList<HashMap<String,String>> data;  //定義key value型態
   // private ArrayList arrayList;   //如資料給定後不太會異動
    private String[] from ={"title","msg"};//mapping
    private int [] to ={R.id.item_Title,R.id.item_msg}; //mapping 過來的位置
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.listView);
        initListView();
    }
    private void initListView(){
        data = new LinkedList<>();
        //測試
        for(int i=0;i<20;i++){
            HashMap<String,String> dd = new HashMap<>();
            int rand =(int)(Math.random()*49+1);//列表亂數
            dd.put(from[0],"Title"+rand);
            dd.put(from[1],"content"+rand);
            dd.put("detail","Detail"+rand);//列表內資料
            data.add(dd);

        }

        //TODO 用來做註記用 可提醒來看之後要做的事情
           adapter = new SimpleAdapter(this,data,R.layout.item_test1,
                   from,to);
        listView.setAdapter(adapter);
        //內容備案
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("brad","pos"+position);
            }
        });

                   //SimpleAdapter(this,null,
                   //null,R.layout.item_test1,null);

    }
}
