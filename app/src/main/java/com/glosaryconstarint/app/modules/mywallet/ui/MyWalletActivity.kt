package com.glosaryconstarint.app.modules.mywallet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityMyWalletBinding
import com.glosaryconstarint.app.modules.mywallet.`data`.model.MyWallet1RowModel
import com.glosaryconstarint.app.modules.mywallet.`data`.viewmodel.MyWalletVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MyWalletActivity : BaseActivity<ActivityMyWalletBinding>(R.layout.activity_my_wallet) {
  private val viewModel: MyWalletVM by viewModels<MyWalletVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerFrameAdapter =
    RecyclerFrameAdapter(viewModel.recyclerFrameList.value?:mutableListOf())
    binding.recyclerFrame.adapter = recyclerFrameAdapter
    recyclerFrameAdapter.setOnItemClickListener(
    object : RecyclerFrameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyWallet1RowModel) {
        onClickRecyclerFrame(view, position, item)
      }
    }
    )
    viewModel.recyclerFrameList.observe(this) {
      recyclerFrameAdapter.updateData(it)
    }
    binding.myWalletVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFrame(
    view: View,
    position: Int,
    item: MyWallet1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "MY_WALLET_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyWalletActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
