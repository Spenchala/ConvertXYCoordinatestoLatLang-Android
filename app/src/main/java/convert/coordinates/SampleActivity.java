package convert.coordinates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;
import com.jhlabs.map.proj.ProjectionUtils;
import com.jhlabs.map.proj.StateProjection;

public class SampleActivity extends AppCompatActivity {
    // US Survey Feet coordinates
    double x = 1174537.0;
    double y = 1861156.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        //Converts X and Y Co-Ordinates to Lat Lang
        LatLng latlang = ProjectionUtils.getLatLng(this,StateProjection.ILLINOIS_STATE_PLANE, x, y);
        Log.i(this.getClass().getCanonicalName(), "Converted Latitide : "+ latlang.latitude +", Longitude : "+ latlang.longitude);
        ((TextView)findViewById(R.id.tv)).setText("Converted Latitide : "+ latlang.latitude +"\n Longitude : "+ latlang.longitude);
    }

}
