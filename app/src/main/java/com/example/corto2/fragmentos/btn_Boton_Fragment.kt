package com.example.corto2.fragmentos

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.corto2.R
import kotlinx.android.synthetic.main.fragment_boton_fragmento.view.*

class btn_Boton_Fragment : Fragment() {
    var listenerTool: SearchNewListener? = null

    companion object {
        fun newInstance(): btn_Boton_Fragment {
            val newFragment = btn_Boton_Fragment()
            return newFragment
        }
    }

    interface SearchNewListener {
        fun clickSiguiente()
        fun clickAtras()

    }

    fun initButtonA(container: View) {
        container.btn_forward.setOnClickListener {
            listenerTool?.clickSiguiente()
        }
    }

    fun initButtonB(container: View) {
        container.btn_previous.setOnClickListener {
            listenerTool?.clickAtras()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_main_content, container, false)
        initButtonA(view)
        initButtonB(view)
        return view
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is SearchNewListener) {
            listenerTool = context
        } else {
            throw RuntimeException("Se necesita una implementación de  la interfaz")

        }
    }

    override fun onDetach() {
        super.onDetach()
        listenerTool = null
    }

}