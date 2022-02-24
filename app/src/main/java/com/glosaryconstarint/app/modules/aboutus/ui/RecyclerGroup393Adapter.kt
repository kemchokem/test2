package com.glosaryconstarint.app.modules.aboutus.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowAboutUs3Binding
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup393Adapter(
  public var list: List<AboutUs3RowModel>
) : RecyclerView.Adapter<RecyclerGroup393Adapter.RowAboutUs3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAboutUs3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_about_us3,parent,false)
    return RowAboutUs3VH(view)
  }

  public override fun onBindViewHolder(holder: RowAboutUs3VH, position: Int): Unit {
    val aboutUs3RowModel = AboutUs3RowModel()
    // TODO uncomment following line after integration with data source
    // val aboutUs3RowModel = list[position]
    holder.binding.aboutUs3RowModel = aboutUs3RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AboutUs3RowModel>): Unit {
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
      item: AboutUs3RowModel
    ): Unit {
    }
  }

  public inner class RowAboutUs3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAboutUs3Binding = RowAboutUs3Binding.bind(itemView)
  }
}
