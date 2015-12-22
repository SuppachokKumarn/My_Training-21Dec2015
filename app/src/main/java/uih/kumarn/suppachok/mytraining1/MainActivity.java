package uih.kumarn.suppachok.mytraining1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.LiveFolders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    //Explicit ประกาศตัวแปล
    private ListView trafficListView;
    private Button aboutMeButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();
        //Button Controller
        buttonController();

        //Listview Controller
        listViewController();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }   //Main Method

    private void listViewController() {

        //#1
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20,};
        //#2
        String[] strTitle = new String[20];;
        strTitle[0] = "หัวข้อที่ 1";
        strTitle[1] = "หัวข้อที่ 2";
        strTitle[2] = "หัวข้อที่ 3";
        strTitle[3] = "หัวข้อที่ 4";
        strTitle[4] = "หัวข้อที่ 5";
        strTitle[5] = "หัวข้อที่ 6";
        strTitle[6] = "หัวข้อที่ 7";
        strTitle[7] = "หัวข้อที่ 8";
        strTitle[8] = "หัวข้อที่ 9";
        strTitle[9] = "หัวข้อที่ 10";
        strTitle[10] = "หัวข้อที่ 11";
        strTitle[11] = "หัวข้อที่ 12";
        strTitle[12] = "หัวข้อที่ 13";
        strTitle[13] = "หัวข้อที่ 14";
        strTitle[14] = "หัวข้อที่ 15";
        strTitle[15] = "หัวข้อที่ 16";
        strTitle[16] = "หัวข้อที่ 17";
        strTitle[17] = "หัวข้อที่ 18";
        strTitle[18] = "หัวข้อที่ 19";
        strTitle[19] = "หัวข้อที่ 20";

        //#3
        String[] strDetail = getResources().getStringArray(R.array.detail_short);
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, strTitle, strDetail, intIcon);
        trafficListView.setAdapter(objMyAdapter);

    }   //ListViewController

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer buttomMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                buttomMediaPlayer.start();

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/09R8_2nJtjg"));
                startActivity(objIntent);
            } //event
        });

    }


    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://uih.kumarn.suppachok.mytraining1/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://uih.kumarn.suppachok.mytraining1/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}   //Main Class
