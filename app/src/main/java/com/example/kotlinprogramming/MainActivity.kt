package com.example.kotlinprogramming

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {


    private  var name :String = "vikash"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name:String = getStringName()
        Log.i("the string name is $name ","$name")
    }


    private fun getStringName():String{
        return name
    }


    private fun arrayExample(){
        val intrestingThings = arrayOf("vikash","vishal","randhir")
        print(intrestingThings.size)

        val map = mapOf(1 to "a",2 to "b",3 to "c",4 to "d")
       // map.forEach { key, value -> println("key is $key & value is $value")  }


        for (inrestElement in intrestingThings){
            println(inrestElement)
        }

        intrestingThings.forEach {
            println(it)
        }
        
        intrestingThings.forEachIndexed { index, s ->

            println("intresting thing $s is at inex $index")
        }


    }
}
