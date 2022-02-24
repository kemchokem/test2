package com.glosaryconstarint.app.modules.mycart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowMyCart1Binding
import com.glosaryconstarint.app.modules.mycart.`data`.model.MyCart1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup259Adapter(
  public var list: List<MyCart1RowModel>
) : RecyclerView.Adapter<RecyclerGroup259Adapter.RowMyCart1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyCart1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_cart1,parent,false)
    return RowMyCart1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyCart1VH, position: Int): Unit {
    val myCart1RowModel = MyCart1RowModel()
    // TODO uncomment following line after integration with data source
    // val myCart1RowModel = list[position]
    holder.binding.myCart1RowModel = myCart1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyCart1RowModel>): Unit {
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
      item: MyCart1RowModel
    ): Unit {
    }
  }

  public inner class RowMyCart1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyCart1Binding = RowMyCart1Binding.bind(itemView)
  }
}
