import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
   Switch aSwitch;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      aSwitch = findViewById(R.id.switchBtn);
      aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
               Toast.makeText(MainActivity.this, "Switch On", Toast.LENGTH_SHORT).show();
            } else {
               Toast.makeText(MainActivity.this, "Switch Off", Toast.LENGTH_SHORT).show();
            }
         }
      });
   }
}