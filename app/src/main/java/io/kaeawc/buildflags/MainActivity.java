package io.kaeawc.buildflags;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView version_name = (TextView) findViewById(R.id.version_name);
        TextView version_code = (TextView) findViewById(R.id.version_code);
        TextView build_date = (TextView) findViewById(R.id.build_date);
        TextView build_time = (TextView) findViewById(R.id.build_time);
        TextView built_with_tag = (TextView) findViewById(R.id.built_with_tag);
        TextView built_on_travis = (TextView) findViewById(R.id.built_on_travis);
        TextView release_candidate = (TextView) findViewById(R.id.release_candidate);
        TextView play_store_release = (TextView) findViewById(R.id.play_store_release);

        version_name.setText(String.format("VERSION_NAME: %s", BuildConfig.VERSION_NAME));
        version_code.setText(String.format("VERSION_CODE: %s", BuildConfig.VERSION_CODE));
        build_date.setText(String.format("BUILD_DATE: %s", BuildConfig.BUILD_DATE));
        build_time.setText(String.format("BUILD_TIME: %s", BuildConfig.BUILD_TIME));
        built_with_tag.setText(String.format("BUILT_WITH_TAG: %s", BuildConfig.BUILT_WITH_TAG));
        built_on_travis.setText(String.format("BUILT_ON_TRAVIS: %s", BuildConfig.BUILT_ON_TRAVIS));
        release_candidate.setText(String.format("RELEASE_CANDIDATE: %s", BuildConfig.RELEASE_CANDIDATE));
        play_store_release.setText(String.format("PLAY_STORE_RELEASE: %s", BuildConfig.PLAY_STORE_RELEASE));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
