package com.glosaryconstarint.app.modules.aboutus.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowAboutUs2Binding
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerAboutUsAdapter(
  public var list: List<AboutUs2RowModel>
) : RecyclerView.Adapter<RecyclerAboutUsAdapter.RowAboutUs2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAboutUs2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_about_us2,parent,false)
    return RowAboutUs2VH(view)
  }

  public override fun onBindViewHolder(holder: RowAboutUs2VH, position: Int): Unit {
    val aboutUs2RowModel = AboutUs2RowModel()
    // TODO uncomment following line after integration with data source
    // val aboutUs2RowModel = list[position]
    holder.binding.aboutUs2RowModel = aboutUs2RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AboutUs2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: AboutUs2RowModel
    ): Unit {
    }
  }

  public inner class RowAboutUs2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAboutUs2Binding = RowAboutUs2Binding.bind(itemView)
  }
}
