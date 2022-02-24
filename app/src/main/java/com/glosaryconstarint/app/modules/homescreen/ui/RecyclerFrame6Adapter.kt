package com.glosaryconstarint.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowHomeScreen2Binding
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame6Adapter(
  public var list: List<HomeScreen2RowModel>
) : RecyclerView.Adapter<RecyclerFrame6Adapter.RowHomeScreen2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeScreen2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_screen2,parent,false)
    return RowHomeScreen2VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeScreen2VH, position: Int): Unit {
    val homeScreen2RowModel = HomeScreen2RowModel()
    // TODO uncomment following line after integration with data source
    // val homeScreen2RowModel = list[position]
    holder.binding.homeScreen2RowModel = homeScreen2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeScreen2RowModel>): Unit {
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
      item: HomeScreen2RowModel
    ): Unit {
    }
  }

  public inner class RowHomeScreen2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeScreen2Binding = RowHomeScreen2Binding.bind(itemView)
  }
}
