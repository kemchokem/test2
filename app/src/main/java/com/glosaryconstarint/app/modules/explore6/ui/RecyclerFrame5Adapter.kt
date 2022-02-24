package com.glosaryconstarint.app.modules.explore6.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore8Binding
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore8RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame5Adapter(
  public var list: List<Explore8RowModel>
) : RecyclerView.Adapter<RecyclerFrame5Adapter.RowExplore8VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore8VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore8,parent,false)
    return RowExplore8VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore8VH, position: Int): Unit {
    val explore8RowModel = Explore8RowModel()
    // TODO uncomment following line after integration with data source
    // val explore8RowModel = list[position]
    holder.binding.explore8RowModel = explore8RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore8RowModel>): Unit {
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
      item: Explore8RowModel
    ): Unit {
    }
  }

  public inner class RowExplore8VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore8Binding = RowExplore8Binding.bind(itemView)
  }
}
