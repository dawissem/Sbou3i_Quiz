package com.dawissem.quizsbou3i

data class QuizModel(

    val id :String,
    val title:String,
    val description:String,
    val time:String,
){
    constructor() : this("","","","", )
}
