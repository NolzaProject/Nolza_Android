package nolza.nolza

import android.os.Bundle
import com.jakewharton.rxbinding2.view.clicks
import nolza.nolza.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar_next.*


/**
 * Created by choijinjoo on 2017. 6. 25..
 */
class JoinActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.actv_join)
        super.onCreate(savedInstanceState)
    }

    override fun initLayout() {
        btnNext.clicks()
                .subscribe { moveToNextActivity() }
    }

    fun moveToNextActivity() {
        startActivity(MainActivity.newIntent(this))
        finish()
    }
}