package com.dawissem.quizsbou3i

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dawissem.quizsbou3i.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var quizModellList:MutableList<QuizModel>
    lateinit var adapter: QuizListAdapter
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModellList= mutableListOf()
        getDataFromFirebase()

    }

        private fun setupRecyclerView(){
            adapter= QuizListAdapter(quizModellList )
            binding.recyclerView.layoutManager=LinearLayoutManager(this)
            binding.recyclerView.adapter=adapter

        }

    private fun getDataFromFirebase(){
        quizModellList.add(QuizModel(id="1", title = "niveau 0" , description = "ahahaha", time="5"))
        quizModellList.add(QuizModel(id="2", title = "niveau 1" , description = "gztegt", time="4"))
        quizModellList.add(QuizModel(id="1", title = "niveau 2" , description = "gea", time="3"))
        setupRecyclerView()
    }
}