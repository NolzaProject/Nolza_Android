package nolza.nolza

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.actv_select_lang.*
import nolza.nolza.base.BaseActivity


class SelectLangActivity : BaseActivity() , View.OnClickListener{

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, SelectLangActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.actv_select_lang)
        super.onCreate(savedInstanceState)

    }

    override fun initLayout() {
        btnEnglish.setOnClickListener(this)
        btnChinese.setOnClickListener(this)
        btnJapanese.setOnClickListener(this)
        btnNorway.setOnClickListener(this)
        btnGermany.setOnClickListener(this)
        btnRussia.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnEnglish -> btnEnglish.isSelected = !btnEnglish.isSelected
            R.id.btnChinese -> btnChinese.isSelected = !btnChinese.isSelected
            R.id.btnJapanese -> btnJapanese.isSelected = !btnJapanese.isSelected
            R.id.btnNorway -> btnNorway.isSelected = !btnNorway.isSelected
            R.id.btnGermany -> btnGermany.isSelected = !btnGermany.isSelected
            R.id.btnRussia -> btnRussia.isSelected = !btnRussia.isSelected
        }
    }
}
