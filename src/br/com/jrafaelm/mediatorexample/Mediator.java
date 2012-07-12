package br.com.jrafaelm.mediatorexample;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Mediator {

	private Button btnPlus;
	private Button btnMinus;
	private TextView tvInfo;
	private TextView tvCounter;
	
	private OnClickListener oclPlus = new OnClickListener() {
		
		public void onClick(View v) {
			plusClicked();	
		}

	};
	
	private OnClickListener oclMinus = new OnClickListener() {
		
		public void onClick(View v) {
			minusClicked();	
		}
	};
	
	public Mediator(Button btnPlus, Button btnMinus, TextView tvInfo,
			TextView tvCounter) {
		super();
		this.btnPlus = btnPlus;
		btnPlus.setOnClickListener(oclPlus);
		this.btnMinus = btnMinus;
		btnMinus.setOnClickListener(oclMinus);
		this.tvInfo = tvInfo;
		this.tvCounter = tvCounter;
	}
	
	private void plusClicked(){
		int info = Integer.valueOf(tvInfo.getText().toString());
		int counter = Integer.valueOf(tvCounter.getText().toString());
		if(info == 10){
			tvInfo.setText("0");
			tvCounter.setText(""+(counter+1));
		}else{
			tvInfo.setText(""+(info+1));
		}
		
	}
	
	private void minusClicked(){
		int info = Integer.valueOf(tvInfo.getText().toString());
		int counter = Integer.valueOf(tvCounter.getText().toString());
		if(info == 0 && counter > 0){
			tvInfo.setText("10");
			tvCounter.setText(""+(counter-1));
		}else if(info != 0){
			tvInfo.setText(""+(info-1));
		}
	}
	
}
