package sg.edu.rp.c346.id21000243.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvDetails1;
    TextView tvDetails2;
    TextView tvDetails3;
    TextView tvDetails4;
    TextView tvDetails5;
    TextView tvDetails6;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetails1 = findViewById(R.id.textView);
        tvDetails2 = findViewById(R.id.textView2);
        tvDetails3 = findViewById(R.id.textView3);
        tvDetails4 = findViewById(R.id.textView4);
        tvDetails5 = findViewById(R.id.textView5);
        tvDetails6 = findViewById(R.id.textView6);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String module_name = intentReceived.getStringExtra("Module");

        if (module_name == "C346") {
            tvDetails1.setText("Module Code: C346");
            tvDetails2.setText("Module Name: Android Programming");
            tvDetails3.setText("Academic Year: 2022");
            tvDetails4.setText("Semester: 1");
            tvDetails5.setText("Module Credit: 4");
            tvDetails6.setText("Venue: E62E");
        } else {
            tvDetails1.setText("Module Code: C203");
            tvDetails2.setText("Module Name: Web Application Development in PHP");
            tvDetails3.setText("Academic Year: 2022");
            tvDetails4.setText("Semester: 1");
            tvDetails5.setText("Module Credit: 4");
            tvDetails6.setText("Venue: W65H");
        }
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                intent.putExtra("Back", "Back");
                startActivity(intent);
            }
        });
    }
}