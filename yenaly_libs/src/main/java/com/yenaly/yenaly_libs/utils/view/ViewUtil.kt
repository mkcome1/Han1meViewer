@file:JvmName("ViewUtil")
@file:Suppress("unused")

package com.yenaly.yenaly_libs.utils.view

import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import androidx.core.view.updateLayoutParams

/**
 * 设置view的margins，设置相对位置margins更符合Google标准
 *
 * @param start  view的开始位
 * @param top    view的顶部
 * @param end    view的结束位
 * @param bottom view的底部
 */
fun View.setMargins(
    start: Int = marginStart,
    top: Int = marginTop,
    end: Int = marginEnd,
    bottom: Int = marginBottom,
) = updateLayoutParams<MarginLayoutParams> {
    setMargins(0, top, 0, bottom)
    marginStart = start
    marginEnd = end
}
