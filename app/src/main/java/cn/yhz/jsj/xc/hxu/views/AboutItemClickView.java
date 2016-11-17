package cn.yhz.jsj.xc.hxu.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.yhz.jsj.xc.hxu.downloaddatademo.R;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/16
 * @Version: [v1.0]
 */
public class AboutItemClickView extends RelativeLayout {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/cn.yhz.jsj.xc.hxu" +
            ".downloaddatademo";

    private ImageView ivIcon;


    private TextView tvTitle;


    public AboutItemClickView(Context context) {
        super(context);
        initViews();
    }

    public AboutItemClickView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    public AboutItemClickView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViews();
    }

    public void initViews() {
        View.inflate(getContext(), R.layout.item_click_about, this);
        ivIcon = (ImageView)findViewById(R.id.iv_icon);

        tvTitle = (TextView) findViewById(R.id.tv_title);
    }

    public void setIcon(int id) {
        ivIcon.setImageResource(id);
    }

    public void setTvTitle(String title) {
        tvTitle.setText(title);
    }

}