package com.appsmart.app.ui.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.appsmart.app.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment)

    public fun actionLoginFragmentToMainActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_mainActivity)
  }
}
