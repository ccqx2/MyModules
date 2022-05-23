package sg.edu.rp.c346.id21000243.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMod1;
    TextView tvMod2;
    TextView tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.textViewMod1);
        tvMod2 = findViewById(R.id.textViewMod2);
        tvBack = findViewById(R.id.textViewBack);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);
            }
        });
        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module", "C203");
                startActivity(intent);
            }
        });
        Intent intentReceived = getIntent();
        intentReceived.getStringExtra("Back");
    }
}