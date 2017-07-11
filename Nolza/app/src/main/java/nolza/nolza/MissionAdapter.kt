package nolza.nolza

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.CropCircleTransformation
import java.util.*
import kotlinx.android.synthetic.main.item_mission.view.*

/**
 * Created by choijinjoo on 2017. 6. 26..
 */
class MissionAdapter(var c: Context, var lists: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as ViewHolder).bindImage(c, lists.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(c).inflate(R.layout.item_mission, parent, false))
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindImage(context: Context, url: String) {
            Glide.with(context)
                    .load(url)
                    .bitmapTransform(CropCircleTransformation(context))
                    .into(itemView.imgvMission)
        }
    }
}