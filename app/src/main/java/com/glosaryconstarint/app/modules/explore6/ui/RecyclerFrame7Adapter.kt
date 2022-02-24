package com.glosaryconstarint.app.modules.explore6.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore9Binding
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore9RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame7Adapter(
  public var list: List<Explore9RowModel>
) : RecyclerView.Adapter<RecyclerFrame7Adapter.RowExplore9VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore9VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore9,parent,false)
    return RowExplore9VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore9VH, position: Int): Unit {
    val explore9RowModel = Explore9RowModel()
    // TODO uncomment following line after integration with data source
    // val explore9RowModel = list[position]
    holder.binding.explore9RowModel = explore9RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore9RowModel>): Unit {
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
      item: Explore9RowModel
    ): Unit {
    }
  }

  public inner class RowExplore9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore9Binding = RowExplore9Binding.bind(itemView)
  }
}
