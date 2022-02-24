package com.glosaryconstarint.app.modules.aboutus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityAboutUsBinding
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs1RowModel
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs2RowModel
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs3RowModel
import com.glosaryconstarint.app.modules.aboutus.`data`.viewmodel.AboutUsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AboutUsActivity : BaseActivity<ActivityAboutUsBinding>(R.layout.activity_about_us) {
  private val viewModel: AboutUsVM by viewModels<AboutUsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup394Adapter =
    RecyclerGroup394Adapter(viewModel.recyclerGroup394List.value?:mutableListOf())
    binding.recyclerGroup394.adapter = recyclerGroup394Adapter
    recyclerGroup394Adapter.setOnItemClickListener(
    object : RecyclerGroup394Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AboutUs1RowModel) {
        onClickRecyclerGroup394(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup394List.observe(this) {
      recyclerGroup394Adapter.updateData(it)
    }
    val recyclerAboutUsAdapter =
    RecyclerAboutUsAdapter(viewModel.recyclerAboutUsList.value?:mutableListOf())
    binding.recyclerAboutUs.adapter = recyclerAboutUsAdapter
    recyclerAboutUsAdapter.setOnItemClickListener(
    object : RecyclerAboutUsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AboutUs2RowModel) {
        onClickRecyclerAboutUs(view, position, item)
      }
    }
    )
    viewModel.recyclerAboutUsList.observe(this) {
      recyclerAboutUsAdapter.updateData(it)
    }
    val recyclerGroup393Adapter =
    RecyclerGroup393Adapter(viewModel.recyclerGroup393List.value?:mutableListOf())
    binding.recyclerGroup393.adapter = recyclerGroup393Adapter
    recyclerGroup393Adapter.setOnItemClickListener(
    object : RecyclerGroup393Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AboutUs3RowModel) {
        onClickRecyclerGroup393(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup393List.observe(this) {
      recyclerGroup393Adapter.updateData(it)
    }
    binding.aboutUsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup394(
    view: View,
    position: Int,
    item: AboutUs1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerAboutUs(
    view: View,
    position: Int,
    item: AboutUs2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup393(
    view: View,
    position: Int,
    item: AboutUs3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "ABOUT_US_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AboutUsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
