package com.glosaryconstarint.app.modules.homescreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityHomeScreenBinding
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen2RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen3RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen4RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen5RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.ImageSliderGroup189Model
import com.glosaryconstarint.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class HomeScreenActivity :
    BaseActivity<ActivityHomeScreenBinding>(R.layout.activity_home_screen) {
  private val imageSliderGroup189Items: ArrayList<ImageSliderGroup189Model> = arrayListOf()

  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup189Adapter = ImageSliderGroup189Adapter(imageSliderGroup189Items,true)
    binding.imageSliderGroup189.adapter = imageSliderGroup189Adapter
    binding.imageSliderGroup189.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup187.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup187.updateIndicatorCounts(binding.imageSliderGroup189.indicatorCount)
    val recyclerFrame6Adapter =
    RecyclerFrame6Adapter(viewModel.recyclerFrame6List.value?:mutableListOf())
    binding.recyclerFrame6.adapter = recyclerFrame6Adapter
    recyclerFrame6Adapter.setOnItemClickListener(
    object : RecyclerFrame6Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeScreen2RowModel) {
        onClickRecyclerFrame6(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame6List.observe(this) {
      recyclerFrame6Adapter.updateData(it)
    }
    val recyclerFrame8Adapter =
    RecyclerFrame8Adapter(viewModel.recyclerFrame8List.value?:mutableListOf())
    binding.recyclerFrame8.adapter = recyclerFrame8Adapter
    recyclerFrame8Adapter.setOnItemClickListener(
    object : RecyclerFrame8Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeScreen3RowModel) {
        onClickRecyclerFrame8(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame8List.observe(this) {
      recyclerFrame8Adapter.updateData(it)
    }
    val recyclerFrame10Adapter =
    RecyclerFrame10Adapter(viewModel.recyclerFrame10List.value?:mutableListOf())
    binding.recyclerFrame10.adapter = recyclerFrame10Adapter
    recyclerFrame10Adapter.setOnItemClickListener(
    object : RecyclerFrame10Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeScreen4RowModel) {
        onClickRecyclerFrame10(view, position, item)
      }
    }
    )
    viewModel.recyclerFrame10List.observe(this) {
      recyclerFrame10Adapter.updateData(it)
    }
    val recyclerCategoriesListAdapter =
    RecyclerCategoriesListAdapter(viewModel.recyclerCategoriesListList.value?:mutableListOf())
    binding.recyclerCategoriesList.adapter = recyclerCategoriesListAdapter
    recyclerCategoriesListAdapter.setOnItemClickListener(
    object : RecyclerCategoriesListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeScreen5RowModel) {
        onClickRecyclerCategoriesList(view, position, item)
      }
    }
    )
    viewModel.recyclerCategoriesListList.observe(this) {
      recyclerCategoriesListAdapter.updateData(it)
    }
    binding.homeScreenVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup189.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup189.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFrame6(
    view: View,
    position: Int,
    item: HomeScreen2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame8(
    view: View,
    position: Int,
    item: HomeScreen3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerFrame10(
    view: View,
    position: Int,
    item: HomeScreen4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerCategoriesList(
    view: View,
    position: Int,
    item: HomeScreen5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "HOME_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
