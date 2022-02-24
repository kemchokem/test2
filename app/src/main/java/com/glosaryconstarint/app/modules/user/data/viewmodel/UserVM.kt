package com.glosaryconstarint.app.modules.user.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.user.`data`.model.User1RowModel
import com.glosaryconstarint.app.modules.user.`data`.model.UserModel
import kotlin.collections.MutableList

public class UserVM : ViewModel() {
  public val userModel: MutableLiveData<UserModel> = MutableLiveData(UserModel())

  public var navArguments: Bundle? = null

  public val recyclerFrameList: MutableLiveData<MutableList<User1RowModel>> =
      MutableLiveData(mutableListOf())
}
