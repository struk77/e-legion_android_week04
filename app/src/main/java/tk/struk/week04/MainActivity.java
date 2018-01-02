package tk.struk.week04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String text = (String) item.getTitle();
        //switch (item.getItemId()) {
            //case R.id.mSettings:
                //text = (String) item.getTitle();
                //break;
            //case R.id.mSearch:
                //break;
            //case R.id.mExit:
                //break;
            //default:
                //break;
        //}
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
