package happy.mjstudio.koinsample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * Created by mj on 07, October, 2019
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // use AndroidLogger as Koin Logger - default Level.INFO
            androidLogger()

            // use the Android context given there
            androidContext(this@MainApplication)

            // module list
            modules(재료창고)
            modules(술창고)

        }
    }
}

class Fruit

class Cider

class Coke

class 칵테일(
    val fruit : Fruit,
    val cider : Cider,
    val coke : Coke,
    val year : Int
) : IAlcohol

val 재료창고 = module {
    factory { Fruit() }
    factory { Cider() } bind Cider::class
    factory { Coke() }
}

val 술창고 = module {
    factory {

    }
    factory { (year : Int) ->
        칵테일(get(),get(),get(),year)
    }
}


interface IAlcohol





