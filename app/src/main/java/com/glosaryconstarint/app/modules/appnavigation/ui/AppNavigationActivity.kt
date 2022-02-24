package com.glosaryconstarint.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseActivity
import com.glosaryconstarint.app.databinding.ActivityAppNavigationBinding
import com.glosaryconstarint.app.modules.aboutus.ui.AboutUsActivity
import com.glosaryconstarint.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.glosaryconstarint.app.modules.contactus.ui.ContactUsActivity
import com.glosaryconstarint.app.modules.correctmobilenumber.ui.CorrectMobileNumberActivity
import com.glosaryconstarint.app.modules.correctotp.ui.CorrectOtpActivity
import com.glosaryconstarint.app.modules.details.ui.DetailsActivity
import com.glosaryconstarint.app.modules.explore.ui.ExploreActivity
import com.glosaryconstarint.app.modules.explore6.ui.Explore6Activity
import com.glosaryconstarint.app.modules.faq.ui.FaqActivity
import com.glosaryconstarint.app.modules.fruits.ui.FruitsActivity
import com.glosaryconstarint.app.modules.homescreen.ui.HomeScreenActivity
import com.glosaryconstarint.app.modules.incorrectmobilenumber.ui.IncorrectMobileNumberActivity
import com.glosaryconstarint.app.modules.incorrectotp.ui.IncorrectOtpActivity
import com.glosaryconstarint.app.modules.loginwithmobile.ui.LoginWithMobileActivity
import com.glosaryconstarint.app.modules.myaddresses.ui.MyAddressesActivity
import com.glosaryconstarint.app.modules.mycart.ui.MyCartActivity
import com.glosaryconstarint.app.modules.myorders.ui.MyOrdersActivity
import com.glosaryconstarint.app.modules.mysubscription.ui.MySubscriptionActivity
import com.glosaryconstarint.app.modules.mywallet.ui.MyWalletActivity
import com.glosaryconstarint.app.modules.otpsent.ui.OtpSentActivity
import com.glosaryconstarint.app.modules.payment.ui.PaymentActivity
import com.glosaryconstarint.app.modules.privacypolicy.ui.PrivacyPolicyActivity
import com.glosaryconstarint.app.modules.splash.ui.SplashActivity
import com.glosaryconstarint.app.modules.termsofservices.ui.TermsOfServicesActivity
import com.glosaryconstarint.app.modules.user.ui.UserActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearMyOrders.setOnClickListener {
      val destIntent = MyOrdersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyAddresses.setOnClickListener {
      val destIntent = MyAddressesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplash.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetails.setOnClickListener {
      val destIntent = DetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearUser.setOnClickListener {
      val destIntent = UserActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFAQ.setOnClickListener {
      val destIntent = FaqActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIncorrectOTP.setOnClickListener {
      val destIntent = IncorrectOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExplore.setOnClickListener {
      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCorrectOTP.setOnClickListener {
      val destIntent = CorrectOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyCart.setOnClickListener {
      val destIntent = MyCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTermsOfServices.setOnClickListener {
      val destIntent = TermsOfServicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPrivacyPolicy.setOnClickListener {
      val destIntent = PrivacyPolicyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCorrectMobileNumber.setOnClickListener {
      val destIntent = CorrectMobileNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearContactUs.setOnClickListener {
      val destIntent = ContactUsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMySubscription.setOnClickListener {
      val destIntent = MySubscriptionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOTPSent.setOnClickListener {
      val destIntent = OtpSentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPayment.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAboutUs.setOnClickListener {
      val destIntent = AboutUsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyWallet.setOnClickListener {
      val destIntent = MyWalletActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExplore1.setOnClickListener {
      val destIntent = Explore6Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeScreen.setOnClickListener {
      val destIntent = HomeScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFruits.setOnClickListener {
      val destIntent = FruitsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginWithMobile.setOnClickListener {
      val destIntent = LoginWithMobileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIncorrectMobileNumber.setOnClickListener {
      val destIntent = IncorrectMobileNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
