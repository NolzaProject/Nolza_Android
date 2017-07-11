package nolza.nolza.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by choijinjoo on 2017. 6. 26..
 */
data class Mission(var id: Int, var name: String) : Parcelable {
    companion object {
        @JvmField val CREATOR: Parcelable.Creator<Mission> = object : Parcelable.Creator<Mission> {
            override fun createFromParcel(source: Parcel): Mission = Mission(source)
            override fun newArray(size: Int): Array<Mission?> = arrayOfNulls(size)
        }
    }

    constructor(source: Parcel) : this(
            source.readInt(),
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(id)
        dest.writeString(name)
    }
}