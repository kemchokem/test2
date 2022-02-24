package com.glosaryconstarint.app.modules.contactus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.contactus.`data`.model.ContactUsModel

public class ContactUsVM : ViewModel() {
  public val contactUsModel: MutableLiveData<ContactUsModel> = MutableLiveData(ContactUsModel())

  public var navArguments: Bundle? = null
}
