package com.gvelesiani.passmanager.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.gvelesiani.passmanager.base.BaseViewModel
import com.gvelesiani.passmanager.helpers.PasswordHashHelperImpl

class HomeViewModel(
    private val passwordHashHelperImpl: PasswordHashHelperImpl
) : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}