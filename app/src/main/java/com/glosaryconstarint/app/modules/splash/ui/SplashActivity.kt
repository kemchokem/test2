package com.glosaryconstarint.app.modules.splash.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivitySplashBinding
import com.glosaryconstarint.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.splashVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
