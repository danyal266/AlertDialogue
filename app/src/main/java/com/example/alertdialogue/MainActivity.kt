package com.example.alertdialogue

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogue.MainActivity as MainActivity1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun exit(view: android.view.View) {
       val builder = AlertDialog.Builder(this)
           .setIcon(R.drawable.ic_baseline_warning_24)
           .setTitle("Exit")
           .setMessage("are you sure you want to exit this app")
           .setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
               finish()
           }).setNeutralButton("Help",DialogInterface.OnClickListener { dialog, which ->
               Toast.makeText(this, "Press Yes to exit this app.", Toast.LENGTH_SHORT).show()
           }).setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss()
           }).show()  



    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
            .setIcon(R.drawable.ic_baseline_warning_24)
            .setTitle("Exit")
            .setMessage("are you sure you want to exit this app")
            .setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                finish()
            }).setNeutralButton("Help",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "Press Yes to exit this app.", Toast.LENGTH_SHORT).show()
            }).setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            }).show()
    }
}
