package com.glosaryconstarint.app.modules.explore6.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore10Binding
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore10RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup506Adapter(
  public var list: List<Explore10RowModel>
) : RecyclerView.Adapter<RecyclerGroup506Adapter.RowExplore10VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore10VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore10,parent,false)
    return RowExplore10VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore10VH, position: Int): Unit {
    val explore10RowModel = Explore10RowModel()
    // TODO uncomment following line after integration with data source
    // val explore10RowModel = list[position]
    holder.binding.explore10RowModel = explore10RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore10RowModel>): Unit {
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
      item: Explore10RowModel
    ): Unit {
    }
  }

  public inner class RowExplore10VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore10Binding = RowExplore10Binding.bind(itemView)
  }
}
