package com.glosaryconstarint.app.modules.explore6.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore7Binding
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore7RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame3Adapter(
  public var list: List<Explore7RowModel>
) : RecyclerView.Adapter<RecyclerFrame3Adapter.RowExplore7VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore7VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore7,parent,false)
    return RowExplore7VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore7VH, position: Int): Unit {
    val explore7RowModel = Explore7RowModel()
    // TODO uncomment following line after integration with data source
    // val explore7RowModel = list[position]
    holder.binding.explore7RowModel = explore7RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore7RowModel>): Unit {
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
      item: Explore7RowModel
    ): Unit {
    }
  }

  public inner class RowExplore7VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore7Binding = RowExplore7Binding.bind(itemView)
  }
}
