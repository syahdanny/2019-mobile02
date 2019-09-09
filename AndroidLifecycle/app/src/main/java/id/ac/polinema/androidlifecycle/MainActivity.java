package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private EditText nameInput;
	private TextView outputText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nameInput = findViewById(R.id.input_name);
		outputText = findViewById(R.id.text_output);

	}

	public void handleSubmit(View view) {
		String name = nameInput.getText().toString();
		outputText.setText("Hallo "+name);
	}
	// TODO: tambahkan callback onStart() di sini


	// TODO: tambahkan callback onStop() di sini

	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()
}
