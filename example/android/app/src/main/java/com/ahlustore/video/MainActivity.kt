package com.ahlustore.video

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.ReactRootView
//import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;

class MainActivity : ReactActivity() {

    override fun getMainComponentName(): String? {
        return "ChatApp"
    }

//    override fun createReactActivityDelegate(): ReactActivityDelegate? {
//        return object : ReactActivityDelegate(this, mainComponentName) {
//            override fun createRootView(): ReactRootView {
//                return  RNGestureHandlerEnabledRootView(MainActivity.this);
//
//
//            }
//        }
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(null)
    }
}
