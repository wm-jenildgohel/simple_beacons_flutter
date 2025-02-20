package com.umair.beacons_plugin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
//import io.flutter.view.FlutterMain
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.loader.FlutterLoader
import io.flutter.FlutterInjector

class BeaconsBroadcastReceiver : BroadcastReceiver() {
    companion object {
        private const val TAG = "BeaconsBroadcastReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        // FlutterMain.ensureInitializationComplete(context, null)
        FlutterInjector.instance().flutterLoader().startInitialization(context)
        FlutterInjector.instance().flutterLoader().ensureInitializationComplete(context, null)
        BeaconsPlugin.startBackgroundService(context)
    }
}
