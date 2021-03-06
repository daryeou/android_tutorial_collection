package kr.feliz.tutorial_collection.utils

import kr.feliz.tutorial_collection.sence.admob.AdmobActivity
import kr.feliz.tutorial_collection.sence.bottomnavigation.BottomNavigationActivity
import kr.feliz.tutorial_collection.sence.callback.CallBackActivity
import kr.feliz.tutorial_collection.sence.customdialog.DialogActivity
import kr.feliz.tutorial_collection.sence.koin.KoinActivity
import kr.feliz.tutorial_collection.sence.layoutpractice.LayoutPracticeActivity
import kr.feliz.tutorial_collection.sence.lottieanimation.LottieActivity
import kr.feliz.tutorial_collection.sence.scrollview.ScrollViewActivity
import kr.feliz.tutorial_collection.sence.shakeanimation.ShakeActivity
import kr.feliz.tutorial_collection.sence.singleton.SingletonActivity
import kr.feliz.tutorial_collection.sence.viewpager.ViewPagerActivity

enum class ClassData(val clazz: Class<out Any>){
    LAYOUT(LayoutPracticeActivity::class.java),
    SHAKE(ShakeActivity::class.java),
    CALLBACK(CallBackActivity::class.java),
    LOTTIE(LottieActivity::class.java),
    ADMOB(AdmobActivity::class.java),
    DIALOG(DialogActivity::class.java),
    SINGLETON(SingletonActivity::class.java),
    SCROLLVIEW(ScrollViewActivity::class.java),
    BOTTOMNAVIGATION(BottomNavigationActivity::class.java),
    VIEWPAGER2(ViewPagerActivity::class.java),
    Koin(KoinActivity::class.java),
}
