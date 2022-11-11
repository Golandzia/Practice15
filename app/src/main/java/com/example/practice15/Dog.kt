package com.example.practice15

import java.io.Serializable

class Dog() : Serializable {

    constructor(_breed: String, _mouthOfBeth: Int, _yearOfBeth: Int) :this() {
        breed = _breed
        mouthOfBeth = _mouthOfBeth
        yearOfBeth = _yearOfBeth
    }

    private var breed: String = ""
    fun getBreed(): String = breed
    fun setBreed(_breed: String){
        breed = _breed
    }

    private var mouthOfBeth = 0
    fun getMouthOfBeth(): Int = mouthOfBeth
    fun setMouthOfBeth(_mouthOfBeth: Int){
        mouthOfBeth = _mouthOfBeth
    }

    private var yearOfBeth = 0
    fun getYearOfBeth(): Int = yearOfBeth
    fun setYearOfBeth(_yearOfBeth: Int){
        yearOfBeth = _yearOfBeth
    }


}