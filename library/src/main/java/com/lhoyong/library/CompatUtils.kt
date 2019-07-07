package com.lhoyong.library

import android.content.Context

/**
 * 作者 : andy
 * 日期 : 16/1/21 12:07
 * 邮箱 : andyxialm@gmail.com
 * 描述 : 工具类
 *
 * fixed 2019 / 7 /7
 *
 */
fun dp2px(context: Context, dipValue: Float): Int {
    val scale = context.resources.displayMetrics.density
    return (dipValue * scale + 0.5f).toInt()
}