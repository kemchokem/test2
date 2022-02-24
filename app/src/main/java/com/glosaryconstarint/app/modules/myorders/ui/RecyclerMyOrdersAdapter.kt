package com.glosaryconstarint.app.modules.myorders.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowMyOrders1Binding
import com.glosaryconstarint.app.modules.myorders.`data`.model.MyOrders1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerMyOrdersAdapter(
  public var list: List<MyOrders1RowModel>
) : RecyclerView.Adapter<RecyclerMyOrdersAdapter.RowMyOrders1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyOrders1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_orders1,parent,false)
    return RowMyOrders1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyOrders1VH, position: Int): Unit {
    val myOrders1RowModel = MyOrders1RowModel()
    // TODO uncomment following line after integration with data source
    // val myOrders1RowModel = list[position]
    holder.binding.myOrders1RowModel = myOrders1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyOrders1RowModel>): Unit {
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
      item: MyOrders1RowModel
    ): Unit {
    }
  }

  public inner class RowMyOrders1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyOrders1Binding = RowMyOrders1Binding.bind(itemView)
  }
}
