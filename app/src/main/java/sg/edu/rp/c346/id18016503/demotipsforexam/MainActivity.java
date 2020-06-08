package sg.edu.rp.c346.id18016503.demotipsforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView LvExamTips;
String [] ExamTipsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LvExamTips = findViewById(R.id.ListViewExamTips);
        ExamTipsArray = new String[5];
        ExamTipsArray[0] = "Don't just read the code, code it as much as possible during each practical session";
        ExamTipsArray[1] ="Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        ExamTipsArray[2] ="Prepare your template source code for each topic";
        ExamTipsArray[3] ="Create a few empty Android projects to speed up your coding during the exam";
        ExamTipsArray[4] ="Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ExamTipsArray);
        LvExamTips.setAdapter(adapter);
    }
}
