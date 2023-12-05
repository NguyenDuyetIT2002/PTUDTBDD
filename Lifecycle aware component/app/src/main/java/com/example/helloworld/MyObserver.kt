package com.example.helloworld

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class MyObserver : LifecycleEventObserver {
    //Step 2: Tạo đối tượng LifecycleObserver, viết chồng các hàm bắt các sự kiện Lifecycle
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_CREATE -> Log.d("MyObserver", "OnCreate")
            Lifecycle.Event.ON_START -> Log.d("MyObserver", "OnStart")
            Lifecycle.Event.ON_RESUME -> Log.d("MyObserver", "OnResume")
            Lifecycle.Event.ON_PAUSE -> Log.d("MyObserver", "OnPause")
            Lifecycle.Event.ON_STOP -> Log.d("MyObserver", "OnStop")
            Lifecycle.Event.ON_DESTROY -> Log.d("MyObserver", "OnDestroy")
            else -> {}
        }
    }
}
