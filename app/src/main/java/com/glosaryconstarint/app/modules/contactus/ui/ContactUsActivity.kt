package com.glosaryconstarint.app.modules.contactus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityContactUsBinding
import com.glosaryconstarint.app.modules.contactus.`data`.viewmodel.ContactUsVM
import kotlin.String
import kotlin.Unit

public class ContactUsActivity :
    BaseActivity<ActivityContactUsBinding>(R.layout.activity_contact_us) {
  private val viewModel: ContactUsVM by viewModels<ContactUsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.contactUsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CONTACT_US_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContactUsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
