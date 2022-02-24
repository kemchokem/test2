package com.glosaryconstarint.app.modules.myaddresses.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowMyAddresses1Binding
import com.glosaryconstarint.app.modules.myaddresses.`data`.model.MyAddresses1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerMyAddressesAdapter(
  public var list: List<MyAddresses1RowModel>
) : RecyclerView.Adapter<RecyclerMyAddressesAdapter.RowMyAddresses1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyAddresses1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_addresses1,parent,false)
    return RowMyAddresses1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyAddresses1VH, position: Int): Unit {
    val myAddresses1RowModel = MyAddresses1RowModel()
    // TODO uncomment following line after integration with data source
    // val myAddresses1RowModel = list[position]
    holder.binding.myAddresses1RowModel = myAddresses1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyAddresses1RowModel>): Unit {
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
      item: MyAddresses1RowModel
    ): Unit {
    }
  }

  public inner class RowMyAddresses1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyAddresses1Binding = RowMyAddresses1Binding.bind(itemView)
  }
}
