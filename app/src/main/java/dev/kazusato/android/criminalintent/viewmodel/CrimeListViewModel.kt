package dev.kazusato.android.criminalintent.viewmodel

import androidx.lifecycle.ViewModel
import dev.kazusato.android.criminalintent.repository.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

}