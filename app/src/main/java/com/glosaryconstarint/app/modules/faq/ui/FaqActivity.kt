package com.glosaryconstarint.app.modules.faq.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityFaqBinding
import com.glosaryconstarint.app.modules.faq.`data`.model.Faq1RowModel
import com.glosaryconstarint.app.modules.faq.`data`.model.Faq2RowModel
import com.glosaryconstarint.app.modules.faq.`data`.viewmodel.FaqVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FaqActivity : BaseActivity<ActivityFaqBinding>(R.layout.activity_faq) {
  private val viewModel: FaqVM by viewModels<FaqVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup301Adapter =
    RecyclerGroup301Adapter(viewModel.recyclerGroup301List.value?:mutableListOf())
    binding.recyclerGroup301.adapter = recyclerGroup301Adapter
    recyclerGroup301Adapter.setOnItemClickListener(
    object : RecyclerGroup301Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Faq1RowModel) {
        onClickRecyclerGroup301(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup301List.observe(this) {
      recyclerGroup301Adapter.updateData(it)
    }
    val recyclerGroup302Adapter =
    RecyclerGroup302Adapter(viewModel.recyclerGroup302List.value?:mutableListOf())
    binding.recyclerGroup302.adapter = recyclerGroup302Adapter
    recyclerGroup302Adapter.setOnItemClickListener(
    object : RecyclerGroup302Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Faq2RowModel) {
        onClickRecyclerGroup302(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup302List.observe(this) {
      recyclerGroup302Adapter.updateData(it)
    }
    binding.faqVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup301(
    view: View,
    position: Int,
    item: Faq1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup302(
    view: View,
    position: Int,
    item: Faq2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "FAQ_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FaqActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
