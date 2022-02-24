package com.glosaryconstarint.app.modules.mywallet.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowMyWallet1Binding
import com.glosaryconstarint.app.modules.mywallet.`data`.model.MyWallet1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrameAdapter(
  public var list: List<MyWallet1RowModel>
) : RecyclerView.Adapter<RecyclerFrameAdapter.RowMyWallet1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyWallet1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_wallet1,parent,false)
    return RowMyWallet1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyWallet1VH, position: Int): Unit {
    val myWallet1RowModel = MyWallet1RowModel()
    // TODO uncomment following line after integration with data source
    // val myWallet1RowModel = list[position]
    holder.binding.myWallet1RowModel = myWallet1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyWallet1RowModel>): Unit {
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
      item: MyWallet1RowModel
    ): Unit {
    }
  }

  public inner class RowMyWallet1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyWallet1Binding = RowMyWallet1Binding.bind(itemView)
  }
}
