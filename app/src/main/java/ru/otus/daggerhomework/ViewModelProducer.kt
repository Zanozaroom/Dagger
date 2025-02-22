package ru.otus.daggerhomework

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.MutableLiveData
import ru.otus.daggerhomework.dagger.FragmentScope
import javax.inject.Inject
import javax.inject.Named

@FragmentScope
class ViewModelProducer @Inject constructor(
    private val colorGenerator: ColorGenerator,
    val context: Context,
    private val mutableData: MutableLiveData<Int>
) {

    fun generateColor() {
        if (context !is FragmentActivity) throw RuntimeException("Здесь нужен контекст активити")
        Toast.makeText(context, "Color sent", Toast.LENGTH_LONG).show()
        mutableData.value = colorGenerator.generateColor()
    }
}