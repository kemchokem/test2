package com.glosaryconstarint.app.modules.myaddresses.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityMyAddressesBinding
import com.glosaryconstarint.app.modules.myaddresses.`data`.model.MyAddresses1RowModel
import com.glosaryconstarint.app.modules.myaddresses.`data`.viewmodel.MyAddressesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MyAddressesActivity :
    BaseActivity<ActivityMyAddressesBinding>(R.layout.activity_my_addresses) {
  private val viewModel: MyAddressesVM by viewModels<MyAddressesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerMyAddressesAdapter =
    RecyclerMyAddressesAdapter(viewModel.recyclerMyAddressesList.value?:mutableListOf())
    binding.recyclerMyAddresses.adapter = recyclerMyAddressesAdapter
    recyclerMyAddressesAdapter.setOnItemClickListener(
    object : RecyclerMyAddressesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyAddresses1RowModel) {
        onClickRecyclerMyAddresses(view, position, item)
      }
    }
    )
    viewModel.recyclerMyAddressesList.observe(this) {
      recyclerMyAddressesAdapter.updateData(it)
    }
    binding.myAddressesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerMyAddresses(
    view: View,
    position: Int,
    item: MyAddresses1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "MY_ADDRESSES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyAddressesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
