package com.example.hometask_3_recyclerview

import android.content.Context

object CountryListOf {
    private val  stringList = mutableListOf(R.string.chechnya,
        R.string.NG,R.string.AU,R.string.AT,R.string.AZ,R.string.AL,
        R.string.DZ,R.string.AS,R.string.AI,R.string.AO,R.string.AD,
        R.string.AR,R.string.AG,R.string.AM,R.string.AW,R.string.AF,
        R.string.BS,R.string.BD,R.string.BB,
        R.string.BH,R.string.BY,R.string.BZ,R.string.BE,R.string.BJ,
        R.string.BM,R.string.BG,R.string.BO,
        R.string.BR,R.string.KZ,R.string.KG,R.string.BT,R.string.RU,
        R.string.JP,R.string.IN,R.string.ES,R.string.IT,R.string.EG,
        R.string.CU,R.string.UA)




    fun getCountryList(context : Context): MutableList<String>{
        val list : MutableList<String> = mutableListOf()
        stringList.forEach{
            list.add(context.getString(it))
        }

        list.sortBy { it.firstOrNull() }
        return list
    }
}
