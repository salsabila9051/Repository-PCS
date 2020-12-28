package com.appsmart.app.ui.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.appsmart.app.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToNewsFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_newsFragment2)

    public fun actionHomeFragmentToFavoriteFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_favoriteFragment)

    public fun actionHomeFragmentToProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment)
  }
}
