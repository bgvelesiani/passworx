package com.gvelesiani.passworx.helpers.biometrics

import android.content.Context
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.gvelesiani.passworx.R
import com.gvelesiani.passworx.helpers.resourceProvider.ResourceHelper
import java.util.concurrent.Executor

class BiometricsHelperImpl(
    private val resourceHelper: ResourceHelper
) : BiometricsHelper {
    private lateinit var executor: Executor
    private lateinit var biometricPrompt: BiometricPrompt

    override fun authenticate() {
        val promptInfo = BiometricPrompt.PromptInfo.Builder()
            .setTitle(
                resourceHelper.getString(R.string.biometric_auth_title)
            )
            .setSubtitle(resourceHelper.getString(R.string.biometric_auth_subtitle))
            .setNegativeButtonText(resourceHelper.getString(R.string.biometric_auth_negative_button_text))
            .build()
        biometricPrompt.authenticate(promptInfo)
    }

    override fun setupBiometricPrompt(
        fragment: Fragment,
        context: Context,
        success: (Boolean) -> Unit
    ) {
        executor = ContextCompat.getMainExecutor(context)
        biometricPrompt = BiometricPrompt(fragment, executor,
            object : BiometricPrompt.AuthenticationCallback() {
                override fun onAuthenticationSucceeded(
                    result: BiometricPrompt.AuthenticationResult
                ) {
                    super.onAuthenticationSucceeded(result)
                    success.invoke(true)
                }

                override fun onAuthenticationFailed() {
                    super.onAuthenticationFailed()
                    success.invoke(false)
                }
            })
    }
}