package com.example.smartsell

import android.text.Editable
import javax.crypto.Cipher

data class User(val firstname:String? = null, val lastname:String? = null, val email:String? = null, val phone: Editable? = null, val location:String? = null, val shopname:String? = null, val password:String? = null){

    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.


}
