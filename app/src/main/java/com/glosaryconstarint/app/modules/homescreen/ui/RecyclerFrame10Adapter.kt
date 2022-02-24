package com.glosaryconstarint.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowHomeScreen4Binding
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame10Adapter(
  public var list: List<HomeScreen4RowModel>
) : RecyclerView.Adapter<RecyclerFrame10Adapter.RowHomeScreen4VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeScreen4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_screen4,parent,false)
    return RowHomeScreen4VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeScreen4VH, position: Int): Unit {
    val homeScreen4RowModel = HomeScreen4RowModel()
    // TODO uncomment following line after integration with data source
    // val homeScreen4RowModel = list[position]
    holder.binding.homeScreen4RowModel = homeScreen4RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeScreen4RowModel>): Unit {
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
      item: HomeScreen4RowModel
    ): Unit {
    }
  }

  public inner class RowHomeScreen4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeScreen4Binding = RowHomeScreen4Binding.bind(itemView)
  }
}
