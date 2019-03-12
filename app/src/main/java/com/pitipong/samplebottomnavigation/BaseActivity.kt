package com.pitipong.samplebottomnavigation

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.graphics.Rect
import android.widget.EditText
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager


abstract class BaseActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

//    fun nextActivityWithAnimation(activity: Activity) {
//        activity.overridePendingTransition(R.anim.right_in, R.anim.left_out)
//    }
//
//    fun finishActivityWithAnimation() {
//        finish()
//        overridePendingTransition(R.anim.left_in, R.anim.right_out)
//    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN) {
            val v = currentFocus
            if (v is EditText) {
                val outRect = Rect()
                v.getGlobalVisibleRect(outRect)
                if (!outRect.contains(event.rawX.toInt(), event.rawY.toInt())) {
                    v.clearFocus()
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(v.windowToken, 0)
                }
            }
        }
        return super.dispatchTouchEvent(event)
    }

}