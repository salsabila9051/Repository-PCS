// Generated by data binding compiler. Do not edit!
package com.appsmart.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.appsmart.app.R;
import com.appsmart.app.ui.auth.AuthViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton buttonLogin;

  @NonNull
  public final MaterialButton buttonRegister;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextInputEditText editEmail;

  @NonNull
  public final TextInputEditText editPassword;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout;

  @Bindable
  protected AuthViewModel mViewModel;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton buttonLogin, MaterialButton buttonRegister, ConstraintLayout constraintLayout,
      TextInputEditText editEmail, TextInputEditText editPassword, ImageView imageView,
      LinearLayout linearLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonLogin = buttonLogin;
    this.buttonRegister = buttonRegister;
    this.constraintLayout = constraintLayout;
    this.editEmail = editEmail;
    this.editPassword = editPassword;
    this.imageView = imageView;
    this.linearLayout = linearLayout;
  }

  public abstract void setViewModel(@Nullable AuthViewModel viewModel);

  @Nullable
  public AuthViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}
