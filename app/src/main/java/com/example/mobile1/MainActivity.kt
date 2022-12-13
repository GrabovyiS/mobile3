package com.example.mobile1

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile1.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }

    private fun initialize() {
        recyclerView = binding.recyclerView
        adapter = MyAdapter()
        recyclerView.adapter = adapter
        adapter.setList(createList())
    }



    private fun createList(): ArrayList<MyModel> {
        val personList = ArrayList<MyModel>()

        personList.add(MyModel(R.drawable.question_mark,"Иисус Христос","5 год до н. э. - 30 год н. э.","Основатель и центральная личность христианства, предсказанный в Ветхом Завете Мессия","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.nietzsche,"Фридрих Ницше","1844 - 1900","Философ, культурный критик и филолог, чьи работы оказали глубокое влияние на современную философию","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.dostoevskiy,"Фёдор Достоевский","1821 - 1881","Религиозный русский писатель, мыслитель, философ и публицист, классик мировой литературы","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.question_mark,"Апостол Павел","~5 - ~64","Проповедник христианства в римской империи и не только, автор нескольких книг Библии","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.isabel,"Изабелла I","1451 - 1504","Королева Кастилии и Леона. Супруга Фердинанда II, чей брак положил начало объединению Испании в единое государство.","ЖЕНСКИЙ"))
        personList.add(MyModel(R.drawable.napoleon,"Наполеон Бонапарт","1769 - 1821","Император французов (фр. Empereur des Français) в 1804—1814 и 1815 годах, полководец и государственный деятель","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.louis_pasteur,"Луи Пастер","1822 - 1895","Французский химик и микробиолог, один из основоположников микробиологии, создатель научных основ вакцин","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.question_mark,"Моисей","XIV—XIII века до н. э.","Еврейский пророк и законодатель, основоположник иудаизма, организовал исход евреев из Египта","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.marin_luther,"Мартин Лютер","1483 - 1546","Христианский богослов, ключевой основатель протестантизма, ведущий переводчик Библии на немецкий язык","МУЖСКОЙ"))
        personList.add(MyModel(R.drawable.fleming,"Александр Флеминг","1881 - 1955","Британский микробиолог. Открыл лизоцим и впервые выделил пенициллин из плесневых грибов","МУЖСКОЙ"))

        return personList
    }
}