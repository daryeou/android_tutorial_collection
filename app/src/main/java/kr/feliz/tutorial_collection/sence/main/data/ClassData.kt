package kr.feliz.tutorial_collection.sence.main.data

import kr.feliz.tutorial_collection.sence.admob.AdmobActivity
import kr.feliz.tutorial_collection.sence.callback.CallBackActivity
import kr.feliz.tutorial_collection.sence.customdialog.DialogActivity
import kr.feliz.tutorial_collection.sence.layoutpractice.LayoutPracticeActivity
import kr.feliz.tutorial_collection.sence.lottieanimation.LottieActivity
import kr.feliz.tutorial_collection.sence.shakeanimation.ShakeActivity

enum class ClassData(val clazz: Class<out Any>){
    LAYOUT(LayoutPracticeActivity::class.java),
    SHAKE(ShakeActivity::class.java),
    CALLBACK(CallBackActivity::class.java),
    LOTTIE(LottieActivity::class.java),
    ADMOB(AdmobActivity::class.java),
    DIALOG(DialogActivity::class.java)
}
