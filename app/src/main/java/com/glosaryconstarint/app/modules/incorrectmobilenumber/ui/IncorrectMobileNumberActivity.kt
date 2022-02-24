package com.glosaryconstarint.app.modules.incorrectmobilenumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityIncorrectMobileNumberBinding
import com.glosaryconstarint.app.modules.incorrectmobilenumber.`data`.model.IncorrectMobileNumber1RowModel
import com.glosaryconstarint.app.modules.incorrectmobilenumber.`data`.viewmodel.IncorrectMobileNumberVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IncorrectMobileNumberActivity :
    BaseActivity<ActivityIncorrectMobileNumberBinding>(R.layout.activity_incorrect_mobile_number) {
  private val viewModel: IncorrectMobileNumberVM by viewModels<IncorrectMobileNumberVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerIncorrectMobileNumberAdapter =
    RecyclerIncorrectMobileNumberAdapter(viewModel.recyclerIncorrectMobileNumberList.value?:mutableListOf())
    binding.recyclerIncorrectMobileNumber.adapter = recyclerIncorrectMobileNumberAdapter
    recyclerIncorrectMobileNumberAdapter.setOnItemClickListener(
    object : RecyclerIncorrectMobileNumberAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncorrectMobileNumber1RowModel) {
        onClickRecyclerIncorrectMobileNumber(view, position, item)
      }
    }
    )
    viewModel.recyclerIncorrectMobileNumberList.observe(this) {
      recyclerIncorrectMobileNumberAdapter.updateData(it)
    }
    binding.incorrectMobileNumberVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerIncorrectMobileNumber(
    view: View,
    position: Int,
    item: IncorrectMobileNumber1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INCORRECT_MOBILE_NUMBER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IncorrectMobileNumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
