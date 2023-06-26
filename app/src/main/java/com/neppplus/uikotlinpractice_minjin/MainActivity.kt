package com.neppplus.uikotlinpractice_minjin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.neppplus.uikotlinpractice_minjin.databinding.ActivityMainBinding // 추가

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 이 부분을 setContentView 이전으로 옮깁니다.
        setContentView(binding.root)

//        확인 버튼이 눌리면? 이벤트를 달아주자.
        binding.okBtn.setOnClickListener {
//            입력된 내용?: contentEdt의 text의 값. 조회 (get) 변수에 저장
            val inputContent = binding.contentEdt.text.toString()

//            저장해둔 입력값을 -> 텍스트뷰의 내용으로 반영 (set)
            binding.resultTxt.text = inputContent



        }
    }
}