package com.glosaryconstarint.app.modules.user.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowUser1Binding
import com.glosaryconstarint.app.modules.user.`data`.model.User1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFrameAdapter(
  public var list: List<User1RowModel>
) : RecyclerView.Adapter<RecyclerFrameAdapter.RowUser1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUser1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_user1,parent,false)
    return RowUser1VH(view)
  }

  public override fun onBindViewHolder(holder: RowUser1VH, position: Int): Unit {
    val user1RowModel = User1RowModel()
    // TODO uncomment following line after integration with data source
    // val user1RowModel = list[position]
    holder.binding.user1RowModel = user1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<User1RowModel>): Unit {
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
      item: User1RowModel
    ): Unit {
    }
  }

  public inner class RowUser1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowUser1Binding = RowUser1Binding.bind(itemView)
  }
}
