package com.permissionx.library
import androidx.fragment.app.Fragment
/**
 * A simple [Fragment] subclass.
 * Use the [InvisibleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InvisibleFragment : Fragment() {
    private var callback:((Boolean,List<String>)->Unit?)=null

}