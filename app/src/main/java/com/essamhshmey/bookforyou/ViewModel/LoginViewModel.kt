package com.essamhshmey.bookforyou.ViewModel

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel() {

   var l=false

    fun calculiteAge(email: Email,password:String):Boolean {
        //المفروض يكون هنا داله تاخد الائيميل وكلمة السر وتتاكد منهم بس مشيه بلحب
        l=true
        return true
    }
}