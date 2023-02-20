package com.example.myapplication

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var news: ArrayList<News> = ArrayList<News>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // начальная инициализация списка
        setInitialData()
        var list : ListView = findViewById(R.id.list)
        // создаем адаптер
        val newsAdapter = NewsAdapter(this, R.layout.news_list_item, news)
        // устанавливаем адаптер
        list.adapter = newsAdapter
        // слушатель выбора в списке
        val itemListener =
            OnItemClickListener { parent, v, position, id -> // получаем выбранный пункт
                val selectedState: News = parent.getItemAtPosition(position) as News
                Toast.makeText(
                    applicationContext, "Был выбран пункт " + selectedState.getTitle(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        list.setOnItemClickListener(itemListener)
    }

    private fun setInitialData() {
        news.add(News("News1", R.drawable.logo2))
        news.add(News("News2", R.drawable.logo2))
        news.add(News("News3", R.drawable.logo2))
        news.add(News("News4", R.drawable.logo2))
        news.add(News("News5", R.drawable.logo2))
    }

}