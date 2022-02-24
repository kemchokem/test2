package com.glosaryconstarint.app.modules.explore.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityExploreBinding
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore1RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore2RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore3RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore4RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore5RowModel
import com.glosaryconstarint.app.modules.explore.`data`.viewmodel.ExploreVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ExploreActivity : BaseActivity<ActivityExploreBinding>(R.layout.activity_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerFrame3Adapter =
    RecyclerFrame3Adapter(viewModel.recyclerFrame3List.value?:mutableListOf())
    binding.recyclerFrame3.adapter = recyclerFrame3Adapter
    recyclerFrame3Adapter.setOnItemClickListener(
    object : RecyclerFrame3Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Explore2RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Explore3RowModel) {
        onClickRecyclerFrame7(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame7List.observe(this) {
      recyclerFrame7Adapter.updateData(it)
    }
    val recyclerGroup442Adapter =
    RecyclerGroup442Adapter(viewModel.recyclerGroup442List.value?:mutableListOf())
    binding.recyclerGroup442.adapter = recyclerGroup442Adapter
    recyclerGroup442Adapter.setOnItemClickListener(
    object : RecyclerGroup442Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore4RowModel) {
        onClickRecyclerGroup442(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup442List.observe(this) {
      recyclerGroup442Adapter.updateData(it)
    }
    val recyclerFrame11Adapter =
    RecyclerFrame11Adapter(viewModel.recyclerFrame11List.value?:mutableListOf())
    binding.recyclerFrame11.adapter = recyclerFrame11Adapter
    recyclerFrame11Adapter.setOnItemClickListener(
    object : RecyclerFrame11Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore5RowModel) {
        onClickRecyclerFrame11(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame11List.observe(this) {
      recyclerFrame11Adapter.updateData(it)
    }
    binding.exploreVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFrame3(
    view: View,
    position: Int,
    item: Explore1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame5(
    view: View,
    position: Int,
    item: Explore2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame7(
    view: View,
    position: Int,
    item: Explore3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup442(
    view: View,
    position: Int,
    item: Explore4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame11(
    view: View,
    position: Int,
    item: Explore5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "EXPLORE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExploreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
