package happy.mjstudio.koinsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf


typealias Latitude = Double

class MainActivity : AppCompatActivity() {

    val latitude : Latitude = 32.6

    val 칵 : 칵테일 by inject{
        parametersOf(1997)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("TAG",칵.year.toString())
    }
}