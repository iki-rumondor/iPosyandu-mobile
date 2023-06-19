package com.example.i_posyandu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class data_obat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_obat)

        val type = resources.getStringArray(R.array.type)
        val autocomplete : AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)
        val arrayAddapter = ArrayAdapter(this, R.layout.dropdown_item, type)
        autocomplete.setAdapter(arrayAddapter)
        autocomplete.onItemClickListener = AdapterView.OnItemClickListener{
                adapterView, view, i, l ->
        }
    }
}