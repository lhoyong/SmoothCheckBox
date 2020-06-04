package com.github.lhoyong.smoothcheckbox

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.lhoyong.checkbox.SmoothCheckBox
import kotlinx.android.synthetic.main.activity_listview.*
import java.io.Serializable
import java.util.ArrayList

class SampleListViewActivity : AppCompatActivity() {
    private val mList = ArrayList<Bean>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        for (i in 0..99) {
            mList.add(Bean())
        }

        lv.adapter = object : BaseAdapter() {
            override fun getCount(): Int {
                return mList.size
            }

            override fun getItem(position: Int): Any {
                return mList[position]
            }

            override fun getItemId(position: Int): Long {
                return 0
            }

            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                var convertView = convertView
                val holder: ViewHolder
                if (convertView == null) {
                    holder = ViewHolder()
                    convertView = View.inflate(this@SampleListViewActivity, R.layout.item, null)
                    holder.tv = convertView!!.findViewById(R.id.tv) as TextView
                    holder.cb = convertView.findViewById(R.id.scb) as SmoothCheckBox
                    convertView.tag = holder
                } else {
                    holder = convertView.tag as ViewHolder
                }

                val bean = mList[position]
                holder.cb!!.setOnCheckedChangeListener(object : SmoothCheckBox.OnCheckedChangeListener {
                    override fun onCheckedChanged(checkBox: SmoothCheckBox, isChecked: Boolean) {
                        bean.isChecked = isChecked
                    }

                    override fun onCheckedAnimatedFinished(checkBox: SmoothCheckBox, isChecked: Boolean) {

                    }
                })
                val text = getString(R.string.string_item_subffix) + position
                holder.tv!!.text = text
                holder.cb!!.isChecked = bean.isChecked

                return convertView
            }

            inner class ViewHolder {
                var cb: SmoothCheckBox? = null
                var tv: TextView? = null
            }
        }
        lv.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val bean = parent.adapter.getItem(position) as Bean
            bean.isChecked = !bean.isChecked
            val checkBox = view.findViewById(R.id.scb) as SmoothCheckBox
            checkBox.setChecked(bean.isChecked, true)
        }
    }

    internal inner class Bean : Serializable {
        var isChecked: Boolean = false
    }
}
