package android.teachersdunet.com.messengernow;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by angebagui on 25/06/2015.
 */
public class MessengerNowApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "HcErl8VZylnSMUbyeqeUOR8uAXNRHQoZfcWAhwOz", "qlZ7bDlZNg1WCTofiEwzMcSkHslp68T3c9hhPJ7B");
    }
}
