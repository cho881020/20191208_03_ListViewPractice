package kr.co.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tempUser = User("조경진", "서울시 은평구", false)

        Log.d("사용자주소", tempUser.address)

        val tempUser2 = User()
        Log.d("사용자주소", tempUser2.address)


    }
}







