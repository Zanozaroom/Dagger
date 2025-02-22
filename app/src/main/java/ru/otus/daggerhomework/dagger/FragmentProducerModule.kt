package ru.otus.daggerhomework.dagger

import androidx.lifecycle.MutableLiveData
import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.otus.daggerhomework.*

@Module()
class FragmentProducerModule {

   @FragmentScope
    @Provides
    fun provideProduser(
        generator: ColorGenerator,
        context: MainActivity,
        mutableData: MutableLiveData<Int>
    ): ViewModelProducer {
        return ViewModelProducer(generator, context, mutableData)
    }
}

@Module
abstract class Implement {
    @FragmentScope
    @Binds
    abstract fun toGenerator(generator: ColorGeneratorImpl): ColorGenerator
}