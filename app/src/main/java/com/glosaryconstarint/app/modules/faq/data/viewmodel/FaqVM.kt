package com.glosaryconstarint.app.modules.faq.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.faq.`data`.model.Faq1RowModel
import com.glosaryconstarint.app.modules.faq.`data`.model.Faq2RowModel
import com.glosaryconstarint.app.modules.faq.`data`.model.FaqModel
import kotlin.collections.MutableList

public class FaqVM : ViewModel() {
  public val faqModel: MutableLiveData<FaqModel> = MutableLiveData(FaqModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup301List: MutableLiveData<MutableList<Faq1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup302List: MutableLiveData<MutableList<Faq2RowModel>> =
      MutableLiveData(mutableListOf())
}
