package com.example.myapplicationfloracareoffline

import androidx.tracing.perfetto.handshake.protocol.Response
import okhttp3.Interceptor


class AuthInterceptor  : Interceptor{
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {

        val request = chain.request()

        return chain.proceed(request)

    }

}