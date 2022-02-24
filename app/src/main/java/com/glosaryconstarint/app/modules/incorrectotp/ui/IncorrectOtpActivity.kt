package com.glosaryconstarint.app.modules.incorrectotp.ui

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityIncorrectOtpBinding
import com.glosaryconstarint.app.modules.incorrectotp.`data`.viewmodel.IncorrectOtpVM
import com.google.android.gms.auth.api.phone.SmsRetriever
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.String
import kotlin.Unit

public class IncorrectOtpActivity :
    BaseActivity<ActivityIncorrectOtpBinding>(R.layout.activity_incorrect_otp) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null

  public val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
                         ActivityResultCallback{ 
                         val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE) 
                         getOtpFromMessage(message!!) 
                         })

  private val viewModel: IncorrectOtpVM by viewModels<IncorrectOtpVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    startSmartUserConsent()
    binding.incorrectOtpVM = viewModel
  }

  public override fun onStop(): Unit {
    super.onStop()
    unregisterReceiver(otpViewOtpviewBroadcastReceiver)
  }

  public override fun onStart(): Unit {
    super.onStart()
    registerBroadcastReceiver()
  }

  public override fun setUpClicks(): Unit {
  }

  private fun startSmartUserConsent(): Unit {
    val client = SmsRetriever.getClient(this)
    client.startSmsUserConsent(null)
  }

  private fun registerBroadcastReceiver(): Unit {
    otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
    otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
    object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
      override fun onSuccess(intent: Intent?) {
        getActivityResult.launch(intent)
      }
      override fun onFailure() {

      }
    }
    val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
    registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
  }

  private fun getOtpFromMessage(message: String): Unit {
    val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
    val matcher: Matcher = otpPattern.matcher(message)
    if (matcher.find()) {
      binding.otpViewOtpview?.setText(matcher.group(0))
    }
  }

  public companion object {
    public const val TAG: String = "INCORRECT_OTP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IncorrectOtpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
