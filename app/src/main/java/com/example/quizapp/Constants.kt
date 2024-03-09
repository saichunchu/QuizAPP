package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String ="total_questions"
    const val CORRECT_ANSWERS : String ="correct_answer"




    fun getQuestions(): ArrayList<Question>{
        val questionList =ArrayList<Question>()


          val que1=Question(
              1,
              "what  country does flag belong to",
              R.drawable.ic_flag_of_belgium,
              "Belgium",
              "Argentia",
              "India",
              "Austraila",
              1
          )
        questionList.add(que1)

        //2

        val que2=Question(
            2,
            "what  country does flag belong to",
            R.drawable.ic_flag_of_brazil,
            "Belgium",
            "Brazil",
            "India",
            "Austraila",
            2
        )
        questionList.add(que2)
        //3

        val que3=Question(
            3,
            "what  country does flag belong to",
            R.drawable.ic_flag_of_argentina,
            "Belgium",
            "Argentia",
            "India",
            "Austraila",
            2
        )
        questionList.add(que3)

        //4

        val que4=Question(
            4,
            "what  country does flag belong to",
            R.drawable.ic_flag_of_australia,
            "Belgium",
            "Argentia",
            "India",
            "Austraila",
            4
        )
        questionList.add(que4)

        //5

        val que5=Question(
            5,
            "what  country does flag belong to",
            R.drawable.ic_flag_of_denmark,
            "Belgium",
            "Argentia",
            "Denmark",
            "Austraila",
            3
        )
        questionList.add(que5)

        //6

        val que6=Question(
            6,
            "what  country does flag belong to",
            R.drawable.ic_flag_of_fiji,
            "Belgium",
            "Fiji",
            "India",
            "Austraila",
            2
        )
        questionList.add(que6)

        //7

        //8

        val que7=Question(
            7,
            "what  country does flag belong to",
            R.drawable.ic_flag_of_germany,
            "Belgium",
            "Argentia",
            "India",
            "Germany",
            4
        )
        questionList.add(que7)

        //8

        val que8=Question(
            8,
            "what  country does flag belong to",
            R.drawable.ic_flag_of_india,
            "Belgium",
            "Argentia",
            "India",
            "Austraila",
            3
        )
        questionList.add(que8)

        //10

        val que9=Question(
            9,
            "what does country does falg belong to",
            R.drawable.ic_flag_of_kuwait,
            "Belgium",
            "Argentia",
            "India",
            "Kuwait",
            4
        )
        questionList.add(que9)




        return questionList
    }
}