package com.glosaryconstarint.app.modules.mycart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityMyCartBinding
import com.glosaryconstarint.app.modules.mycart.`data`.model.MyCart1RowModel
import com.glosaryconstarint.app.modules.mycart.`data`.model.MyCart2RowModel
import com.glosaryconstarint.app.modules.mycart.`data`.viewmodel.MyCartVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MyCartActivity : BaseActivity<ActivityMyCartBinding>(R.layout.activity_my_cart) {
  private val viewModel: MyCartVM by viewModels<MyCartVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup259Adapter =
    RecyclerGroup259Adapter(viewModel.recyclerGroup259List.value?:mutableListOf())
    binding.recyclerGroup259.adapter = recyclerGroup259Adapter
    recyclerGroup259Adapter.setOnItemClickListener(
    object : RecyclerGroup259Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyCart1RowModel) {
        onClickRecyclerGroup259(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup259List.observe(this) {
      recyclerGroup259Adapter.updateData(it)
    }
    val recyclerGroup258Adapter =
    RecyclerGroup258Adapter(viewModel.recyclerGroup258List.value?:mutableListOf())
    binding.recyclerGroup258.adapter = recyclerGroup258Adapter
    recyclerGroup258Adapter.setOnItemClickListener(
    object : RecyclerGroup258Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyCart2RowModel) {
        onClickRecyclerGroup258(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup258List.observe(this) {
      recyclerGroup258Adapter.updateData(it)
    }
    binding.myCartVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup259(
    view: View,
    position: Int,
    item: MyCart1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup258(
    view: View,
    position: Int,
    item: MyCart2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "MY_CART_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyCartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
