package com.glosaryconstarint.app.modules.aboutus.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowAboutUs1Binding
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup394Adapter(
  public var list: List<AboutUs1RowModel>
) : RecyclerView.Adapter<RecyclerGroup394Adapter.RowAboutUs1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAboutUs1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_about_us1,parent,false)
    return RowAboutUs1VH(view)
  }

  public override fun onBindViewHolder(holder: RowAboutUs1VH, position: Int): Unit {
    val aboutUs1RowModel = AboutUs1RowModel()
    // TODO uncomment following line after integration with data source
    // val aboutUs1RowModel = list[position]
    holder.binding.aboutUs1RowModel = aboutUs1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AboutUs1RowModel>): Unit {
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
      item: AboutUs1RowModel
    ): Unit {
    }
  }

  public inner class RowAboutUs1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAboutUs1Binding = RowAboutUs1Binding.bind(itemView)
  }
}
