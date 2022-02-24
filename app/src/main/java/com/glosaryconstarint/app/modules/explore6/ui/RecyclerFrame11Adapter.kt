package com.glosaryconstarint.app.modules.explore6.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore11Binding
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore11RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrame11Adapter(
  public var list: List<Explore11RowModel>
) : RecyclerView.Adapter<RecyclerFrame11Adapter.RowExplore11VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore11VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore11,parent,false)
    return RowExplore11VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore11VH, position: Int): Unit {
    val explore11RowModel = Explore11RowModel()
    // TODO uncomment following line after integration with data source
    // val explore11RowModel = list[position]
    holder.binding.explore11RowModel = explore11RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore11RowModel>): Unit {
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
      item: Explore11RowModel
    ): Unit {
    }
  }

  public inner class RowExplore11VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore11Binding = RowExplore11Binding.bind(itemView)
  }
}
