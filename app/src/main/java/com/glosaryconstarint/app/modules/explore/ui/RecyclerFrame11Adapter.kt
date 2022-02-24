package com.glosaryconstarint.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore5Binding
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame11Adapter(
  public var list: List<Explore5RowModel>
) : RecyclerView.Adapter<RecyclerFrame11Adapter.RowExplore5VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore5,parent,false)
    return RowExplore5VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore5VH, position: Int): Unit {
    val explore5RowModel = Explore5RowModel()
    // TODO uncomment following line after integration with data source
    // val explore5RowModel = list[position]
    holder.binding.explore5RowModel = explore5RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore5RowModel>): Unit {
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
      item: Explore5RowModel
    ): Unit {
    }
  }

  public inner class RowExplore5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore5Binding = RowExplore5Binding.bind(itemView)
  }
}
