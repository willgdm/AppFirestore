package com.google.firebase.example.fireeats.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.up.rgm33026050.example.fireeats.Filters

/**
 * ViewModel for [br.edu.up.rgm33026050.example.fireeats.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
