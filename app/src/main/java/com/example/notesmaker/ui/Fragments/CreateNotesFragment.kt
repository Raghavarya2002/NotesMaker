package com.example.notesmaker.ui.Fragments

import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.notesmaker.databinding.FragmentCreateNotesBinding
import java.util.*


class CreateNotesFragment : Fragment() {

    lateinit var binding: FragmentCreateNotesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCreateNotesBinding.inflate(layoutInflater, container, false)

        binding.btnSaveNotes.setOnClickListener {
            createNotes(it)
        }



        return binding.root

    }

    private fun createNotes(it: View) {
        val title = binding.editTitle.text
        val subtitle = binding.editSubtitle.text
        val notes = binding.editNotes.text

        val d = Date()
        val s: CharSequence = DateFormat.format("MMMM d, yyyy ", d.time)

        Log.e("@@@@", "createNotes:  + $s")
        //1:25:34
    }


}