package dev.kazusato.android.criminalintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.kazusato.android.criminalintent.fragment.CrimeFragment
import dev.kazusato.android.criminalintent.fragment.CrimeListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment == null) {
            val fragment = CrimeListFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
    }
}