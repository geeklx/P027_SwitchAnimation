package com.liangxiao.switchanimation;

import com.liangxiao.page.animation.Constant;
import com.liangxiao.page.animation.SwitchAnimationUtil;
import com.liangxiao.page.animation.SwitchAnimationUtil.AnimationType;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 初始化动画部分
		Constant.mType = AnimationType.ROTATE;
		new SwitchAnimationUtil().startAnimation(getWindow().getDecorView(),
				Constant.mType);
	}

}
