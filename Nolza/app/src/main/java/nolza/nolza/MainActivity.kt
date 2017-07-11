package nolza.nolza

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.actv_main.*
import nolza.nolza.base.BaseActivity
import nolza.nolza.tools.BottomNavigationViewHelper


class MainActivity : BaseActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.actv_main)
        super.onCreate(savedInstanceState)

    }

    override fun initLayout() {
        bottomNavigation.getMenu().getItem(0).setChecked(false)
        viewPager.adapter = MainFragmentAdapter(supportFragmentManager)
        BottomNavigationViewHelper.disableShiftMode(bottomNavigation)
    }

    val MAIN_FRAGMENT = 0
    val SEARCH_FRAGMENT = 1
    val HISTORY_FRAGMENT = 2
    val PROFILE_FRAGMETN = 3

    inner class MainFragmentAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

        override fun getCount(): Int {
            return 1
        }

        override fun getItem(position: Int): Fragment {
            when (position) {
                MAIN_FRAGMENT -> return MainFragment.newInstance()
                else -> return MainFragment.newInstance()
            }
        }
    }
}
