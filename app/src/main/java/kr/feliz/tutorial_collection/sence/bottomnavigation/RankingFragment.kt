package kr.feliz.tutorial_collection.sence.bottomnavigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kr.feliz.tutorial_collection.R
import kr.feliz.tutorial_collection.utils.autoCleared

class RankingFragment: Fragment() {

    private var binding by autoCleared<ViewDataBinding>()

    companion object{
        const val TAG: String = "HomeFragment"

        fun newInstance() : RankingFragment {
            return RankingFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "HomeFragment - onCreate() called")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "HomeFragment - onAttach() called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ranking, container, false)
        return binding.root
    }
}