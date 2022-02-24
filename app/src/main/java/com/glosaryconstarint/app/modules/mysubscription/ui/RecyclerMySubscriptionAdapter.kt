package com.glosaryconstarint.app.modules.mysubscription.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowMySubscription1Binding
import com.glosaryconstarint.app.modules.mysubscription.`data`.model.MySubscription1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerMySubscriptionAdapter(
  public var list: List<MySubscription1RowModel>
) : RecyclerView.Adapter<RecyclerMySubscriptionAdapter.RowMySubscription1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMySubscription1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_subscription1,parent,false)
    return RowMySubscription1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMySubscription1VH, position: Int): Unit {
    val mySubscription1RowModel = MySubscription1RowModel()
    // TODO uncomment following line after integration with data source
    // val mySubscription1RowModel = list[position]
    holder.binding.mySubscription1RowModel = mySubscription1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MySubscription1RowModel>): Unit {
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
      item: MySubscription1RowModel
    ): Unit {
    }
  }

  public inner class RowMySubscription1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMySubscription1Binding = RowMySubscription1Binding.bind(itemView)
  }
}
