// Generated by data binding compiler. Do not edit!
package com.appsmart.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.appsmart.app.R;
import com.appsmart.app.data.model.News;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemNewsBinding extends ViewDataBinding {
  @NonNull
  public final TextView itemArti;

  @NonNull
  public final TextView itemAsma;

  @NonNull
  public final TextView itemAudio;

  @NonNull
  public final TextView itemAyat;

  @NonNull
  public final TextView itemKeterangan;

  @NonNull
  public final TextView itemNama;

  @NonNull
  public final TextView itemNomor;

  @NonNull
  public final TextView itemRukuk;

  @NonNull
  public final TextView itemType;

  @NonNull
  public final TextView itemUrut;

  @Bindable
  protected News mModel;

  protected ItemNewsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView itemArti, TextView itemAsma, TextView itemAudio, TextView itemAyat,
      TextView itemKeterangan, TextView itemNama, TextView itemNomor, TextView itemRukuk,
      TextView itemType, TextView itemUrut) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemArti = itemArti;
    this.itemAsma = itemAsma;
    this.itemAudio = itemAudio;
    this.itemAyat = itemAyat;
    this.itemKeterangan = itemKeterangan;
    this.itemNama = itemNama;
    this.itemNomor = itemNomor;
    this.itemRukuk = itemRukuk;
    this.itemType = itemType;
    this.itemUrut = itemUrut;
  }

  public abstract void setModel(@Nullable News model);

  @Nullable
  public News getModel() {
    return mModel;
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_news, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNewsBinding>inflateInternal(inflater, R.layout.item_news, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_news, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNewsBinding>inflateInternal(inflater, R.layout.item_news, null, false, component);
  }

  public static ItemNewsBinding bind(@NonNull View view) {
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
  public static ItemNewsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNewsBinding)bind(component, view, R.layout.item_news);
  }
}
