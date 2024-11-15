package com.example.simpleadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleadapter.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.lv)

        val products = listOf(
            mapOf("name" to "Produit1", "price" to "1.5dh" ),
            mapOf("name" to "Produit2", "price" to "2.5dh"),
            mapOf("name" to "Produit3", "price" to "0.5dh"),
            mapOf("name" to "Produit4", "price" to "6.5dh"),
            mapOf("name" to "Produit4", "price" to "10.00dh")

        )

        //creer un simpleAdapter

        var adapter = SimpleAdapter( this, products,
            android.R.layout.simple_list_item_2,
            arrayOf("name", "price"),
            intArrayOf(android.R.id.text1, android.R.id.text2)
        )

        // Associer l'adapter a la listView
        listView.adapter = adapter
    }
}
