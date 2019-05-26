package com.anwesh.uiprojects.linkedcirclejointriangleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.circlejointriangleview.CircleJoinTriangleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CircleJoinTriangleView.create(this)
    }
}
