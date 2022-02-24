package com.glosaryconstarint.app.modules.details.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowDetails1Binding
import com.glosaryconstarint.app.modules.details.`data`.model.Details1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerDetailsAdapter(
  public var list: List<Details1RowModel>
) : RecyclerView.Adapter<RecyclerDetailsAdapter.RowDetails1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetails1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_details1,parent,false)
    return RowDetails1VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetails1VH, position: Int): Unit {
    val details1RowModel = Details1RowModel()
    // TODO uncomment following line after integration with data source
    // val details1RowModel = list[position]
    holder.binding.details1RowModel = details1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Details1RowModel>): Unit {
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
      item: Details1RowModel
    ): Unit {
    }
  }

  public inner class RowDetails1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetails1Binding = RowDetails1Binding.bind(itemView)
  }
}
