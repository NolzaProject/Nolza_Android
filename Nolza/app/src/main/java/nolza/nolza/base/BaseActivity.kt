package nolza.nolza.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by choijinjoo on 2017. 6. 25..
 */
abstract class BaseActivity : AppCompatActivity() {

    protected val disposables by lazy { CompositeDisposable() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initLayout()
        window.setBackgroundDrawable(null)
    }

    abstract fun initLayout()

    override fun onDestroy() {
        disposables.clear()
        super.onDestroy()
    }

}