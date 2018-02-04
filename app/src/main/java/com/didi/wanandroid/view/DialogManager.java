package com.didi.wanandroid.view;

import android.annotation.SuppressLint;
import android.content.Context;

import android.support.annotation.NonNull;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.didi.wanandroid.R;

/**
 * Created by didi on 2018/2/4.
 */

public class DialogManager {

    public static MaterialDialog progress(Context context, String title){
        return progress(context,title,null);
    }
    /**
     *
     * @param context
     * @param title
     * @param content
     * @return
     */
    public static MaterialDialog progress(Context context, String title, String content){
        return new MaterialDialog.Builder(context)
                .title(title)
                .content(content)
                .progress(true, 0)
                .progressIndeterminateStyle(true)
                .widgetColor(context.getResources().getColor(R.color.colorTab))
                .build();
    }

    /**
     *
     * @param context
     * @param title
     * @param content
     * @param action
     * @return
     */
    public static MaterialDialog base(Context context, String title, String content, final IAction action){
        return new MaterialDialog.Builder(context)
                .title(title)
                .content(content)
                .positiveText(R.string.disagree)
                .negativeText(R.string.disagree)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        action.onAllow();
                        dialog.dismiss();
                    }
                })
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        action.onDisAllow();
                        dialog.dismiss();
                    }
                })
                .build();
    }
}
