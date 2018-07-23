package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alBox;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvBox = findViewById(R.id.listViewBox);

        alBox = new ArrayList<>();

        Box box1 = new Box("blue");
        Box box2 = new Box("orange");
        Box box3 = new Box ("brown");

        alBox.add(box1);
        alBox.add(box2);
        alBox.add(box3);

        caBox = new CustomAdapter(this,R.layout.box_item,alBox);
        lvBox.setAdapter(caBox);

    }
}
