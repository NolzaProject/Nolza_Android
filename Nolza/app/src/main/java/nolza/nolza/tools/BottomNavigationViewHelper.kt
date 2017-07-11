package nolza.nolza.tools

import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.util.Log

object BottomNavigationViewHelper {
    fun disableShiftMode(view: BottomNavigationView) {
        var menuView = view.getChildAt(0) as BottomNavigationMenuView
        try {
            val shiftingMode = BottomNavigationMenuView::class.java.getDeclaredField("mShiftingMode")
            shiftingMode.setAccessible(true)
            shiftingMode.setBoolean(menuView, false)
            shiftingMode.setAccessible(false)
            for (i in 0..menuView.getChildCount() - 1) {
                val item = menuView.getChildAt(i) as BottomNavigationItemView

                item.setShiftingMode(false)
                // set once again checked value, so view will be updated

                item.setChecked(item.getItemData().isChecked())
            }
        } catch (e: NoSuchFieldException) {
            Log.e("BNVHelper", "Unable to get shift mode field", e)
        } catch (e: IllegalAccessException) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e)
        }

    }
}