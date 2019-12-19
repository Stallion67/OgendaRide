package com.example.ogenda_ride

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.pusher.pushnotifications.PushNotifications;


class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         PushNotifications.start(getApplicationContext(), "dee7d337-5964-4b79-aa45-e94d55cdc2d1");
         PushNotifications.addDeviceInterest("hello");
     }
}
