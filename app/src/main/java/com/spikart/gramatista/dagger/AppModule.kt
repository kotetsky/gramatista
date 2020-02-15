package com.spikart.gramatista.dagger

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (val app : Application) {

    @Provides
    @Singleton
    fun provideApplication () = app

    @Provides
    @Singleton
    fun provideDatabase (app: Application) {

    }
}