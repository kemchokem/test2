package com.glosaryconstarint.app.modules.faq.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowFaq2Binding
import com.glosaryconstarint.app.modules.faq.`data`.model.Faq2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup302Adapter(
  public var list: List<Faq2RowModel>
) : RecyclerView.Adapter<RecyclerGroup302Adapter.RowFaq2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFaq2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_faq2,parent,false)
    return RowFaq2VH(view)
  }

  public override fun onBindViewHolder(holder: RowFaq2VH, position: Int): Unit {
    val faq2RowModel = Faq2RowModel()
    // TODO uncomment following line after integration with data source
    // val faq2RowModel = list[position]
    holder.binding.faq2RowModel = faq2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Faq2RowModel>): Unit {
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
      item: Faq2RowModel
    ): Unit {
    }
  }

  public inner class RowFaq2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFaq2Binding = RowFaq2Binding.bind(itemView)
  }
}
