package com.glosaryconstarint.app.modules.faq.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowFaq1Binding
import com.glosaryconstarint.app.modules.faq.`data`.model.Faq1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup301Adapter(
  public var list: List<Faq1RowModel>
) : RecyclerView.Adapter<RecyclerGroup301Adapter.RowFaq1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFaq1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_faq1,parent,false)
    return RowFaq1VH(view)
  }

  public override fun onBindViewHolder(holder: RowFaq1VH, position: Int): Unit {
    val faq1RowModel = Faq1RowModel()
    // TODO uncomment following line after integration with data source
    // val faq1RowModel = list[position]
    holder.binding.faq1RowModel = faq1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Faq1RowModel>): Unit {
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
      item: Faq1RowModel
    ): Unit {
    }
  }

  public inner class RowFaq1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFaq1Binding = RowFaq1Binding.bind(itemView)
  }
}
