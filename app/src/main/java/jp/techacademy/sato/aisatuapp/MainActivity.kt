package jp.techacademy.sato.aisatuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.app.TimePickerDialog
import android.util.Log

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                val msg =
                    when (hour) {
                        in 2..9 -> "おはよう"
                        in 10..17 -> "こんにちは"
                        else -> "こんばんは"
                    }
                textView.text = msg
            },
            0, 0, true)
        timePickerDialog.show()
    }
}