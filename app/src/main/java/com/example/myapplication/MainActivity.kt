package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        supportActionBar?.title = "Main Menu"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //if (item.itemId == android.R.id.home) finish()
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.mOpen ->{
                showToast(1, "Open file")
            }
            R.id.mSave ->{
                showToast(1, "Save file")
            }
            R.id.mSearch ->{
                showToast(1, "Search file")
            }
            R.id.mDelete ->{
                showToast(1, "Delete file", 100,100)
            }
        }
        return true
    }
    fun showToast(id:Int, text:String, x:Int = 0, y:Int = 30){
        var toast: Toast
        var image: ImageView

        when(id) {
            1 ->{
                Toast.makeText(this, text, Toast.LENGTH_LONG).show()
            }
            2->{
                toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
                toast.setGravity(Gravity.CENTER, x,y)
                toast.show()
            }
        }
    }
}