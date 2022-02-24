package com.glosaryconstarint.app.modules.explore6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityExplore6Binding
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore10RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore11RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore7RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore8RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore9RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.viewmodel.Explore6VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Explore6Activity : BaseActivity<ActivityExplore6Binding>(R.layout.activity_explore6) {
  private val viewModel: Explore6VM by viewModels<Explore6VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerFrame3Adapter =
    RecyclerFrame3Adapter(viewModel.recyclerFrame3List.value?:mutableListOf())
    binding.recyclerFrame3.adapter = recyclerFrame3Adapter
    recyclerFrame3Adapter.setOnItemClickListener(
    object : RecyclerFrame3Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore7RowModel) {
        onClickRecyclerFrame3(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame3List.observe(this) {
      recyclerFrame3Adapter.updateData(it)
    }
    val recyclerFrame5Adapter =
    RecyclerFrame5Adapter(viewModel.recyclerFrame5List.value?:mutableListOf())
    binding.recyclerFrame5.adapter = recyclerFrame5Adapter
    recyclerFrame5Adapter.setOnItemClickListener(
    object : RecyclerFrame5Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore8RowModel) {
        onClickRecyclerFrame5(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame5List.observe(this) {
      recyclerFrame5Adapter.updateData(it)
    }
    val recyclerFrame7Adapter =
    RecyclerFrame7Adapter(viewModel.recyclerFrame7List.value?:mutableListOf())
    binding.recyclerFrame7.adapter = recyclerFrame7Adapter
    recyclerFrame7Adapter.setOnItemClickListener(
    object : RecyclerFrame7Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore9RowModel) {
        onClickRecyclerFrame7(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame7List.observe(this) {
      recyclerFrame7Adapter.updateData(it)
    }
    val recyclerGroup506Adapter =
    RecyclerGroup506Adapter(viewModel.recyclerGroup506List.value?:mutableListOf())
    binding.recyclerGroup506.adapter = recyclerGroup506Adapter
    recyclerGroup506Adapter.setOnItemClickListener(
    object : RecyclerGroup506Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore10RowModel) {
        onClickRecyclerGroup506(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup506List.observe(this) {
      recyclerGroup506Adapter.updateData(it)
    }
    val recyclerFrame11Adapter =
    RecyclerFrame11Adapter(viewModel.recyclerFrame11List.value?:mutableListOf())
    binding.recyclerFrame11.adapter = recyclerFrame11Adapter
    recyclerFrame11Adapter.setOnItemClickListener(
    object : RecyclerFrame11Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore11RowModel) {
        onClickRecyclerFrame11(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame11List.observe(this) {
      recyclerFrame11Adapter.updateData(it)
    }
    binding.explore6VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFrame3(
    view: View,
    position: Int,
    item: Explore7RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame5(
    view: View,
    position: Int,
    item: Explore8RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame7(
    view: View,
    position: Int,
    item: Explore9RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup506(
    view: View,
    position: Int,
    item: Explore10RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame11(
    view: View,
    position: Int,
    item: Explore11RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "EXPLORE6ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Explore6Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
