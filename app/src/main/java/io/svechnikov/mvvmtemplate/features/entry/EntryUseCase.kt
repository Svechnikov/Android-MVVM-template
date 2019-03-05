package io.svechnikov.mvvmtemplate.features.entry

import io.svechnikov.mvvmtemplate.core.UseCase
import javax.inject.Inject

class EntryUseCase @Inject constructor(): UseCase<Any, Any>() {
    override suspend fun run(params: Any): Any {
        return Unit
    }
}