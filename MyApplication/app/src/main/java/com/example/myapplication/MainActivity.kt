package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("LifeCycle", "MenuActivity on create")

        buttonListener()

    }

    private fun buttonListener(){
        binding.starterButton.setOnClickListener {
            Log.d("button","Click sur button entrée")
            Toast.makeText(this, "Entrée", Toast.LENGTH_LONG).show()
            showCategory(Category.STARTER)
        }

        binding.mainButton.setOnClickListener {
            Log.d("button","Click sur button plats")
            showCategory(Category.MAIN)
        }

        binding.finishButton.setOnClickListener {
            Log.d("button","Click sur button desserts")
            showCategory(Category.DESSERT)
        }
    }

    private fun showCategory(category: Category) {
        val intent = Intent(this,MenuActivity::class.java)
        intent.putExtra(MenuActivity.extraKey, category)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "MenuActivity on start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "MenuActivity on resume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "MenuActivity on start")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "MenuActivity on destroy")

    }


}