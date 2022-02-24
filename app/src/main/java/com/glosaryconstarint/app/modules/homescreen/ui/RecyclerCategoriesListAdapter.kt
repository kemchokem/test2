package com.glosaryconstarint.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowHomeScreen5Binding
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerCategoriesListAdapter(
  public var list: List<HomeScreen5RowModel>
) : RecyclerView.Adapter<RecyclerCategoriesListAdapter.RowHomeScreen5VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeScreen5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_screen5,parent,false)
    return RowHomeScreen5VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeScreen5VH, position: Int): Unit {
    val homeScreen5RowModel = HomeScreen5RowModel()
    // TODO uncomment following line after integration with data source
    // val homeScreen5RowModel = list[position]
    holder.binding.homeScreen5RowModel = homeScreen5RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeScreen5RowModel>): Unit {
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
      item: HomeScreen5RowModel
    ): Unit {
    }
  }

  public inner class RowHomeScreen5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeScreen5Binding = RowHomeScreen5Binding.bind(itemView)
  }
}
