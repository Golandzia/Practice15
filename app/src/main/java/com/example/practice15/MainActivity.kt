package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendButton(view: View){
        val editTextTextBreed: EditText = findViewById(R.id.editTextTextBreed)
        val editTextTextYearOfBirth: EditText = findViewById(R.id.editTextTextYearOfBirth)
        val editTextTextMonthOfBirth: EditText = findViewById(R.id.editTextTextMonthOfBirth)

        val dog = Dog(editTextTextBreed.text.toString(), editTextTextMonthOfBirth.text.toString().toInt(), editTextTextYearOfBirth.text.toString().toInt())

        val toShow: Intent = Intent(this@MainActivity, ShowDataActivity::class.java)

        toShow.putExtra(dog.javaClass.simpleName, dog)

        startActivity(toShow)
    }

}