package kr.feliz.tutorial_collection.utils

import androidx.lifecycle.MutableLiveData

class ListLiveData<T> : MutableLiveData<MutableList<T>>() {
    private val temp = mutableListOf<T>()

    init {
        value = temp
    }

    fun add(item: T) {
        temp.add(item)
        value = temp
    }

    fun addAll(items: List<T>){
        temp.addAll(items)
        value = temp
    }

    fun remove(item: T){
        temp.remove(item)
        value = temp
    }

    fun clear() {
        temp.clear()
        value = temp
    }

    fun init(items: List<T>) {
        temp.clear()
        temp.addAll(items)
        value = temp
    }

    fun getList(): MutableList<T> {
        return value ?: throw IllegalAccessError("Do not call empty list")
    }
}

