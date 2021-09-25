package com.ripper.mifavdish.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ripper.mifavdish.R
import com.ripper.mifavdish.databinding.ActivityAddUpdateDishBinding

class AddUpdateDishActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityAddUpdateDishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityAddUpdateDishBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setupActionBar()
    }


    private fun setupActionBar() {
        setSupportActionBar(mBinding.toolbarAddDishActivity)
//        if (mFavDishDetails != null && mFavDishDetails!!.id != 0) {
//            supportActionBar?.let {
//                it.title = resources.getString(R.string.title_edit_dish)
//            }
//        } else {
//            supportActionBar?.let {
//                it.title = resources.getString(R.string.title_add_dish)
//            }
//        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back)

        mBinding.toolbarAddDishActivity.setNavigationOnClickListener { onBackPressed() }
    }

}



