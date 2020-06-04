package com.github.lhoyong.checkbox

import android.animation.Animator

internal fun Animator.doEnd(
        end: () -> Unit
) {
    addListener(object : Animator.AnimatorListener {
        override fun onAnimationStart(animator: Animator?) = Unit
        override fun onAnimationEnd(animator: Animator?) = end()
        override fun onAnimationCancel(animator: Animator?) = Unit
        override fun onAnimationRepeat(animator: Animator?) = Unit
    })
}