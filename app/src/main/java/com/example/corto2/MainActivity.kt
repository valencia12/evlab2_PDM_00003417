package com.example.corto2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.corto2.fragmentos.MainContentFragment
import com.example.corto2.fragmentos.btn_Boton_Fragment
import java.util.*

class MainActivity : AppCompatActivity(), btn_Boton_Fragment.SearchNewListener{
    override fun clickSiguiente() {

    }

    override fun clickAtras() {
    }

    private lateinit var mainBotonesFragment: btn_Boton_Fragment
    private lateinit var mainImageFragment: MainContentFragment
    private var listimg: ArrayList<String> = ArrayList()
    private var acu= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inflateimg()
        initFragment()
    }
    private fun changeFragment(id: Int, frag: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, frag).commit()
    }
    private fun inflateimg(){
        listimg.add("https://bolavip.com/__export/1544158061231/sites/bolavip/img/2018/12/07/jokertxtulo-1_crop1544158060836.jpg_1693159006.jpg")
        listimg.add("https://thumbs.mic.com/ZDYwZDI1NjEwNiMvTUVJeTJKcTI5T1dlTXZsZnZKc0xQaXpVZ2ZvPS82MHgwOjEyNzl4NTkwLzgwMHg0NTAvZmlsdGVyczpmb3JtYXQoanBlZyk6cXVhbGl0eSg4MCkvaHR0cHM6Ly9zMy5hbWF6b25hd3MuY29tL3BvbGljeW1pYy1pbWFnZXMvdzR4cXB1b2wzcWNnczF3cWxkZjl4ZXZ3YmRhZ3Jkb3R0a3Ayemw0NTBxMDliZnJiNDQya25idm1ldW1mOTh5dy5qcGc.jpg")
        listimg.add("https://img1.ak.crunchyroll.com/i/spire4-tmb/f3178517627e7c3bc07e5e2d9629e3551547303791_fwide.jpg")
        listimg.add("https://vignette.wikia.nocookie.net/leagueoflegends/images/5/5f/Zed_OriginalCentered.jpg/revision/latest/scale-to-width-down/1215?cb=20180414203801")
    }
    private fun initFragment(){

        mainBotonesFragment= btn_Boton_Fragment.newInstance()
        changeFragment(R.id.btn_fragment, mainBotonesFragment)
        mainImageFragment= MainContentFragment.newInstance(listimg[0])
        changeFragment(R.id.img_fragment, mainImageFragment)
    }
}