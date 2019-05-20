package com.vague.roomword.data

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.vague.roomword.model.Word

class WordRepository(private val wordDao: WordDao) {

    val allWordsn: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}