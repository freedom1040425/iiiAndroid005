package tw.org.iii.iiiandroid005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private  SimpleAdapter adapter;
    //private LinkedList linkedList;   //資料異動頻繁高，使用這個
    private LinkedList<HashMap<String,String>> data;  //定義key value型態
   // private ArrayList arrayList;   //如資料給定後不太會異動
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.listView);
        initListView();
    }
    private void initListView(){
        //TODO 用來做註記用 可提醒來看之後要做的事情
           adapter = new SimpleAdapter(this,null,null,
                   R.layout.item_test1,null);

                   //SimpleAdapter(this,null,
                   //null,R.layout.item_test1,null);

    }
}
