package com.dawissem.quizsbou3i

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dawissem.quizsbou3i.databinding.Sbou3iItemRecyclerRowBinding

class QuizListAdapter(private val quizModelList: List<QuizModel>) :
    RecyclerView.Adapter<QuizListAdapter.MyViewHolder>() {

    class MyViewHolder( private  val binding: Sbou3iItemRecyclerRowBinding ) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(model:QuizModel){

            }


       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizListAdapter.MyViewHolder {
 val binding= Sbou3iItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent ,false)
    return QuizListAdapter.MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
 return quizModelList.size    }

    override fun onBindViewHolder(holder: QuizListAdapter.MyViewHolder, position: Int) {
holder.bind(quizModelList[position])
    }
}