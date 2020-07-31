package com.permissionx.app

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.permissionx.library.PermissionX
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var permission= arrayOf(Manifest.permission.CALL_PHONE,Manifest.permission.CAMERA)
        PermissionX.request(this, *permission){ allGranted, deniedList->

        }
    }
}