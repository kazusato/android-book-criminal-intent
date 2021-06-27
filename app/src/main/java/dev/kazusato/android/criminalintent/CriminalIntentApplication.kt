package dev.kazusato.android.criminalintent

import android.app.Application
import dev.kazusato.android.criminalintent.repository.CrimeRepository

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }

}