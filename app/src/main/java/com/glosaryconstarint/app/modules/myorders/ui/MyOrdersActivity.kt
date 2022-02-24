package com.glosaryconstarint.app.modules.myorders.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityMyOrdersBinding
import com.glosaryconstarint.app.modules.myorders.`data`.model.MyOrders1RowModel
import com.glosaryconstarint.app.modules.myorders.`data`.viewmodel.MyOrdersVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MyOrdersActivity : BaseActivity<ActivityMyOrdersBinding>(R.layout.activity_my_orders) {
  private val viewModel: MyOrdersVM by viewModels<MyOrdersVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerMyOrdersAdapter =
    RecyclerMyOrdersAdapter(viewModel.recyclerMyOrdersList.value?:mutableListOf())
    binding.recyclerMyOrders.adapter = recyclerMyOrdersAdapter
    recyclerMyOrdersAdapter.setOnItemClickListener(
    object : RecyclerMyOrdersAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyOrders1RowModel) {
        onClickRecyclerMyOrders(view, position, item)
      }
    }
    )
    viewModel.recyclerMyOrdersList.observe(this) {
      recyclerMyOrdersAdapter.updateData(it)
    }
    binding.myOrdersVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerMyOrders(
    view: View,
    position: Int,
    item: MyOrders1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "MY_ORDERS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyOrdersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
