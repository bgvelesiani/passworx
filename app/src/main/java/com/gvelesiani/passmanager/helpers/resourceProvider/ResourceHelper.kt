package com.gvelesiani.passmanager.helpers.resourceProvider

import androidx.annotation.StringRes

interface ResourceHelper {
    fun getString(@StringRes stringResId: Int): String
}