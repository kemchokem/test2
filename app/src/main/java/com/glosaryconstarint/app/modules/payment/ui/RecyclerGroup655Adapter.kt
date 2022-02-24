package com.glosaryconstarint.app.modules.payment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowPayment1Binding
import com.glosaryconstarint.app.modules.payment.`data`.model.Payment1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup655Adapter(
  public var list: List<Payment1RowModel>
) : RecyclerView.Adapter<RecyclerGroup655Adapter.RowPayment1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPayment1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment1,parent,false)
    return RowPayment1VH(view)
  }

  public override fun onBindViewHolder(holder: RowPayment1VH, position: Int): Unit {
    val payment1RowModel = Payment1RowModel()
    // TODO uncomment following line after integration with data source
    // val payment1RowModel = list[position]
    holder.binding.payment1RowModel = payment1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Payment1RowModel>): Unit {
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
      item: Payment1RowModel
    ): Unit {
    }
  }

  public inner class RowPayment1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPayment1Binding = RowPayment1Binding.bind(itemView)
  }
}
