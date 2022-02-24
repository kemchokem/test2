package com.glosaryconstarint.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowHomeScreen3Binding
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame8Adapter(
  public var list: List<HomeScreen3RowModel>
) : RecyclerView.Adapter<RecyclerFrame8Adapter.RowHomeScreen3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeScreen3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_screen3,parent,false)
    return RowHomeScreen3VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeScreen3VH, position: Int): Unit {
    val homeScreen3RowModel = HomeScreen3RowModel()
    // TODO uncomment following line after integration with data source
    // val homeScreen3RowModel = list[position]
    holder.binding.homeScreen3RowModel = homeScreen3RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeScreen3RowModel>): Unit {
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
      item: HomeScreen3RowModel
    ): Unit {
    }
  }

  public inner class RowHomeScreen3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeScreen3Binding = RowHomeScreen3Binding.bind(itemView)
  }
}
