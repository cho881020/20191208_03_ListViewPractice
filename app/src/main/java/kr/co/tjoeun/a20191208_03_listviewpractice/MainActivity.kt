package kr.co.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.a20191208_03_listviewpractice.adapters.StudentAdapter
import kr.co.tjoeun.a20191208_03_listviewpractice.adapters.UserAdapter
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {
    
//    테스트용 주석

    var studentAdapter:StudentAdapter? = null

    val studentList = ArrayList<User>()

    val secondStudentList = ArrayList<User>()

    var userAdapter:UserAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생목록 추가
        addStudents()

        userAdapter = UserAdapter(this, R.layout.user_list_item, studentList)
        userListView.adapter = userAdapter

        addSecondStudents()

        studentAdapter = StudentAdapter(this, R.layout.student_list_item, secondStudentList)
        secondListView.adapter = studentAdapter


    }


    fun addSecondStudents() {

        secondStudentList.add(User("조경진", "서울시 은평구", false))
        secondStudentList.add(User("황연하", "경기도 성남시", true))
        secondStudentList.add(User("차순혁", "서울시 구로구", false))
        secondStudentList.add(User("계석준", "서울시 도봉구", false))
        secondStudentList.add(User("김미현", "경기도 군포시", true))
        secondStudentList.add(User("김영호", "서울시 은평구", false))
        secondStudentList.add(User("노혜진", "서울시 강동구", true))
        secondStudentList.add(User("류찬울", "서울시 어딘가", false))
        secondStudentList.add(User("양성심", "서울시 관악구", true))
        secondStudentList.add(User("이규현", "서울시 도봉구", false))
        secondStudentList.add(User("이수정", "경기도 고양시", true))
        secondStudentList.add(User("박보영", "서울시 은평구", false))
        secondStudentList.add(User("아이유", "경기도 성남시", true))
        secondStudentList.add(User("박보검", "서울시 구로구", false))
        secondStudentList.add(User("차은우", "서울시 도봉구", false))
        secondStudentList.add(User("유재석", "경기도 군포시", true))
    }

    fun addStudents() {
        studentList.add(User("계석준", "서울시 도봉구", false))
        studentList.add(User("김미현", "경기도 군포시", true))
        studentList.add(User("김영호", "서울시 은평구", false))
        studentList.add(User("노혜진", "서울시 강동구", true))
        studentList.add(User("류찬울", "서울시 어딘가", false))
        studentList.add(User("양성심", "서울시 관악구", true))
        studentList.add(User("이규현", "서울시 도봉구", false))
        studentList.add(User("이수정", "경기도 고양시", true))
        studentList.add(User("차순혁", "서울시 구로구", false))
        studentList.add(User("황연하", "경기도 성남시", true))
        studentList.add(User("조경진", "서울시 은평구", false))
    }

}







