package com.example.a9_14_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var words: String="";
    var nums: Int=0;
    var set: Boolean=false
    var add: Boolean=true
    var cont: Boolean=true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun plus(view: View){
        set=true
        add=true
    }
    fun minus(view: View){
        set=true
        add=false
    }

    fun buttonA(view: View){

        if (set) {
            if (add) {
                words += "A";
                Toast.makeText(this, words, Toast.LENGTH_SHORT).show()
            }else{
                if (words!=""){
                    words=words.substring(0, words.length-1)
                    Toast.makeText(this, words, Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(this, "Cant do anything", Toast.LENGTH_SHORT).show()
                }

            }
        }else{
            Toast.makeText(this, "impossible situation", Toast.LENGTH_SHORT).show()
        }
    }
    fun buttonB(view: View){
        if (set) {
            if (add) {
                words += "B";
                Toast.makeText(this, words, Toast.LENGTH_SHORT).show()
            }else{
                if (words!=""){
                    words=words.substring(0, words.length-1)
                    Toast.makeText(this, words, Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(this, "Cant do anything", Toast.LENGTH_SHORT).show()
                }
            }
        }else{
            Toast.makeText(this, "impossible situation", Toast.LENGTH_SHORT).show()
        }
    }
    fun buttonC(view: View){
        if (set) {
            if (add) {
                words += "C";
                Toast.makeText(this, words, Toast.LENGTH_SHORT).show()
            }else{
                if (words!=""){
                    words=words.substring(0, words.length-1)
                    Toast.makeText(this, words, Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(this, "Cant do anything", Toast.LENGTH_SHORT).show()
                }
            }
        }else{
            Toast.makeText(this, "impossible situation", Toast.LENGTH_SHORT).show()
        }
    }

    fun button1(view: View){
        if (set) {
            if (add) {
                nums += 1;
                Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()
            }else{
                if (cont) {
                    if (nums > 0) {
                        nums -= 1;
                        if (nums<0) {
                            Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this, "Cant go negative", Toast.LENGTH_SHORT).show()
                            nums=0
                        }
                        Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()
                        if (nums < 0) {
                            cont = false
                        }
                    } else {
                        Toast.makeText(this, "Cant do anything", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(this, "Cant go negative", Toast.LENGTH_SHORT).show()
                }
            }
        }else{
            Toast.makeText(this, "impossible situation", Toast.LENGTH_SHORT).show()
        }
    }
    fun button2(view: View){
        if (set) {
            if (add) {
                nums += 2;
                Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()
            }else{
                if (cont) {
                    if (nums > 0) {
                        nums -= 2;
                        if (nums<0) {
                            Toast.makeText(this, "Cant go negative", Toast.LENGTH_SHORT).show()
                            nums=0
                        }else{
                            Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()

                        }

                        if (nums < 0) {
                            cont = false
                        }
                    } else {
                        Toast.makeText(this, "Cant do anything", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(this, "Cant go negative", Toast.LENGTH_SHORT).show()
                }
            }
        }else{
            Toast.makeText(this, "impossible situation", Toast.LENGTH_SHORT).show()
        }
    }
    fun button3(view: View){
        if (set) {
            if (add) {
                nums += 3;
                Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()
            }else{
                if (cont) {
                    if (nums > 0) {
                        nums -= 3
                        if (nums<0) {
                            Toast.makeText(this, "Cant go negative", Toast.LENGTH_SHORT).show()
                            nums=0

                        }else{
                            Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()

                        }
                        Toast.makeText(this, nums.toString(), Toast.LENGTH_SHORT).show()
                        if (nums < 0) {
                            cont = false
                        }
                    } else {
                        Toast.makeText(this, "Cant do anything", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(this, "Cant go negative", Toast.LENGTH_SHORT).show()
                }
            }
        }else{
            Toast.makeText(this, "impossible situation", Toast.LENGTH_SHORT).show()
        }
    }
}