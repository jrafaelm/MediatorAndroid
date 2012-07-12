package br.com.jrafaelm.mediatorexample;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

public class MediatorExampleActivity extends Activity {

	Button btnPlus;
	Button btnMinus;
	TextView tvInfo;
	TextView tvCounter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator_example);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        tvInfo = (TextView) findViewById(R.id.tvInfo);
        tvCounter = (TextView) findViewById(R.id.tvCounter);
        Mediator mediator = new Mediator(btnPlus, btnMinus, tvInfo, tvCounter);
    }

    

    
}
