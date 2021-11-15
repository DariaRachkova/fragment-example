package com.daria.fragmentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MenuFragment : Fragment() {

    private lateinit var contactButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        contactButton = view.findViewById(R.id.contact_button)

        val contactFragment = ContactFragment()
        contactButton.setOnClickListener{
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, contactFragment)
                ?.commit()
        }


        return view
    }


}