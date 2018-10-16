package com.saitanwgpha.recycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recycleView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))
        users.add(User("Sai Pha", "Tai State"))

        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }
}
