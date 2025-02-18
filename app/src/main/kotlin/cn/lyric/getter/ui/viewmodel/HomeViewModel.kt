package cn.lyric.getter.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import cn.lyric.getter.BuildConfig
import cn.lyric.getter.tool.JsonTools
import cn.xiaowine.xkt.SimpleHttpTool.get
import kotlin.collections.set
import kotlin.text.get

class HomeViewModel(private val state: SavedStateHandle) : ViewModel() {
    var scrollY: Int
        get() = state["scrollY"] ?: 0
        set(value) {
            state["scrollY"] = value
        }

    var expanded: Boolean
        get() = state.get<Boolean>("expanded") != false
        set(value) {
            state.set("expanded", value)
        }
    var appRulesVersionValue: String?
        get() = state["appRulesVersionValue"]
        set(value) {
            state["appRulesVersionValue"] = value
        }
    var buildTimeValue: String?
        get() = state["buildTimeValue"]
        set(value) {
            state["buildTimeValue"] = value
        }
}