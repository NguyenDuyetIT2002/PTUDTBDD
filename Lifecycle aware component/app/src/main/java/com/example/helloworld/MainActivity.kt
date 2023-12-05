package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {

    private val lifecycleObserver = MyObserver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 3:  Đăng ký MyObserver với Lifecycle của MainActivity
        lifecycle.addObserver(lifecycleObserver)
    }

    // Step 4: Mô phỏng các sự kiện Lifecycle để kiểm tra log
    override fun onStart() {
        super.onStart()
        lifecycleObserver.onStateChanged(this, Lifecycle.Event.ON_START)
    }

    override fun onResume() {
        super.onResume()
        lifecycleObserver.onStateChanged(this, Lifecycle.Event.ON_RESUME)
    }

    override fun onPause() {
        super.onPause()
        lifecycleObserver.onStateChanged(this, Lifecycle.Event.ON_PAUSE)
    }

    override fun onStop() {
        super.onStop()
        lifecycleObserver.onStateChanged(this, Lifecycle.Event.ON_STOP)
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleObserver.onStateChanged(this, Lifecycle.Event.ON_DESTROY)
    }
}
