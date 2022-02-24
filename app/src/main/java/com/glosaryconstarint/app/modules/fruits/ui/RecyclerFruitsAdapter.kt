package com.glosaryconstarint.app.modules.fruits.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowFruits1Binding
import com.glosaryconstarint.app.modules.fruits.`data`.model.Fruits1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFruitsAdapter(
  public var list: List<Fruits1RowModel>
) : RecyclerView.Adapter<RecyclerFruitsAdapter.RowFruits1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFruits1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_fruits1,parent,false)
    return RowFruits1VH(view)
  }

  public override fun onBindViewHolder(holder: RowFruits1VH, position: Int): Unit {
    val fruits1RowModel = Fruits1RowModel()
    // TODO uncomment following line after integration with data source
    // val fruits1RowModel = list[position]
    holder.binding.fruits1RowModel = fruits1RowModel
  }

  public override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Fruits1RowModel>): Unit {
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
      item: Fruits1RowModel
    ): Unit {
    }
  }

  public inner class RowFruits1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFruits1Binding = RowFruits1Binding.bind(itemView)
  }
}
