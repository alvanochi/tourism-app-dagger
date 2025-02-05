package com.dicoding.tourismapp.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)

@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)

//Dagger memungkinkan Anda untuk melakukan Injection pada banyak Object sekaligus
//dengan tipe yang sama.
//Caranya yaitu dengan memberikan Key pada ViewModel dan meng-inject-nya dalam bentuk Map