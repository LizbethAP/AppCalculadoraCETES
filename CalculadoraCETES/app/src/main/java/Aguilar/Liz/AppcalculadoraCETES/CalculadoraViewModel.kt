package Aguilar.Liz.AppcalculadoraCETES

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG="CalculadoraViewModel"

class CalculadoraViewModel:ViewModel(){
    init{
        Log.d(TAG,"Se creo el viewmodel")
    }
    override fun onCleared (){
        super.onCleared()
        Log.d(TAG,"Se elimino el viewmodel")
    }
}


