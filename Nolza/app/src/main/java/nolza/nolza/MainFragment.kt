package nolza.nolza

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import nolza.nolza.base.BaseFragment
import kotlinx.android.synthetic.main.frag_main.*
import java.util.*


/**
 * Created by choijinjoo on 2017. 6. 25..
 */
class MainFragment : BaseFragment() {

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override val layoutId: Int
        get() = R.layout.frag_main


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        view?.parent?.let { viewParent -> (viewParent as ViewGroup).removeView(view) }
        return inflater?.inflate(R.layout.frag_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupLayout()
    }

    fun setupLayout() {
        val sample_url = "https://media.rocketpunch.com/cache/c6/ce/c6ce77a589653e43d94717c4945203b4.jpg"
        val urls = arrayListOf(sample_url)

        recvThemeMission.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
        recvThemeMission.adapter = MissionAdapter(activity, urls)

        recvMission.layoutManager = GridLayoutManager(activity, 3)
        recvMission.adapter = MissionAdapter(activity, urls)
    }
}