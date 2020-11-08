package nabil.kotlin.kotlinquiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Indonesia",
            "Brazil",
            "Kanada",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Amerika Serikat",
            "Australia",
            "Brazil",
            "Kanada",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Prancis",
            "Jerman",
            "Swiss",
            "Belgia",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Luxemburg",
            "Indonesia",
            "Brazil",
            "Kanada",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Norwegia",
            "Swedia",
            "Islandia",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Kepulauan Fiji",
            "Papua Nugini",
            "Srilanka",
            "Selandia Baru",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belanda",
            "Jerman",
            "Prancis",
            "Italia",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Bhutan",
            "China",
            "Pakistan",
            "India",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Qatar",
            "Kuwait",
            "Arab Saudi",
            "Jordania",
            2
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Selandia Baru",
            "Australia",
            "Russia",
            "Inggris",
            1
        )
        questionsList.add(que10)

        return questionsList
    }

}