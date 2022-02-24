package com.glosaryconstarint.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowExplore4Binding
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup442Adapter(
  public var list: List<Explore4RowModel>
) : RecyclerView.Adapter<RecyclerGroup442Adapter.RowExplore4VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore4,parent,false)
    return RowExplore4VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore4VH, position: Int): Unit {
    val explore4RowModel = Explore4RowModel()
    // TODO uncomment following line after integration with data source
    // val explore4RowModel = list[position]
    holder.binding.explore4RowModel = explore4RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore4RowModel>): Unit {
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
      item: Explore4RowModel
    ): Unit {
    }
  }

  public inner class RowExplore4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore4Binding = RowExplore4Binding.bind(itemView)
  }
}
