package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        val arguments: Bundle? = intent.extras

        if(arguments!= null){
            var dog = Dog()
            dog = arguments.getSerializable(dog.javaClass.simpleName) as Dog

            val textViewBreed: TextView = findViewById(R.id.textViewBreed)
            val textViewMouthBeth: TextView = findViewById(R.id.textViewMouthBeth)
            val textViewYearBeth: TextView = findViewById(R.id.textViewYearBeth)
            textViewBreed.text  = textViewBreed.text.toString() + dog.getBreed()
            textViewMouthBeth.text = textViewMouthBeth.text.toString() + dog.getMouthOfBeth()
            textViewYearBeth.text = textViewYearBeth.text.toString() + dog.getYearOfBeth()
        }
    }
}