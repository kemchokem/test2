package com.glosaryconstarint.app.modules.incorrectmobilenumber.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.databinding.RowIncorrectMobileNumber1Binding
import com.glosaryconstarint.app.modules.incorrectmobilenumber.`data`.model.IncorrectMobileNumber1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerIncorrectMobileNumberAdapter(
  public var list: List<IncorrectMobileNumber1RowModel>
) : RecyclerView.Adapter<RecyclerIncorrectMobileNumberAdapter.RowIncorrectMobileNumber1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIncorrectMobileNumber1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_incorrect_mobile_number1,parent,false)
    return RowIncorrectMobileNumber1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIncorrectMobileNumber1VH, position: Int): Unit {
    val incorrectMobileNumber1RowModel = IncorrectMobileNumber1RowModel()
    // TODO uncomment following line after integration with data source
    // val incorrectMobileNumber1RowModel = list[position]
    holder.binding.incorrectMobileNumber1RowModel = incorrectMobileNumber1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IncorrectMobileNumber1RowModel>): Unit {
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
      item: IncorrectMobileNumber1RowModel
    ): Unit {
    }
  }

  public inner class RowIncorrectMobileNumber1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIncorrectMobileNumber1Binding =
        RowIncorrectMobileNumber1Binding.bind(itemView)
  }
}
