package com.glosaryconstarint.app.modules.incorrectotp.ui

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.common.api.Status
import kotlin.Unit

public class OtpViewOtpviewBroadcastReceiver : BroadcastReceiver() {
  public var otpBroadcastReceiverListener: OtpBroadcastListener? = null

  public override fun onReceive(context: Context?, intent: Intent?): Unit {
    if (intent?.action == SmsRetriever.SMS_RETRIEVED_ACTION) {
      val extras = intent.extras
      val smsStatus: Status = extras?.get(SmsRetriever.EXTRA_STATUS) as Status
      when (smsStatus.statusCode) {
        CommonStatusCodes.SUCCESS -> {
          val messageIntent: Intent? =
          extras.getParcelable<Intent>(SmsRetriever.EXTRA_CONSENT_INTENT)
          if (messageIntent != null) {
            otpBroadcastReceiverListener?.onSuccess(messageIntent)
          }
        }
        CommonStatusCodes.TIMEOUT -> otpBroadcastReceiverListener?.onFailure()
      }
    }
  }

  public interface OtpBroadcastListener {
    public fun onSuccess(intent: Intent?): Unit {
    }

    public fun onFailure(): Unit {
    }
  }
}
