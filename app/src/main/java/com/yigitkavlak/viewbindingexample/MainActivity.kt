package com.yigitkavlak.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yigitkavlak.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.changeButton.setOnClickListener {
            changeText()
        }
    }

  fun changeText (){
      if(binding.textView.text.equals("TextView is Changed.")){
          binding.textView.text = "View Binding Example"
      }else binding.textView.text = "TextView is Changed."
  }
}