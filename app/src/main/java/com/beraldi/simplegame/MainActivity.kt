package com.beraldi.simplegame

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyView(this))
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
    }
}