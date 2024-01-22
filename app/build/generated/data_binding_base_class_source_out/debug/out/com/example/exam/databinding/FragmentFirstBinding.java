// Generated by view binder compiler. Do not edit!
package com.example.exam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.exam.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnfinish;

  @NonNull
  public final Button btnnext;

  @NonNull
  public final Button btnprevious;

  @NonNull
  public final Button buttonFirst;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioButton rd1;

  @NonNull
  public final RadioButton rd2;

  @NonNull
  public final RadioButton rd3;

  @NonNull
  public final RadioButton rd4;

  @NonNull
  public final TextView txtquestion;

  @NonNull
  public final TextView txtwelcome;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnfinish,
      @NonNull Button btnnext, @NonNull Button btnprevious, @NonNull Button buttonFirst,
      @NonNull RadioGroup radioGroup, @NonNull RadioButton rd1, @NonNull RadioButton rd2,
      @NonNull RadioButton rd3, @NonNull RadioButton rd4, @NonNull TextView txtquestion,
      @NonNull TextView txtwelcome) {
    this.rootView = rootView;
    this.btnfinish = btnfinish;
    this.btnnext = btnnext;
    this.btnprevious = btnprevious;
    this.buttonFirst = buttonFirst;
    this.radioGroup = radioGroup;
    this.rd1 = rd1;
    this.rd2 = rd2;
    this.rd3 = rd3;
    this.rd4 = rd4;
    this.txtquestion = txtquestion;
    this.txtwelcome = txtwelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnfinish;
      Button btnfinish = ViewBindings.findChildViewById(rootView, id);
      if (btnfinish == null) {
        break missingId;
      }

      id = R.id.btnnext;
      Button btnnext = ViewBindings.findChildViewById(rootView, id);
      if (btnnext == null) {
        break missingId;
      }

      id = R.id.btnprevious;
      Button btnprevious = ViewBindings.findChildViewById(rootView, id);
      if (btnprevious == null) {
        break missingId;
      }

      id = R.id.button_first;
      Button buttonFirst = ViewBindings.findChildViewById(rootView, id);
      if (buttonFirst == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.rd1;
      RadioButton rd1 = ViewBindings.findChildViewById(rootView, id);
      if (rd1 == null) {
        break missingId;
      }

      id = R.id.rd2;
      RadioButton rd2 = ViewBindings.findChildViewById(rootView, id);
      if (rd2 == null) {
        break missingId;
      }

      id = R.id.rd3;
      RadioButton rd3 = ViewBindings.findChildViewById(rootView, id);
      if (rd3 == null) {
        break missingId;
      }

      id = R.id.rd4;
      RadioButton rd4 = ViewBindings.findChildViewById(rootView, id);
      if (rd4 == null) {
        break missingId;
      }

      id = R.id.txtquestion;
      TextView txtquestion = ViewBindings.findChildViewById(rootView, id);
      if (txtquestion == null) {
        break missingId;
      }

      id = R.id.txtwelcome;
      TextView txtwelcome = ViewBindings.findChildViewById(rootView, id);
      if (txtwelcome == null) {
        break missingId;
      }

      return new FragmentFirstBinding((ConstraintLayout) rootView, btnfinish, btnnext, btnprevious,
          buttonFirst, radioGroup, rd1, rd2, rd3, rd4, txtquestion, txtwelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
