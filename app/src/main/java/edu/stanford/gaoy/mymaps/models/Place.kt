package edu.stanford.gaoy.mymaps.models

import android.accounts.AuthenticatorDescription
import java.io.Serializable

data class Place(val title: String, val description: String, val lat: Double, val long: Double) : Serializable