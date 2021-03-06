package com.app.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.presentation.app.CoreApp
import com.app.presentation.error_handler.AppErrorHandler
import com.app.presentation.requester.CoroutinesRequester
import com.app.presentation.requester.Presenter
import com.app.presentation.requester.RequestOption
import com.app.presentation.showToast
import retrofit2.Response

open class AppViewModel : ViewModel() {

    var toggleLoading = mutableStateOf(false)
    private val errorHandler by lazy { AppErrorHandler() }

    private val coroutinesRequester by lazy {
        CoroutinesRequester(object : Presenter {
            override fun showLoading() {
                toggleLoading.value = true
            }

            override fun hideLoading() {
                toggleLoading.value = false
            }

            override fun showError(ex: Throwable) {
                handleError(ex.message ?: return)
            }

            override fun showError(msg: String?) {
                handleError(msg ?: return)
            }
        })
    }

    fun <T : Any> request(
        options: RequestOption = RequestOption.defaultOption(),
        execute: suspend () -> Response<T>,
        completion: (T) -> Unit,
    ) {
        coroutinesRequester.request(
            options = options,
            coroutineScope = viewModelScope,
            execute = { execute() }
        ) {
            completion(it)
        }
    }

    /** handle Errors with Scope of App **/
    fun handleError(msg: String) {
        errorHandler.showError(msg = msg)
    }
}