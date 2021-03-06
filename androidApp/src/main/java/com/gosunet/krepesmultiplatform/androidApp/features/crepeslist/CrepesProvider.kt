package com.gosunet.krepesmultiplatform.androidApp.features.crepeslist

import androidx.ui.tooling.preview.datasource.CollectionPreviewParameterProvider
import com.gosunet.krepesmultiplatform.shared.data.Crepe

class CrepesProvider : CollectionPreviewParameterProvider<Crepe>(
    listOf(
        Crepe("Crepe 1", "Bla bla", "crepe.com", "1.1", "image.com"),
        Crepe("Crepe 2", "Bla bla", "crepe.com", "1.1", "image.com")
    )
)
