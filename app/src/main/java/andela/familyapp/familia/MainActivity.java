package andela.familyapp.familia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Miguna Miguna Mkenya", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Ouru", Toast.LENGTH_SHORT).show();
    }
}
