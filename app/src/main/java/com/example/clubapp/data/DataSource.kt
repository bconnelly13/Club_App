package com.example.clubapp.data

import com.example.clubapp.R
import com.example.clubapp.model.Club

object DataSource {
    val clubs: List<Club> = listOf(
            Club(
                R.drawable.computer_science,
                "Computer Science Club",
                mutableListOf("Thursday"),
                true
            ),
            Club(
                R.drawable.academic_ambush,
                "Academic Ambush Team",
                mutableListOf("Monday"),
                false
            ),
            Club(
                R.drawable.chem_club,
                "Chemistry Club",
                mutableListOf("Wednesday"),
                false
            ),
            Club(
                R.drawable.chessclub,
                "Chess Club",
                mutableListOf("Wednesday"),
                true
            ),
            Club(
                R.drawable.dnd_club,
                "Dungeons & Dragons Club",
                mutableListOf("Tuesday"),
                false
            ),
            Club(
                R.drawable.euchre,
                "Euchre Club",
                mutableListOf("Friday"),
                true
            ),
            Club(
                R.drawable.geoguesser,
                "Geoguesser Club",
                mutableListOf("Tuesday"),
                false
            ),
            Club(
                R.drawable.girls_who_code,
                "Girls Who Code",
                mutableListOf("Monday"),
                false
            ),
            Club(
                R.drawable.kpop,
                "K-Pop Club",
                mutableListOf("Wednesday"),
                false
            ),
            Club(
                R.drawable.model_united_nation,
                "Model United Nations",
                mutableListOf("Tuesday"),
                false
            ),
            Club(
                R.drawable.orchestra,
                "Orchestra Club",
                mutableListOf("Monday"),
                false
            ),
            Club(
                R.drawable.scrabble,
                "Scrabble Club",
                mutableListOf("Wednesday"),
                false
            ),
            Club(
                R.drawable.tiger_ambassadors,
                "Tiger Ambassadors",
                mutableListOf("Tuesday"),
                false
            )
        )
    val otherClubs: List<Club> = listOf(
        Club(
            R.drawable.computer_science,
            "Computer Science Club",
            mutableListOf("Thursday"),
            true
        ),
        Club(
            R.drawable.chessclub,
            "Chess Club",
            mutableListOf("Wednesday"),
            true
        ),
        Club(
            R.drawable.euchre,
            "Euchre Club",
            mutableListOf("Friday"),
            true
        ),
    )
}