package id.ac.poliban.dts.mauliyanti.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menggunakan lambda untuk menulis event listener & event handler
        Button btRealMadrid = findViewById(R.id.btRealMadrid);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btLeicester = findViewById(R.id.btLeicester);
        Button btFiorentina = findViewById(R.id.btFlorentina);

        //lambda
        btRealMadrid.setOnClickListener(view -> {
            Toast.makeText(this, "Ente Musuh Ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Guweh Barcelona Fans Club", Toast.LENGTH_SHORT).show();
        });

        btBarcelona.setOnClickListener(view -> Toast.makeText(this, "I'm Barcelona", Toast.LENGTH_SHORT).show());
        btLeicester.setOnClickListener(view -> Toast.makeText(this, "I'm The King", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(view -> Toast.makeText(this, "I'm Fiorentina", Toast.LENGTH_SHORT).show());

    }

}
