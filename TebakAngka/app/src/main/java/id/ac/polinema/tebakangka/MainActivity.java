package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText inputAngka;
	private Button reset;
	private Button tebak;
	int randomNumber;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		inputAngka = findViewById(R.id.number_input);
		reset = findViewById(R.id.reset_button);
		tebak = findViewById(R.id.guess_button);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random random = new Random();
		randomNumber = 1 + random.nextInt((100-1)+ 1);
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		if (!inputAngka.getText().toString().equals("") && !inputAngka.getText().toString().equals("-") ) {
			int input = Integer.parseInt(inputAngka.getText().toString());
			if (input < randomNumber) {
				Toast.makeText(this, "Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
			} else if (input > randomNumber) {
				Toast.makeText(this, "Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(this, "Tebakan anda benar!", Toast.LENGTH_SHORT).show();
				tebak.setEnabled(false);
			}
		}
		else {
			Toast.makeText(this, "Masukkan angka!", Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		initRandomNumber();
		reset.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				inputAngka.setText("");
				tebak.setEnabled(true);
			}
		});
	}
}
