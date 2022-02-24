package com.glosaryconstarint.app.modules.privacypolicy.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityPrivacyPolicyBinding
import com.glosaryconstarint.app.modules.privacypolicy.`data`.viewmodel.PrivacyPolicyVM
import kotlin.String
import kotlin.Unit

public class PrivacyPolicyActivity :
    BaseActivity<ActivityPrivacyPolicyBinding>(R.layout.activity_privacy_policy) {
  private val viewModel: PrivacyPolicyVM by viewModels<PrivacyPolicyVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.privacyPolicyVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "PRIVACY_POLICY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PrivacyPolicyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
