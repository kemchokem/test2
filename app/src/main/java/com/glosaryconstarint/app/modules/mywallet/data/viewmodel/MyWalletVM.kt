package com.glosaryconstarint.app.modules.mywallet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.mywallet.`data`.model.MyWallet1RowModel
import com.glosaryconstarint.app.modules.mywallet.`data`.model.MyWalletModel
import kotlin.collections.MutableList

public class MyWalletVM : ViewModel() {
  public val myWalletModel: MutableLiveData<MyWalletModel> = MutableLiveData(MyWalletModel())

  public var navArguments: Bundle? = null

  public val recyclerFrameList: MutableLiveData<MutableList<MyWallet1RowModel>> =
      MutableLiveData(mutableListOf())
}
