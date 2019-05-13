package com.farmanlab.kodeinextension

import android.app.Activity
import org.kodein.di.Copy
import org.kodein.di.Kodein
import org.kodein.di.android.kodein
import org.kodein.di.android.retainedSubKodein

inline fun Activity.retainedKodeinWithCopy(crossinline block: Kodein.MainBuilder.() -> Unit) =
    retainedSubKodein(parentKodein = kodein(), copy = Copy.All, init = block)
