package com.glosaryconstarint.app.modules.user.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityUserBinding
import com.glosaryconstarint.app.modules.user.`data`.model.User1RowModel
import com.glosaryconstarint.app.modules.user.`data`.viewmodel.UserVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class UserActivity : BaseActivity<ActivityUserBinding>(R.layout.activity_user) {
  private val viewModel: UserVM by viewModels<UserVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerFrameAdapter =
    RecyclerFrameAdapter(viewModel.recyclerFrameList.value?:mutableListOf())
    binding.recyclerFrame.adapter = recyclerFrameAdapter
    recyclerFrameAdapter.setOnItemClickListener(
    object : RecyclerFrameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : User1RowModel) {
        onClickRecyclerFrame(view, position, item)
      }
    }
    )
    viewModel.recyclerFrameList.observe(this) {
      recyclerFrameAdapter.updateData(it)
    }
    binding.userVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFrame(
    view: View,
    position: Int,
    item: User1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "USER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
