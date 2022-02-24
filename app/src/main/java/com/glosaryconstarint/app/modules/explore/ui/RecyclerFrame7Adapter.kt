package com.glosaryconstarint.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore3Binding
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame7Adapter(
  public var list: List<Explore3RowModel>
) : RecyclerView.Adapter<RecyclerFrame7Adapter.RowExplore3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore3,parent,false)
    return RowExplore3VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore3VH, position: Int): Unit {
    val explore3RowModel = Explore3RowModel()
    // TODO uncomment following line after integration with data source
    // val explore3RowModel = list[position]
    holder.binding.explore3RowModel = explore3RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore3RowModel>): Unit {
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
      item: Explore3RowModel
    ): Unit {
    }
  }

  public inner class RowExplore3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore3Binding = RowExplore3Binding.bind(itemView)
  }
}
