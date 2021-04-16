package com.ahanna.marvelstudiosapp.characters

class CharactersRepository {

    companion object {
        private var instance: CharactersRepository? = null

        fun getInstance(): CharactersRepository {
            if (instance == null) {
                instance = CharactersRepository()
            }
            return instance!!
        }
    }




}