package jp.techacademy.madoka.iwasaki

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("山田", 20, "サッカー")
        human1.say()
        human1.think()
        val human2 = Human("鈴木", 30, "野球")
        human2.say()
        human2.think()
    }

}